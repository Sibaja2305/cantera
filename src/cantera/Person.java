package cantera;

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
