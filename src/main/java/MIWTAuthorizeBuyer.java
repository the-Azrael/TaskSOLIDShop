import java.util.Scanner;

public class MIWTAuthorizeBuyer extends MenuItemsWithTree{
    private Scanner scanner = GlobalScanner.getScannerInstance();
    private AuthorizationBuyer authorizationByer;

    public MIWTAuthorizeBuyer(String name, AuthorizationBuyer buyer) {
        super(name);
        this.authorizationByer = buyer;
    }

    private String enterLogin() {
        System.out.println("Введите логин");
        return scanner.next();
    }

    private String enterPass() {
        System.out.println("Введите пароль");
        return scanner.next();
    }

    @Override
    public void execute() {
        Scanner scanner = GlobalScanner.getScannerInstance();
        System.out.println(getName());
        //authorizationByer.authorize(enterLogin(), enterPass());
        authorizationByer.authorize("IvanovII", "vanyaYa");
    }
}
