/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cantera;

/**
 *
 * @author Hp EliteBook
 */
public interface BussinessInterface {

    /**
     * @return the CIF
     */
    String getCIF();

    /**
     * @return the contact
     */
    Contact getContact();

    /**
     * @return the nameBusiness
     */
    String getNameBusiness();

    /**
     * @param CIF the CIF to set
     */
    void setCIF(String CIF);

    /**
     * @param contact the contact to set
     */
    void setContact(Contact contact);

    /**
     * @param nameBusiness the nameBusiness to set
     */
    void setNameBusiness(String nameBusiness);

    String toString();
    
}
