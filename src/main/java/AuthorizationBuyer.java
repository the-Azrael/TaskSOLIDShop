public class AuthorizationBuyer {
    private Buyers buyers;
    private boolean isAuthorized;
    private boolean isBuyerChanged;
    private Buyer currentBuyer;

    public AuthorizationBuyer(Buyers buyers) {
        this.buyers = buyers;
        this.currentBuyer = null;
        this.isAuthorized = false;
        this.isBuyerChanged = false;
    }

    public boolean isAuthorized() {
        return getCurrentBuyer() != null;
    }

    public void setCurrentBuyer(Buyer currentBuyer) {
        this.currentBuyer = currentBuyer;
    }

    public Buyer getCurrentBuyer() {
        return currentBuyer;
    }

    public Buyer authorize(String login, String pass) {
        setCurrentBuyer(buyers.findCurrentBuyer(login, pass));
        return getCurrentBuyer();
    }
}
