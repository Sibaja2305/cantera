package cantera;


import cantera.Person;

public class PhysicalPerson extends Person implements  PhysicalPersonInterface {

    private String idCustomer;

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

    @Override
    public String toString() {
        return super.toString()+"PhysicalPerson{" + "idCustomer=" + idCustomer 
                + '}';
    }
    
}
