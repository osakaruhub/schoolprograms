import java.util.*;
import java.text.*;

public class Noteneingabe{
  int[] spiegel=new int[15];
  int[] noten
  int schueler;
  double durchschnitt;
  int summe;
  String jn="J";
  DecimalFormat df=new DecimalFormat("#.##");
 
  public void eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Wie viele Schueler haben an der Klassenarbeit teilgenommen: ");
    schueler=sc.nextInt();
    noten=new int[schueler];
    for (int i=0;i<noten.length;i++) {
      System.out.print("Notenpunkte des "+i+". Schuelers eingeben: ");
      noten[i]=sc.nextInt();
    } // end of for
    System.out.println("\n\nAusgabe der Notenliste Schueler:\n");
    for (int i=0;i<noten.length;i++) {
      System.out.println((i+1)+". Schueler: "+noten[i]+" Punkte");
    } // end of for
  }
  
  public void Notenspiegel(){
    for(int i=0; i<noten.length;i++){
      for(int c=0; i<15;c++){
        if(noten[i] == c) {spiegel[c-1]=spiegel[i]+1;}
      }
    }
    System.out.println("\n\nAusagbe Notenspiegel:");
    for (int i=0;i> ;i++) {
      System.out.println(noten[i]+" Punkte: "+spiegel[i]);
    } // end of for
  }
  
  public void Notendurchschnitt(){
    for (i=0;i<schueler;i++) {
      summe=summe+noten[i]*spiegel[i];
    } // end of for
    durchschnitt=summe/noten.length;
  }
  
  public void Ausgabe(){
    System.out.println("\nDer Notendurchschnitt der Klasse betraegt: "+df.format(durchschnitt));
    System.out.println("\nMoechten sie die Noteneingabe wiederholen (J/N)? ");
    jn=sc.next();
    while (jn.equals("J"||"N")==false) { 
      System.out.println("Moechten sie die Noteneingabe wiederholen (J/N)? ");
    } // end of while
  }
  
  public static void main(String [] args){
    Noteneingabe N=new Noteneingabe();
    System.out.println("*****************************************************************************\n\t\tNoteneingabe\n*****************************************************************************");
    N.eingabe();
    N.Notenspiegel();
    N.NotenDurchschnitt();
    N.Ausgabe();
  }
}
