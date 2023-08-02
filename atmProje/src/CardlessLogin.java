import java.util.Scanner;

public class CardlessLogin {

    public boolean cardless(Login login) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Parolanızı Giriniz: ");
        String parola = scanner.nextLine();
        System.out.print("TC Kimlik Numaranızı Giriniz: ");
        String tcNo = scanner.nextLine();
        if (login.getParola().equals(parola) && login.getTcNo().equals(tcNo)) {
            return true;
        } else {
            return false;
        }
    }
}
