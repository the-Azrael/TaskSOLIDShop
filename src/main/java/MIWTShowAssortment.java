public class MIWTShowAssortment extends MenuItemsWithTree {
    public MIWTShowAssortment(String name) {
        super(name);
    }

    @Override
    public void execute() {
        Main.getMainProductAssortment().show();
    }
}
