public class MIWTShowBasket extends MenuItemsWithTree {
    private BuyHistory buyHistory;

    public MIWTShowBasket(String name, BuyHistory buyHistory) {
        super(name);
        this.buyHistory = buyHistory;
    }

    @Override
    public void execute() {
        buyHistory.getBasket().show();
    }
}
