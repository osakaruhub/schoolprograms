import java.util.*;
import java.text.*;

public class Zinsen {
  double kapital;
  double zs;       //Zinssatz
  double jahr;
  double zinsen;

  DecimalFormat df=new DecimalFormat("#.##");
  DecimalFormat df2=new DecimalFormat("#.#");
  DecimalFormat df3=new DecimalFormat("#");

  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Bitte geben sie das Kapital ein: ");
    kapital=sc.nextDouble();
    System.out.print("Bitte geben sie den Zinssatz ein: ");
    zs=sc.nextDouble();
    System.out.print("Bitte geben sie die Laufzeit ein: ");
    jahr=sc.nextDouble();
    System.out.print("\n");
  }

  public void Verarbeitung(){
    zinsen=(kapital*zs*jahr/100);
  }

  public void Auswertung(){
    System.out.println("Sie haben eingeben:\n"+df.format(kapital)+" EUR,\n"+df2.format(zs)+"%,\n"+df.format(jahr)+" Jahr(e)");
    System.out.println("Sie kriegen "+df.format(zinsen)+" EUR Zinsen.");
  }

  public static void main(String[] args){
    Zinsen z;
    z=new Zinsen();
    System.out.println("********************************************\n\tBerechnung von Zinsen\n********************************************");
    z.Eingabe();
    z.Verarbeitung();
    z.Auswertung();
  }
}
