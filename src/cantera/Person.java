package cantera;
/**
 * 
 *  @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta case contiene los atributos de Contact y algunos otros que se va a 
 * necesitar para cada persona que este en la empresa o cliente.
 */
public class Person {

    private String DNI;

    private Contact contact;

    public Person() {
    }

    public Person(String DNI, Contact contact) {
        this.DNI = DNI;
        this.contact = contact;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return super.toString()+ "Person{" + "DNI=" + DNI + ", contact=" + contact + '}';
    }
    
    
    public String getContacto(){
    
    return this.contact.toString();
    
    }
    
}
