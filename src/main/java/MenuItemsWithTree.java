import java.util.ArrayList;
import java.util.List;

public class MenuItemsWithTree extends MenuItem {
    private static final int START_CODE = 0;
    private MenuItemsWithTree head;
    private MenuItemsWithTree parent;
    private List<MenuItemsWithTree> children;
    private static int elementCode = START_CODE;

    @Override
    public void execute() {
        System.out.println("-----------" + getName() + "-----------");
        for (MenuItemsWithTree item : getChildren()) {
            System.out.println(item.toString());
        }
    }

    public void executeMenuItem(int elementCode) {
        MenuItemsWithTree element = findTreeElementByCode(elementCode, null);
        try {
            element.execute();
        } catch (Exception e) {
            System.out.println("Такого пункта в меню нет!");
        }
    }

    public MenuItemsWithTree(String name) {
        super(name);
        this.head = this;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public void addChild(MenuItemsWithTree element) {
        element.setHead(this.getHead());
        element.setParent(this);
        getChildren().add(element);
        element.setCode(++elementCode);
    }

    public void setParent(MenuItemsWithTree parent) {
        this.parent = parent;
    }

    public void setHead(MenuItemsWithTree head) {
        this.head = head;
    }

    public List<MenuItemsWithTree> getChildren() {
        return children;
    }

    public MenuItemsWithTree getHead() {
        return head;
    }

    public MenuItemsWithTree getParent() {
        return parent;
    }

    public void clear() {
        getChildren().clear();
        elementCode = START_CODE;
    }

    public MenuItemsWithTree findTreeElementByName(String name, MenuItemsWithTree foundedElement) {
        if (this.getName().equals(name)) {
            foundedElement = this;
            return foundedElement;
        } else {
            for (MenuItemsWithTree element : getChildren()) {
                if (element.getName().equals(name)) {
                    foundedElement = element;
                    return foundedElement;
                }
                if (element.getChildren().size() > 0) {
                    foundedElement = element.findTreeElementByName(name, foundedElement);
                }
            }
        }
        return foundedElement;
    }

    public MenuItemsWithTree findTreeElementByCode(int code, MenuItemsWithTree foundedElement) {
        if (this.getCode() == code) {
            foundedElement = this;
            return foundedElement;
        } else {
            for (MenuItemsWithTree element : getChildren()) {
                if (element.getCode() == code) {
                    foundedElement = element;
                    return foundedElement;
                }
                if (element.getChildren().size() > 0) {
                    foundedElement = element.findTreeElementByCode(code, foundedElement);
                }
            }
        }
        return foundedElement;
    }
}
