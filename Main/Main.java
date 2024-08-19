package Main;
import PaynowQR.PaynowQR;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a PaynowQR object
        // PaynowQR qrcode = new PaynowQR(Map.of(
        //     "uen", "201403121W",               // Required: UEN of company
        //     "amount", 50.50,                   // Specify amount of money to pay.
        //     "editable", true,                  // Whether or not to allow editing of payment amount. Defaults to false if amount is specified
        //     "expiry", "20201231",              // Set an expiry date for the Paynow QR code (YYYYMMDD). Defaults to 5 years from now.
        //     "refNumber", "GIT-INV-10001",      // Reference number for Paynow Transaction. Useful for payment reconciliation.
        //     "company", "ACME Pte Ltd."         // Company name to embed in the QR code. Optional.
        // ));

        Map<String, Object> opts = new HashMap<>();
        opts.put("uen", "T16GB0003C");              // Required: UEN of company
        opts.put("amount", 1.00);                  // Specify amount of money to pay.
        opts.put("editable", false);                 // Whether or not to allow editing of payment amount. Defaults to false if amount is specified
        opts.put("expiry", "");             // Set an expiry date for the Paynow QR code (YYYYMMDD). Defaults to 5 years from now.
        opts.put("refNumber", "TQINV-10001");     // Reference number for Paynow Transaction. Useful for payment reconciliation.
        opts.put("company", "ACME Pte Ltd.");       // Company name to embed in the QR code. Optional.

        PaynowQR qrcode = new PaynowQR(opts);

        String QRstring = qrcode.output();

        System.out.println(QRstring);
    }
}