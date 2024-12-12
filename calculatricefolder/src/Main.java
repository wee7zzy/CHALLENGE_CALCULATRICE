import java.util.Scanner;

public class Main{

    public static void MENU(){
        System.out.print("-------------MENU----------------\n"+
                        "1-ADDITION\n"+
                        "--------ENTRER VOTRE  CHOIX :");
        choix=scanner.nextInt();
    }
    
    public static void addition() {
        System.out.print("entrer a :");
        a = scanner.nextDouble();
        System.out.print("entrer b :");
        b = scanner.nextDouble();
        System.out.println("la somme a+b =" + (a+b));
    }

    public static void main(String[] args) {
        do {
            MENU();
            switch (choix) {
                case 1:
                    addition();
                    break;

            }
        } while (choix !=1);
        scanner.close();
    }
}



