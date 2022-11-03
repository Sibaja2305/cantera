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
import javax.swing.JOptionPane;

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

        int opcion = 0;
        try {
            opcion = 0;
            System.out.println("1= Registar cliente\n2= Registrar solicitud\n"
                    + "3= Registro de entrada y salida de vehiculo\n"
                    + "4= Explosiones de cantera\n5= Facturacion\n"
                    + "6= Registrar usuario\n"
                    + "7= cerrar sesion \n"
                    + "0= Salir");
            System.out.println("Seleccione una opción");
            opcion = Integer.parseInt(br.readLine());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Por favor, digitar caracteres numerico");
            login();
        }
        switch (opcion) {
            case 1:
                int opcion2;
                System.out.println("1= registrar cliente persona\n2= registrar cliente empresa\n"
                        + "3= Mostrar clientes registrados");
                System.out.println("Seleccione una opción");

                opcion2 = Integer.parseInt(br.readLine());

                switch (opcion2) {

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
                        break;
                }

                menu();
                break;
            case 2:
                checkCustomer(contact);
                menu();
                break;
            case 3:
                vehicleRegistration();

                menu();
                break;
            case 4:
                menu();
                break;
            case 5:
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
    public boolean checkUser(Employee listUser[], String userResponse, String passwordResponse) {

        for (int i = 0; i < listUser.length; i++) {
            if (listUser[i].getPassword().equals(passwordResponse) && listUser[i].getUser().equals(userResponse)) {
                return true;
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

        boolean correct = true;

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Bienvenido al sistema de Quebradores del Sur");

            System.out.println("Escriba su usuario");
            userResponse = br.readLine();
            System.out.println("Escriba su contraseña");
            passwordResponse = br.readLine();

            if (checkUser(listUser, userResponse, passwordResponse)) {
                correct = true;

            } else {
                System.out.println("Usuario o contraseña es incorrecto, vuelva a intentarlo");
                correct = false;
            }
        } while (correct == false);
        if (correct) {
            System.out.println("bienvenido " + userResponse);

            menu();

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
            System.out.println("Cantida de material(Toneladas)");
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
        System.out.println("Numero de solicitud");
        String requestNumber = br.readLine();
        System.out.println("Estado de la solicitud");
        String RequestStatus = br.readLine();
        Date requestDay = new Date();

        // Problema al guardar una solicitud y que este relacionada con el cliente
        return new Request(requestNumber, productRequest(), RequestStatus, requestDay);
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
        System.out.println("Id del cliente");
        String idResponse = br.readLine();
        for (int i = 0; i < contact.length; i++) {
            if (contact[i].getIdCustomer().equals(idResponse)) {
                registerRequest();
                break;
            } else {
                System.out.println("El cliente no se encuentra registrado");
            }
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
        System.out.println("id de consuctor");
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

}
