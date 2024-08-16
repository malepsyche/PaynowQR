import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a PaynowQR object
        PaynowQR qrcode = new PaynowQR(Map.of(
            "uen", "201403121W",               // Required: UEN of company
            "amount", 50.50,                   // Specify amount of money to pay.
            "editable", true,                  // Whether or not to allow editing of payment amount. Defaults to false if amount is specified
            "expiry", "20201231",              // Set an expiry date for the Paynow QR code (YYYYMMDD). Defaults to 5 years from now.
            "refNumber", "GIT-INV-10001",      // Reference number for Paynow Transaction. Useful for payment reconciliation.
            "company", "ACME Pte Ltd."         // Company name to embed in the QR code. Optional.
        ));

        // Output the QR code string
        String QRstring = qrcode.output();

        // Print the QR string to console
        System.out.println(QRstring);
    }
}