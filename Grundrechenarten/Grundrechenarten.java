import java.util.*;

public class Grundrechenarten{
    double zahl1;
    double zahl2;
    int art;
    double summe;

    public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Zahleneingabe:\n----------------------------------------");
    System.out.print("Bitte geben Sie die 1. Zahl ein: ");
    zahl1=sc.nextDouble();
    System.out.print("Bitte geben sie die 2. Zahl ein: ");
    zahl2=sc.nextDouble();
    System.out.print("\nAuswahl:\n----------------------------------------\nWelche Grundrechenart möchten sie auswählen:\n1. Addition\n2. Subtraktion\n3. Multiplikation\n4. Division\nEingabe Auswahl: ");
    art=sc.nextInt();
    }

    public void Verarbeitung(){
        switch (art) {
            case 1:
            summe=zahl1+zahl2; 
            System.out.println("Ausgabe Ergebnis:\n----------------------------------------\n"+zahl1+" + "+zahl2+" = "+summe);
                break;
            case 2:
            summe=zahl1-zahl2;
            System.out.println("Ausgabe Ergebnis:\n----------------------------------------\n"+zahl1+" - "+zahl2+" = "+summe);
                break;
            case 3:
            summe=zahl1*zahl2;
            System.out.println("Ausgabe Ergebnis:\n----------------------------------------\n"+zahl1+" * "+zahl2+" = "+summe);
                break;
            case 4:
            summe=zahl1/zahl2;
            System.out.println("Ausgabe Ergebnis:\n----------------------------------------\n"+zahl1+" / "+zahl2+" = "+summe);
                break; 
            default: System.out.println("Sie haben eine falsche Kennziffer eingeben! Das Programm wird abgebrochen");
            System.exit(0);
                break;
        }
    }

    public static void main(String [] args){
        Grundrechenarten gra;
        gra=new Grundrechenarten();
        System.out.println("****************************************\n\tNotenberechnung\n****************************************");
        gra.Eingabe();
        gra.Verarbeitung();
    }

}
