//Kennwort ist "FLS"

import java.util.*;

public class KennwortEingabe {
  String kennwort;
  
  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Bitte geben Sie Ihr Kennwort ein: ");
    kennwort=sc.next();
    for(int counter = 2; counter > 0; counter--) {
      if (kennwort.equals("FLS")) {
        break;
      }
      System.out.println("Das Kennwort ist leider Falsch!");
      System.out.println("Sie haben noch "+counter+" von 3 Versuchen!\n\nBitte geben sie Ihr Kennwort ein: ");
      kennwort=sc.next();
    }
  }
  public void Ausgabe(){
    if (kennwort.equals("FLS")==false) {
      System.out.println("Ihre Benutzererkennung wird gesperrt!");
      System.exit(0);
    }
    else {
      System.out.println("\nSie haben sich erfolgreich angemeldet!");
    }
    
  }
  public static void main(String [] args){
    KennwortEingabe kw;
    kw=new KennwortEingabe();
    System.out.println("**************************************************\n\tKennworteingabe\n**************************************************");
    kw.Eingabe();
    kw.Ausgabe();
  }
}  

  
  
  
  
  
