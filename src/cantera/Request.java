package cantera;

import java.util.Date;
/**
 * 
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta clase es utilizada para crear la solicitud del cliente y asi registrarlo
 * en un arreglo donde quedara guardado esa solicutd que hizo el cliente o la 
 * empresa.
 */
public class Request {

    private String requestNumber;

    private Product product;

    private String RequestStatus;

    private Date requestDay;
    private String idCustomerRequest;

    public Request() {
    }

    public Request(String requestNumber, Product product, String RequestStatus, Date requestDay, String idCustomerRequest) {
        this.requestNumber = requestNumber;
        this.product = product;
        this.RequestStatus = RequestStatus;
        this.requestDay = requestDay;
        this.idCustomerRequest = idCustomerRequest;
    }

    /**
     * @return the requestNumber
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /**
     * @param requestNumber the requestNumber to set
     */
    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the RequestStatus
     */
    public String getRequestStatus() {
        return RequestStatus;
    }

    /**
     * @param RequestStatus the RequestStatus to set
     */
    public void setRequestStatus(String RequestStatus) {
        this.RequestStatus = RequestStatus;
    }

    /**
     * @return the requestDay
     */
    public Date getRequestDay() {
        return requestDay;
    }

    /**
     * @param requestDay the requestDay to set
     */
    public void setRequestDay(Date requestDay) {
        this.requestDay = requestDay;
    }

    /**
     * @return the idCustomerRequest
     */
    public String getIdCustomerRequest() {
        return idCustomerRequest;
    }

    /**
     * @param idCustomerRequest the idCustomerRequest to set
     */
    public void setIdCustomerRequest(String idCustomerRequest) {
        this.idCustomerRequest = idCustomerRequest;
    }

    @Override
    public String toString() {
        return "Request{" + "requestNumber=" + requestNumber + ", product=" + product + ", RequestStatus=" + RequestStatus + ", requestDay=" + requestDay + ", idCustomerRequest=" + idCustomerRequest + '}';
    }

}
