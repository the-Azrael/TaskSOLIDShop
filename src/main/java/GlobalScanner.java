import java.util.Scanner;

public class GlobalScanner {
    private static Scanner SCANNER_INSTANCE;

    private GlobalScanner() {

    }

    public static Scanner getScannerInstance() {
        if (SCANNER_INSTANCE == null) {
            SCANNER_INSTANCE = new Scanner(System.in);
        }
        return SCANNER_INSTANCE;
    }
}
