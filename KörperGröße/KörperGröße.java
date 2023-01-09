import java.util.*;
import java.text.*;

public class KörperGröße{
  double lang;
  double alter;
  int geschlecht;
  double höhe;
  DecimalFormat df=new DecimalFormat("#.##");
  
  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Bitte geben Sie die Länge vom Oberschenkel (in m): ");
    lang=sc.nextDouble();
    System.out.print("Bitte geben Sie Ihr Alter ein: ");
    alter=sc.nextDouble();
    System.out.print("Sind Sie Männlich (1) oder Weiblich (2) ? ");
    geschlecht=sc.nextInt();
    System.out.println("\n\n");
    
    if (geschlecht<3){
      if (geschlecht>0){}
    }         
    else if (geschlecht<=0) {System.out.println("Du hattest ein Job, bist so dumm?");
      System.exit(0);} //end of if
  }                       
  
  public void Verarbeitung(){
    if (geschlecht<=1) {höhe=lang*2.238+0.69089;}
    else {höhe=lang*2+0.61417;}
    if (alter>30) {höhe=höhe-((alter-30)*0.06);}
  }
  
  public void Auswertung(){
    System.out.print("Auswertung:\n");
    
    if (geschlecht<=1) {System.out.println("Sie sind "+alter+" Jahre alt, männlich und haben\neine Oberschenkellänge von "+lang+" m.");
                        System.out.println("\nWahrscheinlich sind Sie "+df.format(höhe)+" m groß.");
    } else {System.out.println("Sie sind "+alter+" Jahre alt, weiblich und haben\neine Oberschenkellänge von "+df.format(höhe)+" m groß.");
            System.out.println("\nWahrscheinlich sind Sie "+df.format(höhe)+" m groß.");

    } // end of if-else
  }
  
  public static void main(String [] args){
    KörperGröße kg;
    kg=new KörperGröße();
    kg.Eingabe();
    kg.Verarbeitung();
    kg.Auswertung();
  }
}