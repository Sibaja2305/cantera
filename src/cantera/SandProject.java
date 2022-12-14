package cantera;

import cantera.Contact;
import java.util.Scanner;
import cantera.Employee;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import cantera.Applicant;
import cantera.VehicleRegistration;
import cantera.Person;
import cantera.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega Esta clase contiene todos lo metodos para la
 * ejecucion del programa, ya que cada metodo tiene una funcion en especifico
 * para cada seccion que tiene este programa.
 */
public class SandProject {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Applicant[] contact = new Applicant[100];
    static Request[] requests = new Request[100];
    static Employee listUser[] = new Employee[20];
    static VehicleRegistration vehicleRegistration[] = new VehicleRegistration[100];

    /**
     *
     * @throws IOException
     * @throws ParseException Este menu contiene diferentes opciones las cuales
     * el usuario puede ingresar a la que necesita, como lo es registro de
     * clientes, registro de solicitud, registro de entrada y salida de
     * vehiculo, explosiones de cantera y facturacion.
     */
    public void menu() throws IOException, ParseException {

        int exit = 0;

        int option = 0;
        try {
            option = 0;
            System.out.println("1= Registrar clientes\n2= Registrar solicitudes\n"
                    + "3= Registro de entrada y salida de vehiculo\n"
                    + "4= Explosiones de cantera\n5= Facturacion\n"
                    + "6= Registrar usuario\n"
                    + "7= cerrar sesion \n"
                    + "0= Salir");
            System.out.println("Seleccione una opción");
            option = Integer.parseInt(br.readLine());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Por favor, digitar caracteres numerico");
            login();
        }
        switch (option) {
            case 1:
                int option2;
                System.out.println("1= registrar cliente persona\n2= registrar cliente empresa\n"
                        + "3= Mostrar clientes registrados");
                System.out.println("Seleccione una opción");

                option2 = Integer.parseInt(br.readLine());

                switch (option2) {

                    case 1:
                        saveCustomer();
                        menu();
                        break;

                    case 2:
                        saveBusiness();
                        menu();

                        break;

                    case 3:

                        showClient();
                        menu();
                        break;
                }

            case 2:
                checkCustomer(contact);

                break;
            case 3:
                checkVehicle(requests);

                menu();
                break;
            case 4:
                showRequest();
                menu();
                break;
            case 5:
                showBilling();
                menu();
                break;
            case 6:
                saveEmployee();
                menu();
                break;
            case 7:
                login();
                break;
            case 0:
                System.out.println("Hasta luego");
                exit = 1;
                break;

            default:
                System.out.println("Opcion no disponible, vuelva a digitar otra opcion");
                break;
        }
    }

    /**
     *
     * @param listUser
     * @param userResponse
     * @param passwordResponse
     * @return Metodo para verificar si el usuario y contraseña digitados son
     * correctos con los que esta en el arreglo de listUser.
     *
     */
    public boolean checkUser(Employee listUser[], String userResponse, String passwordResponse) throws IOException, ParseException {

        for (int i = 0; i < listUser.length; i++) {

            try {
                if (listUser[i].getPassword().equals(passwordResponse) && listUser[i].getUser().equals(userResponse)) {
                    return true;
                }
            } catch (NullPointerException e) {
                System.out.println("Usuario o contraseña incorrecta, intente de nuevo");
                login();
            }
        }
        return false;
    }

    /**
     * Este metodo se utiliza para registrar usuarios nuevos al arreglo, se
     * guardara los datos en un contructor.
     *
     * @return @throws IOException
     */
    public static Employee registerEmployee() throws IOException {
        System.out.println("Usuario a registrar");
        String user = br.readLine();
        System.out.println("contraseña");
        String password = br.readLine();
        System.out.println("DNI");
        String DNI = br.readLine();

        return new Employee(user, password, DNI, registerContact());

    }

    /**
     * Este metodo funciona para guardar los datos del empleado en el arreglo
     * listUser, ya guardados podra hacer el login con su user y password.
     *
     * @throws IOException
     */
    public void saveEmployee() throws IOException {
        try {
            int i = 0;
            Employee p = registerEmployee();
            for (i = 0; i < listUser.length; i++) {
                if (listUser[i] == null) {
                    listUser[i] = p;

                    break;
                }
            }
        } catch (IOException iOException) {
            System.out.println("ya no se puede registrar mas usuarios, llego al limite el almacenamiento");
        }

    }

