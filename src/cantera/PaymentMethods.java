package cantera;
/**
 * 
 *  @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Diego Herrera Lopez
 * @author Jefferson Zapata Ortega
 * Esta enumeracion se utilizara para la parte de facturacion y saber con que 
 * metodo de pago va utilizar cada cliente o empresa que viene a pagar las 
 * solicitudes.
 */
public enum PaymentMethods {

    CASH, SINPEMOVIL, DEBITCARD;
    
    public static PaymentMethods getCASH() {
        return CASH;
    }

    public static PaymentMethods getSINPEMOVIL() {
        return SINPEMOVIL;
    }

    public static PaymentMethods getDEBITCARD() {
        return DEBITCARD;
    }
}
