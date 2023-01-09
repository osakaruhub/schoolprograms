import java.text.*;
import java.util.*;

public class Handlung {
  double fixum;
  double provision0;
  double provision1;
  double umsatz0;
  double umsatz1;
  double kosten0;
  double kosten1;
  String jn="J";
  
  DecimalFormat df=new DecimalFormat("###,### EUR");

  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    while (jn.equals("J")) { 
      System.out.print("\n\nFixum des Reisenden eingeben: ");
      fixum=sc.nextDouble();
      System.out.print("Provisionssatz des Handlungsreisenden eingeben: ");
      provision0=sc.nextDouble();
      System.out.print("Provisionssatz des Handelsvertreter eingeben: ");
      provision1=sc.nextDouble();
      System.out.println("\n");
      umsatz0=provision0/100;
      umsatz1=provision1/100;
      System.out.println("\tUmsatz\t  Kosten Handlungsreisender  Kosten Handlungsvertreter\n\t(in Euro)\t(in Euro)\t\t(in Euro)\n*******************************************************************");
      System.out.println("  20.000,00 EUR\t\t"+df.format(fixum+ 20000*umsatz0)+"\t\t"+df.format( 20000*umsatz1));
      System.out.println("  60.000,00 EUR\t\t"+df.format(fixum+ 60000*umsatz0)+"\t\t"+df.format( 60000*umsatz1));
      System.out.println(" 100.000,00 EUR\t\t"+df.format(fixum+100000*umsatz0)+"\t\t"+df.format(100000*umsatz1));
      System.out.println(" 140.000,00 EUR\t\t"+df.format(fixum+140000*umsatz0)+"\t\t"+df.format(140000*umsatz1));
      System.out.println(" 180.000,00 EUR\t\t"+df.format(fixum+180000*umsatz0)+"\t\t"+df.format(180000*umsatz1));
      System.out.println(" 220.000,00 EUR\t\t"+df.format(fixum+220000*umsatz0)+"\t\t"+df.format(220000*umsatz1));
      System.out.println(" 260.000,00 EUR\t\t"+df.format(fixum+260000*umsatz0)+"\t\t"+df.format(260000*umsatz1));
      System.out.println(" 300.000,00 EUR\t\t"+df.format(fixum+300000*umsatz0)+"\t\t"+df.format(300000*umsatz1));
      System.out.println(" 340.000,00 EUR\t\t"+df.format(fixum+340000*umsatz0)+"\t\t"+df.format(340000*umsatz1));
      System.out.println(" 380.000,00 EUR\t\t"+df.format(fixum+380000*umsatz0)+"\t\t"+df.format(380000*umsatz1));
      System.out.println(" 420.000,00 EUR\t\t"+df.format(fixum+420000*umsatz0)+"\t\t"+df.format(420000*umsatz1));
      System.out.println(" 460.000,00 EUR\t\t"+df.format(fixum+460000*umsatz0)+"\t\t"+df.format(460000*umsatz1));
      System.out.println(" 500.000,00 EUR\t\t"+df.format(fixum+500000*umsatz0)+"\t\t"+df.format(500000*umsatz1));
      System.out.println("\nMoechten Sie eine weitere Berechnung durchfuehren (J/N)?");
      jn=sc.next();
    } // end of while
  }
  
  public static void main(String [] args){
    Handlung h;
    h=new Handlung();
    System.out.println("*************************************************************************\n\tKostenvergleich Handelsvertreter/ Handlungsreisender\n*************************************************************************");
    h.Eingabe();
  }
}
