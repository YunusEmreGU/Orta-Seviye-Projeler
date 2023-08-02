public class Login {

    private String tcNo;
    private int bakiye;
    private String parola;

    public Login(String tcNo, int bakiye, String parola) {
        this.bakiye = bakiye;
        this.tcNo = tcNo;
        this.parola = parola;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }


    public void paraCek(int tutar) {

        if ((bakiye - tutar) < 0) {
            System.out.println("Yetersiz Bakiye: " + bakiye);
        } else {
            bakiye -= tutar;
            System.out.println("Güncel Bakiyeniz: " + bakiye);
        }
    }

    public void paraYatir(int tutar) {
        bakiye += tutar;
        System.out.println("Güncel Bakiyeniz: " + bakiye);

    }

}
