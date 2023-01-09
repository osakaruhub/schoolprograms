//in the main-method, compiler won't find the Scanner for repeating the Quiz.

import java.util.*;

public class Wortspiel{
  int richtig;
  int anzahl;
  int c,i=1;
  String[] Fragen={"Sie wird kürzer, je länger man zieht","Dieser Ring ist nicht rund","Dieser Baum hat keine Blätter","Dieses Tal will jeder haben","Ein Zahn, der nicht beißt","Ein Stuhl ohne Beine"};
  String[] lös={"Zigarre","Boxring","Purzelbaum","Kapital","Löwenzahn","Dachstuhl"};
  String eingabe;
  Random rand=new Random();

  public void AuswahlFragen(){
    c=rand.nextInt(5);
    System.out.println(i+". Frage: "+Fragen[c]);
  }

  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEingabe Lösung: ");
    eingabe=sc.next();
    sc.close();
  }

  public void Auswertung(){
    System.out.println("\nAuswertung:");
    if(eingabe.equalsIgnoreCase(lös[c])){
      System.out.println("Herzlichen Glückwunsch, Ihre Antwort ist richtig!");
      richtig++;
    } 
    else{
      System.out.println("Die Antwort war leider falsch!");
    }
    anzahl++;
 }

  public void GesamtAuswertung(){
    System.out.println("\n\n Sie haben "+richtig+" von "+i+" Antworten richtig!");
  }

  public static void main(String [] args){
    Wortspiel ws=new Wortspiel();
    System.out.println("*******************************************\n\t\tWortspiel-Quiz\n*******************************************");
    String wieder;
    do{
      ws.AuswahlFragen();
      ws.Eingabe();
      ws.Auswertung();
      do{
        System.out.print("\n\nMöchten Sie noch einmal spielen?");
        Scanner sc1=new Scanner(System.in);
        wieder=sc1.next();
        sc1.close();
      }while ((wieder.equalsIgnoreCase("N"))==false||(wieder.equalsIgnoreCase("J"))==false);
    }while(wieder.equalsIgnoreCase("J"));
    ws.GesamtAuswertung();
  }
}
