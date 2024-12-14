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
                        "5-PUISSANCE\n"+
                        "6-RACINE CARRE\n"+
                        "7-FACTORIELLE\n"+
                        "8-QUITTER\n"+
         
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
    public static void puissance(int base,int exposant){
        System.out.print("entrer base :");
        base=scanner.nextInt();
        System.out.print("entrer exposant :");
        exposant=scanner.nextInt();
        System.out.println(base + "  a la puissance  " + exposant + "  = " + Math.pow(base,exposant));
    }
    public static void racinecarree(){
        double nmbr;
        System.out.printf("entrer nombre = ");
        nmbr=scanner.nextDouble();
        if(nmbr<0){
            System.out.println("la racine carree d'un nombre negative est impossible ");
        }else{
            System.out.println("la racine carree de "+ nmbr +  " = "+Math.sqrt(nmbr));
        }
    }
    public static void factorielle(){
        int i,fact=1;
        System.out.printf("entrer nombre = ");
        a=scanner.nextInt();
        if(a<0){
            System.out.println("IMPOSSIBLE pour les nombres negatives");
        }else{
            for(i=1;i<=a;i++){
                fact=fact*i;
            }
            System.out.println("Le factorielle de "+a+ " = "+fact);
        }

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
                    puissance();
                    break;
                case 6:
                    racinecarree();
                    break;
                case 7:
                    factorielle();
                    break;
                case 8:
                    System.out.println("MERCI D'UTILISER LA CALCULATRICE A BIENTOT");
                    break;
                default:
                    System.out.println("CHOIX INVALIDE RESSAYER");
                    break;

            }
        } while (choix !=8);
        scanner.close();
    }
}



