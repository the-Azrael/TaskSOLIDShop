public abstract class MenuItem {
    private String name;
    private int code;
    public abstract void execute();

    public MenuItem(String name) {
        this.name = name;
    }

    public MenuItem(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "[ " + getCode() + " ] - " + getName();
    }

}
