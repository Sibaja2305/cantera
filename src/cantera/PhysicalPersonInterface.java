/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cantera;

/**
 *
 * @author yorda
 */
public interface PhysicalPersonInterface {

    /**
     * @return the DNI
     */
    String getDNI();

    /**
     * @return the idCustomer
     */
    String getIdCustomer();

    /**
     * @param DNI the DNI to set
     */
    void setDNI(String DNI);

    /**
     * @param idCustomer the idCustomer to set
     */
    void setIdCustomer(String idCustomer);

    String toString();
    
}
