package cantera;

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
