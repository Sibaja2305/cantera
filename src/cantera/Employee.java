package cantera;
/**
 * 
 *  @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta clase contiene los datos que se necesitan para un empleado que trabaje
 * en la cantera, para que pueda ingresar al menu y con una contraseña y usuario.
 */
public class Employee extends Person {

    private String user;

    private String password;

    private String idEmployee;

    public Employee() {
    }

    public Employee(String user, String password, String idEmployee) {
        this.user = user;
        this.password = password;
        this.idEmployee = idEmployee;
    }

    public Employee(String user, String password, String idEmployee, String DNI, Contact contact) {
        super(DNI, contact);
        this.user = user;
        this.password = password;
        this.idEmployee = idEmployee;
    }

   

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the idEmployee
     */
    public String getIdEmployee() {
        return idEmployee;
    }

    /**
     * @param idEmployee the idEmployee to set
     */
    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee{" + "user=" + user + ", password=" 
                + password + ", idEmployee=" + idEmployee + '}';
    }
    
}
