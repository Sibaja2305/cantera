package cantera;
/**
 * 
 *  @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta clase contiene los atributos que contiene un vehiculo que va a registrar
 * cuando se el cliente mande a un conductor a recoger el material que solicito
 * ya que este dato quedara guardado para saber la matricula del vehiculo y el 
 * tipo de vehiculo.
 */
public class Vehicle {

    private String vehicleType;

    private String carRegistration;

    private Driver driver;

    public Vehicle() {
    }
    

    public Vehicle(String vehicleType, String carRegistration, Driver driver) {
        this.vehicleType = vehicleType;
        this.carRegistration = carRegistration;
        this.driver = driver;
    }

    /**
     * @return the vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return the carRegistration
     */
    public String getCarRegistration() {
        return carRegistration;
    }

    /**
     * @param carRegistration the carRegistration to set
     */
    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    /**
     * @return the driver
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleType=" + vehicleType + ", carRegistration=" 
                + carRegistration + ", driver=" + driver + '}';
    }
    
}
