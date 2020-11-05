import java.util.Scanner;

public class User {

    String username = "RizkiAdam";
    String password = "terbaikselalu";
    boolean statusAkun;

    boolean cekAkun(String parUserName, String parPassword) {
        // berisi validasi pengecekan benar atau salah nya inputan dengan konstanta

        statusAkun = parUserName.equals(username) && parPassword.equals(password);

        System.out.println(statusAkun);

        return statusAkun;
    }

    void hasilLogin(boolean Status, String parUserName) {

        if (statusAkun == true) {
            System.out.println("betul betul betul");
        } else {
            System.out.println("salah");
        }

    }

    public void pengecekanLogin(String parUserName, String parPassword) {
        System.out.println(parUserName + " " + parPassword);
    }
}
