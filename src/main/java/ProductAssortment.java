import java.util.List;

public class ProductAssortment extends LoadedFromJSON {
    private String loadedFileName;
    private List<Product> productsList;

    public ProductAssortment(String loadFileName) {
        super(loadFileName, Product.class);
        this.loadedFileName = loadFileName;
        this.productsList = loadFromJSON();
    }

    public void show() {
        System.out.println("Код; Наименование; Цена в руб.");
        for (Product prod : getProductsList()) {
            System.out.println(prod.toString());
        }
        System.out.println();
    }

    public Product getProductById(int id) {
        for (Product p : getProductsList()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void reload() {
        this.productsList = loadFromJSON();
    }
}
