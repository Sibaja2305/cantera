package cantera;

import java.util.Date;
/**
 * 
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta clase contiene los atributos para la seccion del proyecto para registrar
 * el vehiculo que viene a recoger la cargas que fueron solicitadas por los clientes,
 * contiene sus constructores, get y set y toString.
 */
public class VehicleRegistration {



    private Date entryDate;

    private Date exitDate;

    private Vehicle vehicle;

    private double amountLoaded;

    public VehicleRegistration() {
    }

    public VehicleRegistration(Date entryDate, Date exitDate, Vehicle vehicle, double amountLoaded) {
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.vehicle = vehicle;
        this.amountLoaded = amountLoaded;
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
        return "VehicleRegistration{" + "entryDate=" + entryDate + ", exitDate=" + exitDate + ", vehicle=" + vehicle + ", amountLoaded=" + amountLoaded + '}';
    }

   
}
