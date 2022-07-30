public class Shop {
    private static Shop SHOP_INSTANCE;
    private String name;

    private Shop() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Shop getInstance() {
        if (SHOP_INSTANCE == null) {
            SHOP_INSTANCE = new Shop();
        }
        return SHOP_INSTANCE;
    }

    public String getName() {
        return name;
    }

}
