public class MIWTExit extends MenuItemsWithTree{
    public MIWTExit(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Спасибо, за посещение нашего магазина. До новых встреч!");
        System.exit(0);
    }
}
