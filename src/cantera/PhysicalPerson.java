package cantera;


import cantera.Person;
/**
 * 
 *  @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta clase se utilizara para registrar a una cliente de tipo persona, ya que
 * contiene los atributos que seran utilizados , ya que estos va a implementar
 * a la clase PhysicalPerson y despues los implema¿entaras en la clase Applicant.
 */
public class PhysicalPerson extends Person implements PhysicalPersonInterface {

    private String idCustomer;
    private String DNI;

    public PhysicalPerson() {
    }

    public PhysicalPerson(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public PhysicalPerson(String idCustomer, String DNI, Contact contact) {
        super(DNI, contact);
        this.idCustomer = idCustomer;
    }

    /**
     * @return the idCustomer
     */
    @Override
    public String getIdCustomer() {
        return idCustomer;
    }

    /**
     * @param idCustomer the idCustomer to set
     */
    @Override
    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * @return the DNI
     */
    @Override
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "PhysicalPerson{" + "idCustomer=" + idCustomer + ", DNI=" + DNI + '}';
    }

   
    
}