    /**
     * Metodo para solicitar usuario y contraseña y despues de verficado con el
     * metodo checkUser podra ingresar al menu, ya que si no es correcto no
     * podra entrar al menu y debera intentarlo de nuevo.
     *
     * @throws IOException
     */
    public void login() throws IOException, ParseException {
        String userResponse = null;
        String passwordResponse = null;
        Contact user = new Contact("Kevin Sibaja", "Frente al ebais Santa Elena", "kevinsibajah@gmail.com", "84337919");
        Employee employee1 = new Employee("118760208", "1234", "118760208", user);
        listUser[0] = employee1;

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Bienvenido al sistema de Quebradores del Sur");

            System.out.println("Escriba su usuario");
            userResponse = br.readLine();
            System.out.println("Escriba su contraseña");
            passwordResponse = br.readLine();

            if (checkUser(listUser, userResponse, passwordResponse)) {
                System.out.println("Bienvenido " + userResponse);

                menu();

            }
        } catch (IOException iOException) {
        } catch (ParseException parseException) {
        }

    }

    /**
     * Metodo para registrar la informacion personal de cliente, ya que se
     * utiliza un constructor de la clase Contact que contiene los atributos
     * para este metodo.
     *
     * @return
     * @throws IOException
     */
    public static Contact registerContact() throws IOException {

        System.out.println("Nombre:");
        String name = br.readLine();
        System.out.println("Direccion: ");
        String address = br.readLine();
        System.out.println("Email:");
        String email = br.readLine();
        System.out.println("Numero de telefono:");
        String phone = br.readLine();
        return new Contact(name, address, email, phone);
    }

    /**
     * Metodo para registrar una persona cliente, ya que se utiliza un
     * constructor de la clase Applicant que contiene los atributos para este
     * metodo.
     *
     * @return
     * @throws IOException
     */
    public static Applicant registerCustumer() throws IOException {

        System.out.println("id del cliente:");
        String idCustomer = br.readLine();
        System.out.println("Identificacion DNI: ");
        String DNI = br.readLine();

        return new Applicant(registerContact(), idCustomer, DNI);
    }

    /**
     * Metodo para registrar una empresa cliente,ya que se utiliza un
     * constructor de la clase Applicant que contiene los atributos para este
     * metodo.
     *
     * @return
     * @throws IOException
     */
    public static Applicant registerBusiness() throws IOException {

        System.out.println("CIF del cliente:");
        String CIF = br.readLine();
        System.out.println("Id del cliente: ");
        String idCustumer = br.readLine();

        return new Applicant(CIF, registerContact(), idCustumer);
    }

    /**
     * Este metodo funciona para mostrar el arreglo de los clientes y puedan ver
     * que clientes estan guardados.
     */
    public void showClient() {
        int i;
        for (i = 0; i < contact.length; i++) {
            if (contact[i] != null) {
                System.out.println(" cliente " + i + 1 + "\n nombre: " + contact[i].getContact().getName() + "\n Id del cliente: " + contact[i].getIdCustomer()
                        + "\n Identificacion: " + contact[i].getDNI() + "\n Direccion: " + contact[i].getContact().getAddress()
                        + "\n Telefono: " + contact[i].getContact().getPhone() + "\n Email: " + contact[i].getContact().getEmail() + "\n"
                        + " CFI: " + contact[i].getCIF());

                System.out.println("-----------------------------");
            }
        }
    }

    /**
     * Este metodo funciona para registrar a los clientes de personas fisicas y
     * utiliza un contructor que guarda los datos en un arreglo de clientes.
     *
     * @throws IOException
     */
    public void saveCustomer() throws IOException {
        int i = 0;
        Applicant p = registerCustumer();
        for (i = 0; i < contact.length; i++) {
            if (contact[i] == null) {
                contact[i] = p;

                System.out.println("Se registro el cliente: " + contact[i].getContact().getName());
                System.out.println("Con DNI: " + contact[i].getDNI());

                break;
            }
        }
    }

    /**
     * Este metodo guarda a los clientes empresa en el arreglo de clientes, ya
     * que contiene un constructor que es solo para registrar una empresa.
     *
     * @throws IOException
     */
    public void saveBusiness() throws IOException {
        int i;
        Applicant t = registerBusiness();
        for (i = 0; i < contact.length; i++) {
            if (contact[i] == null) {
                contact[i] = t;

                System.out.println("Se registro el cliente: " + contact[i].getContact().getName());
                System.out.println("Con DNI: " + contact[i].getCIF());

                break;
            }
        }
    }

    /**
     * Este metodo registra el producto que el cliente o la empresa necesita y
     * esos datos seran guardados en un contructor de la clase Product donde
     * pasara a la solcitud para hacer guardados en el arreglo.
     *
     * @return
     * @throws IOException
     */
    public static Product productRequest() throws IOException {

        System.out.println("tipo de material");
        String materialType = br.readLine();
        double quantity = 0;
        double price = 0;
        try {
            System.out.println("Cantidad de material(Toneladas)");
            quantity = Double.parseDouble(br.readLine());
            System.out.println("Precio");
            price = Double.parseDouble(br.readLine());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Caracteres digitados no permitidos");
            productRequest();
        }
        return new Product(materialType, quantity, price);
    }

    /**
     * Metodo para registrar la solicitud del cliente con los productos que se
     * registron en el metodo de productRequest y otros atributos para que se
     * pueda guardar en contructor de la Clase Request y almacenarlo en un
     * arreglo.
     *
     * @return
     * @throws IOException
     */
    public static Request registerRequest() throws IOException {
        System.out.println("Id del cliente al que pertenece la solicitud");
        String idCustomerRequest = br.readLine();
        System.out.println("Numero de solicitud");
        String requestNumber = br.readLine();
        String RequestStatus = "tramite";
        Date requestDay = new Date();

       
        return new Request(requestNumber, productRequest(), RequestStatus, requestDay, idCustomerRequest);
    }

    public void saveRequest() throws IOException, ParseException {
        int i = 0;
        Request p = registerRequest();
        for (i = 0; i < requests.length; i++) {
            if (requests[i] == null) {
                requests[i] = p;

                System.out.println("Se registro la solicitud: " + requests[i].getRequestNumber());

                break;
            }
        }

        menu();
    }

    /**
     * Metodo verificara si el cliente que hara la solicitud se encuentra
     * registrado, de los contrario tendra que registrarse antes de crear la
     * solicitud.
     *
     * @param contact
     * @throws IOException
     */
    public void checkCustomer(Applicant contact[]) throws IOException, ParseException {
        try {
            boolean correct = true;
            System.out.println("Id del cliente para comprobar su registro");
            String idResponse = br.readLine();
            for (int i = 0; i < contact.length; i++) {
                if (contact[i].getIdCustomer().equals(idResponse)) {
                    correct = true;

                    break;
                } else {
                    correct = false;

                }

            }
            if (correct == true) {
                System.out.println("El cliente si esta registrado \n"
                        + "Registro de la solicitud");
                saveRequest();
            }
        } catch (Exception e) {

            menu();

        }
    }

    /**
     * Este metodo registrara los datos personales de conductor que vendra a
     * recoger la solicitud que se le hizo a un cliente donde se va a guardar en
     * un contructor de la clase Driver.
     *
     * @return
     * @throws IOException
     */
    public static Driver registerDriver() throws IOException {
        Boolean license;
        System.out.println("DNI del conductor");
        String DNI = br.readLine();
        System.out.println("Tiene licencia (si/no)");
        String licenseResponse = br.readLine();
        if (licenseResponse.equals("si")) {
            license = true;
        } else {
            license = false;
        }
        System.out.println("id de conductor");
        String idDriver = br.readLine();

        return new Driver(license, idDriver, DNI, registerContact());
    }

    /**
     * Este metodo se registrara los datos del vehiculo como lo es matricula y
     * el tipo de vehiculo para asi registrarlo en el arreglo.
     *
     * @return
     * @throws IOException
     */
    public static Vehicle registerVehicle() throws IOException {

        System.out.println("Tipo de vehiculo");
        String vehicleType = br.readLine();
        System.out.println("Matricula del vehiculo");
        String carRegistration = br.readLine();

        return new Vehicle(vehicleType, carRegistration, registerDriver());
    }

    /**
     * En este metedo se registrara la fecha y hora de entrada y salida del
     * vehiculo, se va a guardar los datos de los metodos registerDriver y
     * register Vehicle y los demas atributos para crear un constructor que sera
     * guardado en un arreglo de registro de vehiculos.
     *
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public static VehicleRegistration vehicleRegistration() throws IOException, ParseException {

        double amountLoaded = 0;
        Date entryDate = null;
        Date exitDate = null;
        try {
            System.out.println("Fecha y hora de entrada (yyyy-MM-dd HH:mm:ss)");
            String entryDateResponse = br.readLine();
            entryDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(entryDateResponse);
            System.out.println(entryDate);
            System.out.println("Fecha y hora de salida(yyyy-MM-dd HH:mm:ss)");
            String exitDateResponse = br.readLine();
            exitDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(exitDateResponse);
            System.out.println(exitDate);

        } catch (ParseException parseException) {
            System.out.println("Error al parsear la fecha con fomato 'yyyy-MM-dd HH:mm:ss'. Error = " + parseException);
            vehicleRegistration();
        }
        try {
            System.out.println("Cantidad de material cargado (toneladas)");
            amountLoaded = Double.parseDouble(br.readLine());

        } catch (NumberFormatException numberFormatException) {
            System.out.println("Caracteres digitados no permitidos. Error =" + numberFormatException);
            vehicleRegistration();
        }

        return new VehicleRegistration(entryDate, exitDate, registerVehicle(), amountLoaded);
    }

    public void checkVehicle(Request requests[]) throws IOException, ParseException {
        try {
            boolean correct = true;
            System.out.println("numero de solicitud");
            String numberRequests = br.readLine();
            for (int i = 0; i < requests.length; i++) {
                if (numberRequests.equals(requests[i].getRequestNumber())) {
                    correct = true;

                    break;

                } else {
                    correct = false;

                }

            }
            if (correct) {
                System.out.println("la solicitud si esta registrada ");
                saveVehicle();
            }
        } catch (Exception e) {
            System.out.println("La solicitud no fue encontrada");
            menu();
        }

    }

    public void saveVehicle() throws IOException, ParseException {
        int i = 0;
        VehicleRegistration p = vehicleRegistration();
        for (i = 0; i < vehicleRegistration.length; i++) {
            if (vehicleRegistration[i] == null) {
                vehicleRegistration[i] = p;

                System.out.println("Se registro la solicitud: " + requests[i].getRequestNumber());

                break;
            }
        }
    }

    /**
     * Este metodo muestra toda la factura del cliente, que contiene en el
     * arreglo de contact y requests.
     *
     * @throws IOException
     * @throws ParseException
     */
    public void showBilling() throws IOException, ParseException {
        System.out.println("Id del cliente a facturar");
        String id = br.readLine();
        try {
            for (int i = 0; i < contact.length; i++) {
                if (id.equals(contact[i].getIdCustomer())) {
                      Billing a = registerBilling();
                     System.out.println(" Numero de facturacion: " + a.getBillingNumber() + "\n"
                                + " Nombre de cliente: " + contact[i].getContact().getName() + "\n"
                                + " Direccion: " + contact[i].getContact().getAddress() + "\n"
                                + " Email: " + contact[i].getContact().getEmail() + "\n"
                                + " Telefono: " + contact[i].getContact().getPhone() + "\n"
                                + " CFI: " + contact[i].getCIF() + "\n"
                                + " DNI: " + contact[i].getDNI() + "\n"
                                + " ID cliente: " + contact[i].getIdCustomer());
                     for (int j = 0; j < requests.length; j++) {
                        if (id.equals(requests[j].getIdCustomerRequest())) {
                      
                        System.out.println(" Tipo de material: " + requests[j].getProduct().getMaterialType() + "\n"
                                + " Cantidad de material: " + requests[j].getProduct().getQuantity() + "\n"
                                + " Precio: " + requests[j].getProduct().getPrice() + "\n"
                                + " Precio total: " + a.getTotalPrice());
                        if (requests[j].getRequestStatus().equals("tramite")) {
                            requests[j].setRequestStatus("ejecutado");
                        }
                       
                    }
                    }
                    
                    System.out.println("");
                }

            }

        } catch (IOException iOException) {
            System.out.println("no contiene ninguna solicitud");
            menu();
        }
    }

    /**
     * Este metodo crea el numero de facturacion y el precio total de la
     * factura.
     *
     * @return
     * @throws IOException
     */
    public Billing registerBilling() throws IOException {

        int billing;
        billing = (int) (Math.random() * 99999);
        String billingNumber;
        billingNumber = String.valueOf(billing);
        double totalPrice = 0;
        System.out.println("digite el precio total");
        totalPrice = Double.parseDouble(br.readLine());

        return new Billing(totalPrice, billingNumber);
    }

    /**
     * muestra las solicitudes de que cada cliente.
     */

    public void showRequest() {
        for (int i = 0; i < requests.length; i++) {
            if (requests[i] != null) {
                System.out.println("Se registro la solicitud: " + requests[i].toString());

            }
        }

    }

}
