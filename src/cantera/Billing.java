package cantera;
/**
 * 
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta clase contiene los atributos y contructores para poder crear la factura
 * que va a tener cada cliente a la hora de finalizar sus 25 dias se le hara
 * la factura que podra pagar con todas las solicitudes de los 25 dias.
 */

public class Billing {

    private Request request;

    private double totalPrice;

    private String BillingNumber;

    public Billing() {
    }
    

    public Billing(Request request, double totalPrice, String BillingNumber) {
        this.request = request;
        this.totalPrice = totalPrice;
        this.BillingNumber = BillingNumber;
    }

    /**
     * @return the request
     */
    public Request getRequest() {
        return request;
    }

    /**
     * @param request the request to set
     */
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * @return the totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return the BillingNumber
     */
    public String getBillingNumber() {
        return BillingNumber;
    }

    /**
     * @param BillingNumber the BillingNumber to set
     */
    public void setBillingNumber(String BillingNumber) {
        this.BillingNumber = BillingNumber;
    }

    @Override
    public String toString() {
        return "Billing{" + "request=" + request + ", totalPrice=" + totalPrice 
                + ", BillingNumber=" + BillingNumber + '}';
    }
    
    
}
