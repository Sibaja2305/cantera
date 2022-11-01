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
    

    
    @Override
    public void setIdCustomer(String idCustomer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCIF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contact getContact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameBusiness() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCIF(String CIF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setContact(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNameBusiness(String nameBusiness) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDNI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDNI(String DNI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String getIdCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public String toString() {
        return "Applicant{" + "CIF=" + CIF + ", nameBusiness=" + nameBusiness + ", contact=" + contact + ", idCustomer=" + idCustomer + ", DNI=" + DNI + '}';
    }

    
    

   
    
}
