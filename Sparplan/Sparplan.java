import java.util.*;
import java.text.*;

public class Sparplan {
  double kapital;
  double zs;
  double dauer;
  double zinsen;
  double summe;
  String hi="Jahre";
  String jn="J";
  DecimalFormat df_k=new DecimalFormat("#.##");
  DecimalFormat df_s=new DecimalFormat("#.#");

  public void neu(){
    Scanner sc=new Scanner(System.in);
    while (jn.equals("J")) {
      System.out.print("Bitte geben sie Ihr Kapital ein: ");
      kapital=sc.nextDouble();
      System.out.print("Bitte geben sie den Zinssatz ein: ");
      zs=sc.nextDouble();
      System.out.print("Bitte geben sie die Anlagedauer (in Jahren) ein: ");
      dauer=sc.nextDouble();
      System.out.println("\n\n");
      
      if (dauer==1) {String hi="Jahre".replace("e", "");}
      zinsen=kapital*zs*dauer/100;
      summe=zinsen+kapital;
      
      System.out.println("Startkapital: "+df_k.format(kapital)+" Euro");
      System.out.println("Zinssatz: "+df_s.format(zs)+" %" );
      System.out.println("Anlagedauer: "+dauer+" "+hi);
      System.out.println("Zinsen: "+df_k.format(zinsen)+" Euro");
      System.out.println("Endkapital: "+df_k.format(summe)+" Euro\n\n");
      System.out.print("Möchten sie eine neue Berechnung durchführen (j/n)? ");
      jn=sc.next();
      System.out.println("");
    }
  }

  public static void main(String[] args){
    Sparplan sp;
    sp= new Sparplan();
    System.out.println("*********************************************\n\tSparplan\n*********************************************\n");
    sp.neu();
  }
}
