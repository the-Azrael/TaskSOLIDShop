import java.util.List;

public class Buyers extends LoadedFromJSON{
    private String loadedFileName;
    private List<Buyer> buyersList;

    public Buyers(String loadFileName) {
        super(loadFileName, Buyer.class);
        this.loadedFileName = loadFileName;
        this.buyersList = loadFromJSON();
    }

    public List<Buyer> getBuyersList() {
        return buyersList;
    }

    public Buyer findCurrentBuyer(String login, String pass) {
        for (Buyer b : getBuyersList()) {
            if (b.getLogin().equalsIgnoreCase(login) && b.getPass().equals(pass)) {
                return b;
            }
        }
        return null;
    }
}
