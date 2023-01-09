import java.text.DecimalFormat;
import java.util.*;

public class MittelWert {
  double zahlen;
  double summe;
  int anzahl;
  String jn;
  String jn1;
  Boolean neu;
  Boolean neu1;
  DecimalFormat df=new Decimalformat("#.##");

  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    summe=0;
    while (jn.equals("j")||jn.equals("n")) {
      System.out.print("Sie haben das Falsche Buchstabe eingeben! \n Möchten sie eine weitere Zahl eingeben (j, n)? ");
      jn=sc.nextChar();
    }
    do {
           System.out.println("geben Sie die "+(i+1)+". Zahl ein");
      zahlen=sc.nextDouble();
      summe+=zahlen; 
      System.out.print("\nMoechten Sie eine weitere Zahl hinfzufügen (j/n)? ");
      jn=sc.next().charAt(0);
      while (jn.equals("j")||jn.equals("n")) {
        System.out.print("Sie haben das Falsche Buchstabe eingeben! \n Möchten sie eine weitere Zahl eingeben (j, n)? ");
        jn=sc.nextChar();
      }
      if (jn.equals("j")||jn.equals("J")){
        neu=true;
      anzahl++;
      }
    } while (neu);
  }

  public void Verarbeitung(){
    summe=summe/anzahl;
  }

  public void Ausgabe(){
    System.out.println("\n\nDer Mittelwert lautet: "+summe+".");
  }
    
  public static void main(String []args ){
    MittelWert mw=new MittelWert();
    Scanner sc1=new Scanner(System.in);
    char jn1;
    Boolean neu1;
    do {
    mw.Eingabe();
    mw.Verarbeitung();
    mw.Ausgabe();
    System.out.print("\nMoechten sie eine neue Rechnung durchfuehren? ");
    jn1=sc.next().charAt(0);
    if (jn1=="j"||jn1=="J") {
      neu1=true;
    }  
    } while (neu1);
  }
}
