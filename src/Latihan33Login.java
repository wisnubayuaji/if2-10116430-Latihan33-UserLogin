import java.util.Scanner;

public class Latihan33Login {
    
    String usName;
    String passWord;

    public static void main(String[] args) throws Exception {

        
        //Scanner u = new Scanner(System.in);
        //System.out.print("Masukan Username : ");
        //String usName = u.next();

        //Scanner p = new Scanner(System.in);
        //System.out.print("Masukan Password : ");
        //String passWord = p.next();

        //System.out.println(usName + " tes " + passWord);
        
        String parUserName = "RizkiAdam";
        //String parUserName = usName;
        String parPassword = "terbaikselalu";
        //String parPassword = passWord;

        User validasi = new User();
        validasi.username = parUserName;
        validasi.password = parPassword;

        validasi.cekAkun(parUserName, parPassword);
        validasi.hasilLogin(Status, parUserName);
        validasi.pengecekanLogin(parUserName, parPassword);


        //String user = "betul";
        //String pass = "betul";

        //boolean statusAkun = username.equals(user) && password.equals(pass);
        //boolean statusAkun = usName.equals(username) && passWord.equals(password);

        //System.out.println(statusAkun);

        //if (statusAkun == true) {
            //System.out.println("betul betul betul");
        //} else {
            //System.out.println("salah");
        //}

    }

    
}
