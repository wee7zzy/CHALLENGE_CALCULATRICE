import java.util.Scanner;

public class Main{
    
    static int choix;
    static double a,b;
    static SCANNER scanner=new Scanner(System.in);

    public static void MENU(){
        System.out.print("-------------MENU----------------\n"+
                        "1-ADDITION\n"+
                        "2-SOUSTRACTION\n"+
                        "3-MULTIPLICATION\n"+
                        "4-DIVISION\n"+
                        "5-QUITTER\n"+
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
   
    public static void soustraction() {
        System.out.print("entrer a :");
        a = scanner.nextDouble();
        System.out.print("entrer b :");
        b = scanner.nextDouble();
        System.out.println("la soustraction a-b =" + (a-b));
    }
    
    public static void multiplication(){
        System.out.print("entrer a :");
        a = scanner.nextDouble();
        System.out.print("entrer b :");
        b = scanner.nextDouble();
        System.out.println("la multiplication a*b =" + (a*b));
    }
    
    public static void division(){
        System.out.print("entrer a :");
        a = scanner.nextDouble();
        System.out.print("entrer b :");
        b = scanner.nextDouble();
        if(b==0){
            System.out.println("la division par 0 est impossible");
        }else
            System.out.println("la division a/b =" +(a/b));
    }

    public static void main(String[] args) {
        do {
            MENU();
            switch (choix) {
                case 1:
                    addition();
                    break;
                case 2:
                    soustraction();
                    break;
                case 3:
                    multiplicaton();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    System.out.println("MERCI D'UTILISER LA CALCULATRICE A BIENTOT");
                    break;
                default:
                    System.out.println("CHOIX INVALIDE RESSAYER");
                    break;

            }
        } while (choix !=4);
        scanner.close();
    }
}



