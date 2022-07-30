public class Main {
    private static final Shop myShop = Shop.getInstance();
    static {
        myShop.setName("Царь горох");
    }
    private static final ProductAssortment mainProductAssortment = new ProductAssortment("./json/Products.json");
    private static final Buyers mainBuyers = new Buyers("./json/Buyers.json");
    private static final BuyHistories mainBuyHistories = new BuyHistories(mainProductAssortment);
    private static final AuthorizationBuyer mainAuthorizationBuyer = new AuthorizationBuyer(mainBuyers);
    private static final MenuItemsWithTree mainMenu = new MenuItemsWithTree("Главное меню");
    private static final EnterData enterData = new EnterData();

    public static ProductAssortment getMainProductAssortment() {
        return mainProductAssortment;
    }

    public static AuthorizationBuyer getMainAuthorizationBuyer() {
        return mainAuthorizationBuyer;
    }

    public static BuyHistories getMainBuyHistories() {
        return mainBuyHistories;
    }

    private static void showBuyerInfo() {
        String buyerName;
        if (!Main.getMainAuthorizationBuyer().isAuthorized()) {
            buyerName = "Клиент";
        } else {
            buyerName = Main.getMainAuthorizationBuyer().getCurrentBuyer().getLogin();
        }
        System.out.println("Добро пожаловать, " + buyerName + "!");
    }

    private static void makeChoice() {
        mainMenu.executeMenuItem(enterData.enterIntData("Выберите пункт меню"));
    }

    private static void exit() {
        new MIWTExit("Выход").execute();
    }

    private static void rebuildMenu() {
        mainMenu.clear();
        mainMenu.addChild(new MIWTAuthorizeBuyer("Авторизация", getMainAuthorizationBuyer()));
        mainMenu.addChild(new MIWTShowAssortment("Показать товары"));
        if (mainAuthorizationBuyer.isAuthorized()) {
            Buyer currentBuyer = mainAuthorizationBuyer.getCurrentBuyer();
            mainMenu.addChild(new MIWTAddToBasket("Добавить товар в корзину",
                    getMainBuyHistories().addBuyHistory(currentBuyer)));
            mainMenu.addChild(new MIWTRemoveFromBasket("Удалить из корзины",
                    getMainBuyHistories().addBuyHistory(currentBuyer)));
            mainMenu.addChild(new MIWTShowBasket("Показать корзину",
                    getMainBuyHistories().addBuyHistory(currentBuyer)));
            mainMenu.addChild(new MIWTDoPay("Оплатить товары",
                    getMainBuyHistories().addBuyHistory(currentBuyer)));
            mainMenu.addChild(new MIWTShowBuyHistory("История покупок", getMainBuyHistories(), currentBuyer));

        }
        mainMenu.addChild(new MIWTExit("Выход"));
    }

    private static void showMenu() {
        mainMenu.execute();
    }

    public static void main(String[] args) {
        System.out.println("Вас приветствует наш магазин \"" + myShop.getName() + "\"");
        mainProductAssortment.reload();
        while (true) {
            rebuildMenu();
            showBuyerInfo();
            showMenu();
            makeChoice();
        }
    }
}
