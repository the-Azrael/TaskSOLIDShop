import java.util.ArrayList;
import java.util.List;

public class Basket {
    private static final int ZERO = 0;
    private ProductAssortment productAssortment;
    private List<ProductWithQuantity> productList = new ArrayList<>();

    public Basket(ProductAssortment productAssortment) {
        this.productAssortment = productAssortment;
    }

    public void clear() {
        getProductList().clear();
    }

    public ProductWithQuantity findProductInBasketByID(int id) {
        for (ProductWithQuantity pis : getProductList()) {
            if (pis.getId() == id) {
                return pis;
            }
        }
        return null;
    }

    public void addProductByID(int id, int quantity) {
        ProductWithQuantity pis = findProductInBasketByID(id);
        if (pis == null) {
            Product product = productAssortment.getProductById(id);
            pis = new ProductWithQuantity(product, quantity);
            getProductList().add(pis);
        } else {
            pis.incQuantity(quantity);
        }
    }

    public void removeProductByID(int id, int quantity) {
        ProductWithQuantity pis = findProductInBasketByID(id);
        if (pis != null) {
            pis.decQuantity(quantity);
        }
        if (pis.getQuantity() == 0) {
            getProductList().remove(pis);
        }
    }

    public List<ProductWithQuantity> getProductList() {
        return productList;
    }

    public void show() {
        if (!getProductList().isEmpty()) {
            System.out.println("Наименование; Цена; Кол-во; Стоимость");
            getProductList().stream().forEach(System.out::println);
            System.out.println("Итого: " + getCost() + " руб.");
        } else {
            System.out.println("Корзина пуста");
        }
    }

    public int getCost() {
        int sum = 0;
        for (ProductWithQuantity pis : getProductList()) {
            sum += pis.getSum();
        }
        return sum;
    }

    public boolean isEmpty() {
        return getProductList().size() == 0;
    }

}
