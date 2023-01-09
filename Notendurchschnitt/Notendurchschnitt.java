import java.util.*;
import java.text.*;

public class Notendurchschnitt {
  int note1; //Note 1
  int note2; //Note 2
  int note3; //Note 3
  int note4; //Note 4
  int note5; //Note 5
  int note6; //Note 6
  int sa; //Anzahl der Schüler
  double summe; //Notendurchschnitt
  
  DecimalFormat df=new DecimalFormat("#.##");


  public void Eingabe() {
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Bitte geben die Anzahl der Note 1 ein: ");
    note1 = sc.nextInt();
    System.out.print("Bitte geben die Anzahl der Note 2 ein: ");
    note2 = sc.nextInt();
    System.out.print("Bitte geben die Anzahl der Note 3 ein: ");
    note3 = sc.nextInt();
    System.out.print("Bitte geben die Anzahl der Note 4 ein: ");
    note4 = sc.nextInt();
    System.out.print("Bitte geben die Anzahl der Note 5 ein: ");
    note5 = sc.nextInt();
    System.out.print("Bitte geben die Anzahl der Note 6 ein: ");
    note6 = sc.nextInt();
    System.out.print("\n");
  }
  
  public void Verarbeitung(){
    sa=note1+note2+note3+note4+note5+note6;
    summe=(double)(note1*1+note2*2+note3*3+note4*4+note5*5+note6*6)/sa;
  }

  public void Ausgabe(){
    System.out.println("Auswertung:\nInsgesamt haben sie "+sa+" Schüler an der Klassenarbeit teilgenommen.");
    System.out.println("Note 1: "+note1+" Schüler");
    System.out.println("Note 2: "+note2+" Schüler");
    System.out.println("note 3: "+note3+" Schüler");
    System.out.println("Note 4: "+note4+" Schüler");
    System.out.println("Note 5: "+note5+" Schüler");
    System.out.println("Note 6: "+note6+" Schüler");
    System.out.println("\nDer Notendurchschnitt beträgt: "+df.format(summe)); 
  }

  public static void main(String[] args){
    Notendurchschnitt ds;
    ds=new Notendurchschnitt();
    System.out.println("********************************************\n\tBerechnung Notendurchschnitt\n********************************************");
    ds.Eingabe();
    ds.Verarbeitung();
    ds.Ausgabe();
  }
}


