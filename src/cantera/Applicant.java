package cantera;

import java.util.logging.Logger;
/**
 * 
 * @author Kevin Sibaja Granados
 * @author Yoradany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta clase applicant se va a implementar de las 2 interfaces donde va a traer
 * los atributos de las clase PhysicalPerson y Bussiness lo cuales se utilizaran
 * para el registro de cliente.
 */

public class Applicant implements PhysicalPersonInterface, BussinessInterface {

    private String CIF;

    private String nameBusiness;

    private Contact contact;
    private String idCustomer;
    private String DNI;

    public Applicant() {
    }

    public Applicant(String CIF, Contact contact, String idCustomer) {
        this.CIF = CIF;
        this.contact = contact;
        this.idCustomer = idCustomer;
    }

   

    public Applicant(Contact contact, String idCustomer, String DNI) {
        this.contact = contact;
        this.idCustomer = idCustomer;
        this.DNI = DNI;
    }

    /**
     * @return the CIF
     */
    public String getCIF() {
        return CIF;
    }

    /**
     * @param CIF the CIF to set
     */
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    /**
     * @return the nameBusiness
     */
    public String getNameBusiness() {
        return nameBusiness;
    }

    /**
     * @param nameBusiness the nameBusiness to set
     */
    public void setNameBusiness(String nameBusiness) {
        this.nameBusiness = nameBusiness;
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

    /**
     * @return the idCustomer
     */
    public String getIdCustomer() {
        return idCustomer;
    }

    /**
     * @param idCustomer the idCustomer to set
     */
    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
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

    @Override
    public String toString() {
        return "Applicant{" + "CIF=" + CIF + ", nameBusiness=" + nameBusiness +
                ", contact=" + contact + ", idCustomer=" + idCustomer + ", DNI="
                + DNI + '}';
    }
    

    
    
    
    

   
    
}
