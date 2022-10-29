package cantera;


import cantera.Person;

public class Driver extends Person {

    private boolean license;

    private String idDriver;

    public Driver() {
    }

    public Driver(boolean license, String idDriver) {
        this.license = license;
        this.idDriver = idDriver;
    }

    public Driver(boolean license, String idDriver, String DNI, Contact contact) {
        super(DNI, contact);
        this.license = license;
        this.idDriver = idDriver;
    }

    /**
     * @return the license
     */
    public boolean isLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(boolean license) {
        this.license = license;
    }

    /**
     * @return the idDriver
     */
    public String getIdDriver() {
        return idDriver;
    }

    /**
     * @param idDriver the idDriver to set
     */
    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }

    @Override
    public String toString() {
        return super.toString()+ "Driver{" + "license=" + license + ", idDriver=" 
                + idDriver + '}';
    }
    
}
