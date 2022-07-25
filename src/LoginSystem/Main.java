package LoginSystem;

public class Main {
    public static void main(String[] args) {
        IdsAndPasswords idsAndPasswords = new IdsAndPasswords();
        LoginPage loginPage = new LoginPage(idsAndPasswords.getLogininfo());
    }
}
