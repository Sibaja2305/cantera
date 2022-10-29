package cantera;

import java.util.Date;

public class VehicleRegistration {

    private Date entryTime;

    private Date exitTime;

    private Date entryDate;

    private Date exitDate;

    private Vehicle vehicle;

    private double amountLoaded;

    public VehicleRegistration() {
    }

    public VehicleRegistration(Date entryTime, Date exitTime, Date entryDate, 
            Date exitDate, Vehicle vehicle, double amountLoaded) {
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.vehicle = vehicle;
        this.amountLoaded = amountLoaded;
    }

    /**
     * @return the entryTime
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime the entryTime to set
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return the exitTime
     */
    public Date getExitTime() {
        return exitTime;
    }

    /**
     * @param exitTime the exitTime to set
     */
    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    /**
     * @return the entryDate
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate the entryDate to set
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * @return the exitDate
     */
    public Date getExitDate() {
        return exitDate;
    }

    /**
     * @param exitDate the exitDate to set
     */
    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return the amountLoaded
     */
    public double getAmountLoaded() {
        return amountLoaded;
    }

    /**
     * @param amountLoaded the amountLoaded to set
     */
    public void setAmountLoaded(double amountLoaded) {
        this.amountLoaded = amountLoaded;
    }

    @Override
    public String toString() {
        return "VehicleRegistration{" + "entryTime=" + entryTime + ", exitTime=" 
                + exitTime + ", entryDate=" + entryDate + ", exitDate=" 
                + exitDate + ", vehicle=" + vehicle + ", amountLoaded=" 
                + amountLoaded + '}';
    }
    
}
