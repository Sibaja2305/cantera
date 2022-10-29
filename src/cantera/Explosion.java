package cantera;


import java.util.Date;

public class Explosion {

    private Date explosionTime;

    private String[][] quadrant;

    private int requestQuantity;

    public Explosion() {
    }
    

    public Explosion(Date explosionTime, String[][] quadrant, int requestQuantity) {
        this.explosionTime = explosionTime;
        this.quadrant = quadrant;
        this.requestQuantity = requestQuantity;
    }

    /**
     * @return the explosionTime
     */
    public Date getExplosionTime() {
        return explosionTime;
    }

    /**
     * @param explosionTime the explosionTime to set
     */
    public void setExplosionTime(Date explosionTime) {
        this.explosionTime = explosionTime;
    }

    /**
     * @return the quadrant
     */
    public String[][] getQuadrant() {
        return quadrant;
    }

    /**
     * @param quadrant the quadrant to set
     */
    public void setQuadrant(String[][] quadrant) {
        this.quadrant = quadrant;
    }

    /**
     * @return the requestQuantity
     */
    public int getRequestQuantity() {
        return requestQuantity;
    }

    /**
     * @param requestQuantity the requestQuantity to set
     */
    public void setRequestQuantity(int requestQuantity) {
        this.requestQuantity = requestQuantity;
    }

    @Override
    public String toString() {
        return "Explosion{" + "explosionTime=" + explosionTime + ", quadrant=" 
                + quadrant + ", requestQuantity=" + requestQuantity + '}';
    }
    
}
