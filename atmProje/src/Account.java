import java.util.Scanner;

public class Account {
    public Account() {
        System.out.println("HOŞGELDİNİZ");
    }

    public void operation(Login login) {
        Scanner scanner = new Scanner(System.in);
        CardLogin cardLogin = new CardLogin();
        CardlessLogin cardlessLogin = new CardlessLogin();
        while (true) {
            System.out.println("1- Kart ile giriş\n" + "2- Kartsız giriş");
            System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                if (cardLogin.card(login)) {
                    while (true) {
                        System.out.println("1- Bakiye Bilgisi\n" + "2- Para çek\n" + "3- Para yatır\n" + "4- Çıkış yap");
                        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
                        int choice2 = scanner.nextInt();
                        if (choice2 == 1) {
                            System.out.println("Bakiyeniz: " + login.getBakiye());
                        } else if (choice2 == 2) {
                            System.out.print("Çekmek istediğiniz tutarı girin: ");
                            int withdraw = scanner.nextInt();
                            scanner.nextLine();
                            login.paraCek(withdraw);
                        } else if (choice2 == 3) {
                            System.out.print("Yatırmak istediğiniz tutarı girin: ");
                            int withdraw = scanner.nextInt();
                            scanner.nextLine();
                            login.paraYatir(withdraw);
                        } else if (choice2 == 4) {
                            System.out.println("Çıkış yapıldı.");
                            break;
                        } else {
                            System.out.println("Hatalı Tuşlama Yaptınız");
                        }
                    }
                }
            }
            if (choice == 2) {
                if (cardlessLogin.cardless(login)) {
                    while (true) {
                        System.out.println("1- Bakiye Bilgisi\n" + "2- Para çek\n" + "3- Para yatır\n" + "4- Çıkış yap");
                        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
                        int choice2 = scanner.nextInt();
                        if (choice2 == 1) {
                            System.out.println("Bakiyeniz: " + login.getBakiye());
                        } else if (choice2 == 2) {
                            System.out.print("Çekmek istediğiniz tutarı girin: ");
                            int withdraw = scanner.nextInt();
                            scanner.nextLine();
                            login.paraCek(withdraw);
                        } else if (choice2 == 3) {
                            System.out.print("Yatırmak istediğiniz tutarı girin: ");
                            int withdraw = scanner.nextInt();
                            scanner.nextLine();
                            login.paraYatir(withdraw);
                        } else if (choice2 == 4) {
                            System.out.println("Çıkış yapıldı.");
                            break;
                        } else {
                            System.out.println("Hatalı Tuşlama Yaptınız");
                        }
                    }
                }
            }
        }
    }
}