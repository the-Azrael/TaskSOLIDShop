import java.util.Date;

public class BuyHistory {
    private static int historyID = 0;
    private int id;
    private Buyer buyer;
    private Basket basket;
    private boolean isPaid = false;
    private int sum;

    public BuyHistory(Buyer buyer, Basket basket) {
        this.id = ++historyID;
        this.basket = basket;
        this.buyer = buyer;
        this.isPaid = false;
        this.sum = 0;
    }

    public Basket getBasket() {
        return basket;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public int getId() {
        return id;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void show() {
        System.out.println("№ " + getId());
        this.basket.show();
    }
}
