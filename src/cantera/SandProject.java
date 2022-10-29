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

public class SandProject {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Contact[] contact = new Contact[100];

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
                int i = 0;
                Contact p = registerPerson();
                for (i = 0; i < contact.length; i++) {
                     if (contact[i] == null) {
                        contact[i] = p;

                        System.out.println(i);
                        break;

                    }
                }
                   
                   

                  

                System.out.println(i);
                for (i = 0; i < contact.length; i++) {

                    System.out.println(contact[i]);
                }

                menu();
                break;
            case 2:
                productRequest();
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

    public boolean verifica(Employee listUser[], String userResponse, String passwordResponse) {

        for (int i = 0; i < listUser.length; i++) {
            if (listUser[i].getPassword().equals(passwordResponse) && listUser[i].getUser().equals(userResponse)) {
                return true;

            }

        }
        return false;
    }

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

            if (verifica(listUser, userResponse, passwordResponse)) {
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

    public static Contact registerPerson() throws IOException {

        System.out.println("Nombre del cliente:");
        String name = br.readLine();
        System.out.println("Identificacion DNI: ");
        String id = br.readLine();
        System.out.println("Dirrecion:");
        String address = br.readLine();
        System.out.println("Numero de telefono:");
        String phone = br.readLine();
        return new Contact(name, id, address, phone);

    }

    public void personRequest() throws IOException {
        boolean correct = true;
        System.out.println("Digite su identificacion");
        String identification = br.readLine();
        //todavia falta arreglar con el arreglo de registrar cliente
        for (int i = 0; i < 10; i++) {
            if (identification.equals(br)) {
                System.out.println("el cliente esta registrado");
                correct = true;
            } else {
                correct = false;
                System.out.println("el cliente no esta registrado");
                personRequest();
            }
        }
        if (correct = true) {
            productRequest();
        }
    }

    public void productRequest() throws IOException {

        System.out.println("tipo de material");
        String materialType = br.readLine();
        System.out.println("Cantida de material(Toneladas)");
        double quantity = Double.parseDouble(br.readLine());
        System.out.println("Precio");
        double price = Double.parseDouble(br.readLine());

        Product product = new Product(materialType, quantity, price);
        System.out.println(product);

    }

}
