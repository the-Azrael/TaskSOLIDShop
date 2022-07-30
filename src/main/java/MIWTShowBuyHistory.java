public class MIWTShowBuyHistory extends MenuItemsWithTree {
    private BuyHistories buyHistories;
    private Buyer buyer;

    public MIWTShowBuyHistory(String name, BuyHistories buyHistories, Buyer buyer) {
        super(name);
        this.buyer = buyer;
        this.buyHistories = buyHistories;
    }

    @Override
    public void execute() {
        for (BuyHistory bh : buyHistories.getBuyHistories()) {
            if (bh.getBuyer().compareTo(buyer) == 0) {
                bh.show();
            }
        }
    }
}
