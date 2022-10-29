package cantera;

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
