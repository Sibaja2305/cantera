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
import java.text.SimpleDateFormat;
import java.util.Date;

public class SandProject {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PhysicalPerson[] contact = new PhysicalPerson[100];
    static Request[] requests = new Request[100];

    public void menu() throws IOException {

        int exit = 0;

        int opcion = 0;
        System.out.println("1= Registar cliente\n2= Registrar solicitud\n"
                + "3= Registro de entrada y salida de vehiculo\n"
                + "4= Explosiones de cantera\n5= Facturacion\n0= Salir");
        System.out.println("Seleccione una opción");
        opcion = Integer.parseInt(br.readLine());
        switch (opcion) {
            case 1:
                int opcion2;
                System.out.println("1= registrar cliente persona\n2= registrar cliente empresa\n"
                        + "3= Mostrar clientes registrados");
                System.out.println("Seleccione una opción");

                opcion2 = Integer.parseInt(br.readLine());

                switch (opcion2) {

                    case 1:
                        int i = 0;
                        PhysicalPerson p = registerCustumer();
                        for (i = 0; i < contact.length; i++) {
                            if (contact[i] == null) {
                                contact[i] = p;
                                System.out.println("Se registro el cliente: " + contact[i].getContact());
                                System.out.println("Con DNI: " + contact[i].getDNI());
                                System.out.println("id del cliente: " + contact[i].getIdCustomer());

                                break;
                            }
                        }
                        menu();
                        break;

                    case 2:
                        // No podemos guardar clientes y empresas en un mismo vector
                    /**
                     * 
                     *
                     * Business a = registerBusiness(); for (i = 0; i <
                     * contact.length; i++) { if (contact[i] == null) {
                     * contact[i] = a; System.out.println("Se registro el
                     * cliente: " + contact[i].getContacto());
                     * System.out.println("Con DNI: " + contact[i].getDNI());
                     * System.out.println("Direccion: " +
                     * contact[i].getIdCustomer());
                     *
                     * break; } } menu();
                     *
                     * break;
                     */
                    case 3:
                        for (i = 0; i < contact.length; i++) {
                            if (contact[i] != null) {
                                System.out.println(" cliente " + i + 1 + "\n nombre: " + contact[i].getContact().getName() + "\n Id del cliente: " + contact[i].getIdCustomer()
                                        + "\n Identificacion: " + contact[i].getDNI() + "\n Direccion: " + contact[i].getContact().getAddress()
                                        + "\n Telefono: " + contact[i].getContact().getPhone() + "\n Email: " + contact[i].getContact().getEmail());
                                System.out.println("-----------------------------");
                            }
                        }
                        break;
                }

                menu();
                break;
            case 2:
                checkCustomer(contact);
                menu();
                break;
            case 3:
                VehicleRegistration vehicleRegistration = new VehicleRegistration();
                System.out.println("");
                menu();
                break;
            case 4:
                menu();
                break;
            case 5:
                menu();
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
     * Metodo para vareficar si el usuario y contraseña digitados son correctos
     * @param listUser
     * @param userResponse
     * @param passwordResponse
     * @return 
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
     * Metodo para solicitar usuario y contraseña
     * @throws IOException 
     */
    public void login() throws IOException {
        String userResponse = null;
        String passwordResponse = null;
        Employee listUser[] = new Employee[4];
        Employee employee1 = new Employee("118760208", "1234", "Kevin Sibaja Granados");
        Employee employee2 = new Employee("2", "5678", "604860159");
        Employee employee3 = new Employee("3", "4321", "604760806");
        Employee employee4 = new Employee("4", "8765", "111111111");

        listUser[0] = employee1;
        listUser[1] = employee2;
        listUser[2] = employee3;
        listUser[3] = employee4;

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
            menu();
        }
    }
    /**
     * Metodo para registrar la informacion de contacto del cliente
     * @return
     * @throws IOException 
     */
    public static Contact registerPerson() throws IOException {

        System.out.println("Nombre del cliente:");
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
     * Metodo para registrar una persona cliente
     * @return
     * @throws IOException 
     */
    public static PhysicalPerson registerCustumer() throws IOException {

        System.out.println("id del cliente:");
        String idCustomer = br.readLine();
        System.out.println("Identificacion DNI: ");
        String DNI = br.readLine();

        return new PhysicalPerson(idCustomer, DNI, registerPerson());
    }
/**
 * Metodo para registrar una empresa cliente
 * @return
 * @throws IOException 
 */
    public static Business registerBusiness() throws IOException {

        System.out.println("CIF del cliente:");
        String CIF = br.readLine();
        System.out.println("Nombre de empresa: ");
        String nameBusiness = br.readLine();

        return new Business(CIF, nameBusiness, registerPerson());
    }

   
/**
 * Registra los atributos del producto que se va a registrar en la solicitud
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
 * Metodo para registrar una solicitud
 * @return
 * @throws IOException 
 */
    public static Request registerRequest() throws IOException {
        System.out.println("Numero de solicitud");
        String requestNumber = br.readLine();
        System.out.println("Estado de la solicitud");
        String RequestStatus = br.readLine();
        Date requestDay = new Date();
        System.out.println(requestDay);
       
       // Problema al guardar una solicitud y que este relacionada con el cliente

        return new Request(requestNumber, productRequest(), RequestStatus, requestDay);
    }
/**
 * Metodo para verificar si el cliente que hara la solicitud se encuentra registrado
 * @param contact
 * @throws IOException 
 */
    public void checkCustomer(PhysicalPerson contact[]) throws IOException {
        System.out.println("DNI del cliente");
        String DNIResponse = br.readLine();
        for (int i = 0; i < contact.length; i++) {
            if (contact[i].getDNI().equals(DNIResponse)) {
                registerRequest();
                break;
            }else
                System.out.println("El cliente no se encuentra registrado");
            menu();

        }
  
    }

}
