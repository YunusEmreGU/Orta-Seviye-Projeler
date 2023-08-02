public class Main {
    public static void main(String[] args) {
        Login login = new Login("11111111111", 2000, "123456");
        Account account = new Account();
        account.operation(login);
    }
}