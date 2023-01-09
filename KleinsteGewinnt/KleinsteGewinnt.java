/*
works Fine! :)
*/

import java.util.*;

public class KleinsteGewinnt{
  double a;
  double b;
  double c;
  double idk;
  double smallest;

  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Bitte geben sie die 1. Zahl ein: ");
    a=sc.nextDouble();
    System.out.print("Bitte geben sie die 2. Zahl ein: ");
    b=sc.nextDouble();
    System.out.print("Bitte geben sie die 3. Zahl ein: ");
    c=sc.nextDouble();
    System.out.println("\n\n");
  }
  
  public void Verarbeitung(){
    if (a>b) { 
    if (b>c) {idk=3;
              smallest=c;
    }   
    }  
 
    if (b>a) { 
    if (a>c) {idk=3;
              smallest=c;
    }   
    }  
    if (a>b) { 
    if (c>b) {idk=2;
              smallest=b;
    }   
    }  

    if (b>c) { 
    if (c>a) {idk=1;
              smallest=a;
    }   
    }  

    if (a>b) { 
    if (c>a) {idk=2;
              smallest=b;
    }   
    }  

    if (b>a) { 
    if (c>b) {idk=1;
              smallest=a;
    }
    }
  }

  public void Auswertung(){
    System.out.println("Auswertung");
    System.out.println("Zahl 1: "+a);
    System.out.println("Zahl 2: "+b);
    System.out.println("Zahl 3: "+c);
    System.out.println("ist die Zahl "+idk+": "+smallest+".");
  }
  
  public static void main(String[] args){
    KleinsteGewinnt kg;
    kg=new KleinsteGewinnt();
    System.out.println("********************************************\n\tBerechnung von Zinsen\n********************************************");
    kg.Eingabe();
    kg.Verarbeitung();
    kg.Auswertung();
  }
}

       

