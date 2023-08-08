import java.util.Scanner;

public class Task882023 {
   public String car ; //tahun pengeluaran kereta
    int pilih; //untuk pilih kereta apa
    String akhirkalam; //just nak print penutup
    String takde = "Takde dalam record la bro/sis"; //akan keluar hanya kalau ada exception
    public Task882023() { //constructor

        akhirkalam = "Terima kasih kerana menggunakan perkhidmatan kami :)";
    }

   Scanner in = new Scanner(System.in);

   public void Volkswagen(){ //method 1
       System.out.println("Masukkan Tahun pengeluaran");
       car = in.next();
       System.out.println("Volkswagen " + car);

    }
    public void BMW(){ //method 2
        System.out.println("Masukkan Tahun pengeluaran");
        car = in.next();
        System.out.println("BMW " + car);
   }
    public void Mercedes(){ //method 3
        System.out.println("Masukkan Tahun pengeluaran");
        car = in.next();
        System.out.println("Mercedes " + car);
    }

}

class Subclass1 extends Task882023{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task882023 kereta = new Task882023();
        int pilih1;

        // pilih kereta punya type
        System.out.println("Bestimmen Sie dein Auto Tippe");
        System.out.println("1.BMW\n2.Mercedes\n3.Volkswagen");
        kereta.pilih = in.nextInt();

        try{
            switch (kereta.pilih) {
                case 1:
                    kereta.BMW();
                    break;
                case 2:
                    kereta.Mercedes();
                    break;
                case 3:
                    kereta.Volkswagen();
                    break;
                default:
                    System.out.println(kereta.takde); // kalau pakai number lain dari atas (positive)
                    break;
            }
        }catch (ArithmeticException e){
            System.out.println(kereta.takde);  // kalau pakai number lain dari atas (negative)
        }

        System.out.println(kereta.akhirkalam);


    }


}
