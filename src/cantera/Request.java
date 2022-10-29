package cantera;

import java.util.Date;

public class Request {

    private String requestNumber;

    private Product[] product=new Product [100];

    private String RequestStatus;

    private Date requestDay;

    public Request() {
    }

    public Request(String requestNumber, Product[] product, String RequestStatus, Date requestDay) {
        this.requestNumber = requestNumber;
        this.product = product;
        this.RequestStatus = RequestStatus;
        this.requestDay = requestDay;
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
    public Product[] getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product[] product) {
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

    @Override
    public String toString() {
        return "Request{" + "requestNumber=" + requestNumber + ", product=" 
                + product + ", RequestStatus=" + RequestStatus + ", requestDay=" 
                + requestDay + '}';
    }
    
}
