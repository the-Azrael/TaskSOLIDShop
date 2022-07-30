import java.util.Scanner;

public class MIWTAddToBasket extends MenuItemsWithTree {
    private BuyHistory buyHistory;
    private Scanner scanner = GlobalScanner.getScannerInstance();

    public MIWTAddToBasket(String name, BuyHistory buyHistory) {
        super(name);
        this.buyHistory = buyHistory;
    }

    private int enterID() {
        System.out.println("Введите код продукта");
        return scanner.nextInt();
    }

    private int enterQuantity() {
        System.out.println("Введите количество единиц");
        return scanner.nextInt();
    }

    @Override
    public void execute() {
        buyHistory.getBasket().addProductByID(enterID(), enterQuantity());
        buyHistory.show();
    }
}
