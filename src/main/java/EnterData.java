import java.util.Scanner;

public class EnterData {
    private static Scanner scanner = GlobalScanner.getScannerInstance();

    public EnterData() {
    }

    public int enterIntData(String title) {
        System.out.println(title);
        return scanner.nextInt();
    }
}
