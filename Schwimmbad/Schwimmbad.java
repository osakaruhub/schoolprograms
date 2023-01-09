import java.util.*;

public class Schwimmbad{
  final double tag1=4.5;
  final int tag2=6;
  final int tag3=7;
  final int tag4_7=8;
  int eingabe;
  double kosten;
  boolean darauf;
  boolean zu;
  String geschlossen;

  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.print("\nWelchen Tag (in zahl) Moechten Sie ins Schwimmbad: ");
    eingabe=sc.nextInt();
    System.out.print("Moechten Sie die darauffolgenden Tage ins Schwimmbad (true/false)");
    darauf=sc.nextBoolean();
    sc.close();
  }

  public void berechnepreise(){
    switch (eingabe) {
      case 7: 
      kosten=tag4_7;
      case 6:
      kosten=tag4_7;
      case 5:
      kosten=tag4_7;
      case 4:
      kosten=tag4_7;
      case 3:
      kosten=tag3;
      case 2:
      kosten=tag2;
      case 1: 
      kosten=tag1;
      break;
      default:
        geschlossen="Wir haben leider geschlossen :(";
        zu=true;
    }

  public void Ausgabe(){
    if(zu==true)
      System.out.println(geschlossen);
    }
    else{
      System.out.println("\nIhr Eintrittspreis ist: "+kosten+"€");
    }
  }

  public static void main(String[] args){
    Schwimmbad m=new Schwimmbad();
    System.out.println("**********************************************************************\n\t\tSchwimmbad-Eintrittspreis*\n**************************************************");
    m.Eingabe();
    m.berechnepreise();
    m.Ausgabe();
  }
}
