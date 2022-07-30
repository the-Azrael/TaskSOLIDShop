import java.util.ArrayList;
import java.util.List;

public class BuyHistories {
    private ProductAssortment productAssortment;
    private List<BuyHistory> buyHistories = new ArrayList<>();

    public BuyHistories(ProductAssortment productAssortment) {
        this.productAssortment = productAssortment;
    }

    public List<BuyHistory> getBuyHistories() {
        return buyHistories;
    }

    public BuyHistory addBuyHistory(Buyer buyer) {
        BuyHistory buyHistory = findBuyHistory(buyer);
        if(buyHistory == null) {
            buyHistory = new BuyHistory(buyer, new Basket(productAssortment));
            getBuyHistories().add(buyHistory);
        }
        return buyHistory;
    }

    public boolean isExist(Buyer buyer) {
        BuyHistory existsBuyHistory = findBuyHistory(buyer);
        return existsBuyHistory != null;
    }

    public BuyHistory findBuyHistory(Buyer buyer) {
        for (BuyHistory bh : getBuyHistories()) {
            if (bh.getBuyer().compareTo(buyer) == 0 && !bh.isPaid()) {
                return bh;
            }
        }
        return null;
    }
}
