import java.util.Scanner;

public class Java6Practice { //superclass
    public void Android(){
        System.out.println("Your device is an Android!");
    }
    public void tablet(){
        System.out.println("Your device is a Tablet!");
    }
    public void iphone(){
        System.out.println("Your device is an Iphone!");
    }
    public void ipad() {
        System.out.println("Your device is an Ipad!");
    }
}
class child extends Java6Practice{ //superclass
    static Scanner in = new Scanner(System.in);
    static Java6Practice myObj = new Java6Practice();
    static int neu;
    static String choose;

    public static void main(String[] args) {
        System.out.println("Welcome to device checker!");
        System.out.println("Choose Your device specification:\n1.Smaller than 6.5 inch\n2.Larger than 6.5 inch");
        neu = in.nextInt();

        try{
            if (neu == 1){
                System.out.println("Does it contains apple logo in the back? \npress Y if yes and N if no");
                choose = in.next();
                if(choose.equalsIgnoreCase("Y")){
                    myObj.iphone();
                }
                else if(choose.equalsIgnoreCase("N")){
                    myObj.Android();
                }
                else{
                    System.out.println("Please insert a valid Number");
                }
            }
            else if (neu == 2) {
                System.out.println("Does it contains apple logo in the back? \npress Y if yes and others if no");
                choose = in.next();
                if(choose.equalsIgnoreCase("Y")){
                    myObj.ipad();
                }
                else if(choose.equalsIgnoreCase("N")){
                    myObj.tablet();
                }
                else {
                    System.out.println("Please insert a valid Number");
                }
            }
        }catch (ArithmeticException e){
            System.out.println("Please insert a valid Number");
        }
    }


}
