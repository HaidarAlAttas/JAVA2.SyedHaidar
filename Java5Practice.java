import java.util.Scanner;
public class Java5Practice { //class
    public static int makan;
   static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Java5Practice myObj = new Java5Practice();

        System.out.println("Selamat datang ke kedai makan!\nsila pilih makanan anda\n1.Nasi Goreng\n" +
                "2.Nasi Kunyit\n3.Nasi berempah");
        makan = in.nextInt();

        switch (makan){
            case 1:
                System.out.println("Nasi Goreng\nSila bayar RM 7 di kaunter hadapan");
                myObj.kaunter();
                break;
            case 2:
                System.out.println("Nasi Kunyik\nSila bayar RM 5000 di kaunter hadapan");
                myObj.kaunter();
                break;
            case 3:
                System.out.println("Nasi Berempah\nSila bayar RM 232 di kaunter hadapan");
                myObj.kaunter();
            default:
                System.out.println("Hier ist nicht der Zähler");
                myObj.kaunter();
                break;
        }
    }
    public void kaunter(){
        System.out.println("Danke für Sie hier bezahlt haben");
    }
}
