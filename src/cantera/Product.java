package cantera;

public class Product {

    private String materialType;

    private double quantity;

    private double price;

    public Product() {
    }

    public Product(String materialType, double quantity, double price) {
        this.materialType = materialType;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * @return the materialType
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * @param materialType the materialType to set
     */
    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "materialType=" + materialType + ", quantity=" 
                + quantity + ", price=" + price + '}';
    }
    
}
