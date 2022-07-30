public class Buyer implements Comparable<Buyer> {
    private int id;
    private String login;
    private String pass;
    private String phoneNumber;

    public Buyer(int id, String login, String pass, String phoneNumber) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "{ " + getId() + "; " + getLogin() + "; " + getPass() + "; " + getPhoneNumber() + "} ";
    }

    @Override
    public int compareTo(Buyer o) {
        return this.getLogin().compareTo(o.getLogin());
    }
}
