import java.util.Scanner;

public class MIWTAddToBasket extends MenuItemsWithTree {
    private final BuyHistory buyHistory;
    private final EnterData enterData = new EnterData();

    public MIWTAddToBasket(String name, BuyHistory buyHistory) {
        super(name);
        this.buyHistory = buyHistory;
    }

    private int enterID() {
        return enterData.enterIntData("Введите код продукта");
    }

    private int enterQuantity() {
        return enterData.enterIntData("Введите количество единиц");
    }

    @Override
    public void execute() {
        buyHistory.getBasket().addProductByID(enterID(), enterQuantity());
        buyHistory.show();
    }
}
