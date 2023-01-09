import java.util.Scanner;
public class AdditionZahlen {
    double zahl1;
    double zahl2;
    double summe;

public void eingabe() {
    Scanner sc = new Scanner(System.in);
    System.out.println("---------------------------\n\tZahleningabe:\n---------------------------");
    System.out.println("Bitte geben sie die 1. Zahl ein:");
    zahl1=sc.nextDouble();
    System.out.println("Bitte geben sie die 2. Zahl ein:");
    zahl2=sc.nextDouble();
    System.out.println("\n");
}

public void verarbeitung(){
    summe=zahl1+zahl2;
}

public void ausgabe(){
    System.out.println("\tAusgabeErgebnis:\n\t-----------------");
    System.out.println("\t"+zahl1+"+"+zahl2+"="+summe);
}

public static void main(String[] args){
    AdditionZahlen az1;
    az1=new AdditionZahlen();
    System.out.println("***************************\nAddition zweier Zahlen\n***************************");
    az1.eingabe();
    az1.verarbeitung();
    az1.ausgabe();
} 
}
