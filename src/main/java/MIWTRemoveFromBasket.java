import java.util.Scanner;

public class MIWTRemoveFromBasket extends MenuItemsWithTree{
    private BuyHistory buyHistory;
    private Scanner scanner = GlobalScanner.getScannerInstance();

    public MIWTRemoveFromBasket(String name, BuyHistory buyHistory) {
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
        buyHistory.getBasket().removeProductByID(enterID(), enterQuantity());
    }
}
