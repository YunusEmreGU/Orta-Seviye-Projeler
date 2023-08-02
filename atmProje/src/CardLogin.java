import java.util.Scanner;

public class CardLogin {

    public boolean card(Login login) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen parolanızı giriniz: ");
        String parola = scanner.nextLine();
        if (login.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }
    }


}
