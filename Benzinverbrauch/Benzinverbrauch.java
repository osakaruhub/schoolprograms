import java.util.*;
import java.text.*;

public class Benzinverbrauch{
  double     okm;   //Alte Kilometestand
  double     ckm;   //Aktuelle Kilometerstand;
  double     L;     //Menge von Benzin
  double     km;    //Gefahrene Kilometer
  double     BB;    //Benzinverbrauch
  
  DecimalFormat df=new DecimalFormat("#.##");
  
  public void Eingabe(){
    Scanner sc = new Scanner(System.in);
      System.out.print("Bitte geben sie den Kilometerstand beim letzten Tank ein: ");
      okm=sc.nextDouble();
      System.out.print("Bitte geben sie den aktuellen Kilometerstand ein: ");
      ckm=sc.nextDouble();
      System.out.print("Bitte geben sie die Menge der getankten Liter Benzin ein: ");
      L=sc.nextDouble();
      System.out.println("\n");
  }

  public void Verarbeitung(){
    km=ckm-okm;
    BB=L/km*100;
  }
    
  public void Auswertung(){
    System.out.println("Auswertung:");
    System.out.println("\nDer durchschnittliche Benzinverbrauch beträgt: "+df.format(BB));
    System.out.println("pro gefahrene 100 Kilometer, wenn sie "+km+" gefahren\nsind und "+L+" Liter getankt haben.");
  }

  public static void main(String[] args){
    Benzinverbrauch bb;
    bb=new Benzinverbrauch();
    System.out.println("********************************************\n\tBerechnung Benzinberechnung\n********************************************");
    bb.Eingabe();
    bb.Verarbeitung();
    bb.Auswertung();
  }
}

    
    
    
  
