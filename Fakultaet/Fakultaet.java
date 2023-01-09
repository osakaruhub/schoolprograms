import java.util.*;

public class Fakultaet{
  int eingabe;
  long summe=1;
  String jn="J";
  
  public void method(){
    Scanner sc=new Scanner(System.in);
    while (jn.equals("J")) {
      System.out.println("Geben Sie eine Zahl zwischen 0 und 63 ein, aus der die Fakultaet berrechnet werden soll");
      eingabe=sc.nextInt();
      while (eingabe>63||eingabe<0) { 
        System.out.println("Geben Sie eine Zahl zwischen 0 und 63 ein, aus der die Fakultaet berrechnet werden soll");
        eingabe=sc.nextInt();                                                     
      } // end of while
      for (int i=1;i<=eingabe;i++) {
        if (eingabe==0) {
          summe=1;
          ;break;
        } // end of if
        summe=summe*i;
      }
      System.out.println("Die Fakultaet "+eingabe+"! betraegt: = "+summe);
      System.out.println("\nMoechten sie eine neue Berechnung durchfuehren (J/N)? ");
      jn=sc.next();
      while (jn.equals("J")==false||(jn.equals("N")==false)) { 
        System.out.println("\nMoechten sie eine neue Berechnung durchfuehren (J/N)? ");
        jn=sc.next();
      } // end of while
    } // end of while
  }
  public static void main(String [] args){
    Fakultaet fk;
    fk=new Fakultaet();
    System.out.println("*************************************************\n\tFakultaet-Berechnung\n*************************************************");
    fk.method();
  }
}
