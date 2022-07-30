public class MIWTDoPay extends MenuItemsWithTree {
    private BuyHistory buyHistory;

    public MIWTDoPay(String name, BuyHistory buyHistory) {
        super(name);
        this.buyHistory = buyHistory;
    }

    @Override
    public void execute() {
        buyHistory.setPaid(true);
        System.out.println("С вашего счета списано " + buyHistory.getBasket().getCost() + " руб.");
    }
}
