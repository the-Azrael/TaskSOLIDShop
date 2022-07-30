public class MIWTRemoveFromBasket extends MenuItemsWithTree{
    private final BuyHistory buyHistory;
    private final EnterData enterData = new EnterData();

    public MIWTRemoveFromBasket(String name, BuyHistory buyHistory) {
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
        buyHistory.getBasket().removeProductByID(enterID(), enterQuantity());
    }
}
