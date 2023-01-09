import java.util.*;
public class Mathe_Trainer{
  int art;
  int anzahl;
  int[] zahlen;
  String operator;
  int eingabe;
  int summe;
  String op;

  Scanner sc=new Scanner(System.in);

  public void Eingabe(){
    System.out.print("\nWelcher Grundrechenart möchten sie tranieren?\n(1: Addition, 2: Multiplikation): ");
    art=sc.nextInt();
    System.out.print("\nMit wie vielen möchten Sie rechnen? ");
    anzahl=sc.nextInt();
    zahlen=new int[anzahl];
  }

  public void ZiehungZufallsZahlenBerechneLoesung(){
    Random rand=new Random();
    for (int i=0;i<zahlen.length;i++){
      zahlen[i]=rand.nextInt(10)+1;
    } 
    
    if (art==1){
      operator="Addieren";
      op="+";
      for (int var:zahlen) {
        summe+=var;
      }
    }
    else {
      operator="Multipliziere";
      op="*";
      summe=1;
      for (int var:zahlen) {
        summe=summe*var;
      }
    }
    System.out.println(operator+" Sie die folgenden Zahlen");
    for (int i=0;i<zahlen.length;i++){
      System.out.println("Zahl "+(i+1)+": "+zahlen[i]);
    }
    System.out.print("\n\nEingabe Ergebnis: ");
    eingabe=sc.nextInt();
    }

  public void Auswertung(){
    if(summe==eingabe){
    System.out.println("Sie haben es richtig! :)");
    }
    if(summe!=eingabe){
    System.out.println("Sie haben die Rechnung flasch :(\n");
    for (int i=0;i<(zahlen.length-1);i++) {
      System.out.print(zahlen[i]+op);
    }
    System.out.print("="+summe+" nicht "+eingabe+"\n");
    }
  }
  
  public static void main(String [] args){
    Mathe_Trainer mt=new Mathe_Trainer();
    mt.Eingabe();
    mt.ZiehungZufallsZahlenBerechneLoesung();
    mt.Auswertung();
  }
}
