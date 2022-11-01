package cantera;
/**
 * 
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta clase contiene todos los atributos que se necesita para poder registrar 
 *  empresas en la base de datos de la cantera (arreglo) y su repectivo 
 * contructor para guardar los datos.
 */
public class Business implements  BussinessInterface {

    private String CIF;

    private String nameBusiness;

    private Contact contact;

    public Business() {
    }

    public Business(String CIF, String nameBusiness, Contact contact) {
        this.CIF = CIF;
        this.nameBusiness = nameBusiness;
        this.contact = contact;
    }

    /**
     * @return the CIF
     */
    @Override
    public String getCIF() {
        return CIF;
    }

    /**
     * @param CIF the CIF to set
     */
    @Override
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    /**
     * @return the nameBusiness
     */
    @Override
    public String getNameBusiness() {
        return nameBusiness;
    }

    /**
     * @param nameBusiness the nameBusiness to set
     */
    @Override
    public void setNameBusiness(String nameBusiness) {
        this.nameBusiness = nameBusiness;
    }

    /**
     * @return the contact
     */
    @Override
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    @Override
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return super.toString()+"Business{" + "CIF=" + CIF + ", nameBusiness=" 
                + nameBusiness + ", contact=" + contact + '}';
    }
    
}
