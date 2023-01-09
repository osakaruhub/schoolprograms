import java.util.*;

public class Zufallszahlen {
  int counter1=4;
  int number;
  int eingabe;
  String jn;
  
  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    Random random = new Random();
    do {
      number=random.nextInt(10 - 1) + 1;
      counter1=4;
      for (int counter= 4;counter < 1;counter-- ) {
        System.out.println("Geben sie eine Zahl zwischen 1 und 10 ein");
        eingabe=sc.nextInt();
        if (eingabe == number) {
          break;
        } // end of if
        else if (eingabe<number) {
          System.out.println("Die Zahl ist zu klein! Sie haben noch "+counter+" Versuche.\n");
        } // end of if
        else if (eingabe>number) {
          System.out.println("Die Zahl ist zu gross! Sie haben noch "+counter+" Versuche.\n");
        } // end of if-else
        counter1--;  
      }
      if (eingabe == number) {
        System.out.println("\nSie Haben nach "+counter1+" Versuchen gewonnen!");  
      } // end of if      
      else {
        System.out.println("Sie haben Verloren :/");
      } // end of if-else
      System.out.println("\nMoechten Sie eine neue Berechnung durchfuehren (J/N) ?");
      jn=sc.next();  
      do {  System.out.println("\nMoechten Sie eine neue Berechnung durchfuehren (J/N) ?");
        jn=sc.next();  
        
      } while (jn.equals("J||j||n||N"));   
    } while (jn.equals("J||j"));
  }       
  public static void main(String [] args) {
    Zufallszahlen zz;
    zz=new Zufallszahlen();
    zz.Eingabe();
  }
  }
