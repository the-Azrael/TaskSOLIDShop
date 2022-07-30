public class ProductWithQuantity extends Product {
    private static final int ZERO_QUANTITY = 0;
    private int quantity;

    public ProductWithQuantity(int id, String name, int price) {
        super(id, name, price);
        this.quantity = ZERO_QUANTITY;
        getSum();
    }

    public ProductWithQuantity(Product product, int quantity) {
        this(product.getId(), product.getName(), product.getPrice());
        if (this.quantity < ZERO_QUANTITY) {
            this.quantity = ZERO_QUANTITY;
        } else {
            this.quantity = quantity;
        }
    }

    public void incQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void decQuantity(int quantity) {
        if (this.quantity - quantity < 0) {
            this.quantity = ZERO_QUANTITY;
        } else {
            this.quantity -= quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSum() {
        int sum = this.quantity * this.getPrice();
        return sum;
    }

    @Override
    public String toString() {
        return getName() + "; " + getPrice() + " руб.; " + getQuantity() + " ед.; " + getSum() + " руб.";
    }
}
