import java.util.Scanner;

class schrank{ //superclass
    public void Function(){ //superclass method
        System.out.println("Es halt warm Sache, Essen, und Trinken");
    }
}
class kühlschrank extends schrank{ //subclass
    public void Function(){ //subclass method (Polymorphism because we keep the same name of the method in superclass)
        System.out.println("Es halt kalt Sache, Essen, und Trinken");
    }
}
public class Java7Practice { //main class
    static String ausgesucht;
    static Scanner in = new Scanner(System.in);
    static int i = 1;

    public static void main(String[] args) {
        do {
            System.out.println("Bestimme und Tippen die Schranknamen zu Weiß seine Funktionen");
            System.out.println("Schrank\nKühlschrank");
            ausgesucht = in.next();

            if (ausgesucht.equalsIgnoreCase("schrank")) {
                schrank peti = new schrank(); //calling superclass
                peti.Function();
                i = 0;
            } else if (ausgesucht.equalsIgnoreCase("Kühlschrank")) {
                schrank peti = new kühlschrank();//calling subclass
                peti.Function();
                i = 0;
            } else {
                System.out.println("Enter a Valid name haha");
            }
        }while (i >= 1);
    }
}