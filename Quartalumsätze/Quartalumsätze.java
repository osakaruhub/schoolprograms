import java.util.*;

public class Quartalumsätze{
  int[][] umsatz=new int[3][5];

  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    for( int zeile = 0; zeile < umsatz.length-1; zeile ++){
	    for (int spalte = 0; spalte <umsatz[0].length-1; spalte ++ ){
		    System.out.print("Umsatz für Filiale "+(zeile+1)+" (Quartal "+(spalte+1)+"): ");
        umsatz[zeile][spalte]=sc.nextInt();
      }
    }
  }

  public void Verarbeitung(){
    for(int i=0;i<umsatz.length-1;i++){
      for(int c=0;c<umsatz.length+1;c++){ 
        umsatz[i][4]+=umsatz[i][c];
      }
    }
    for(int i=0;i<umsatz.length+2;i++){
      for(int c=0;c<umsatz.length-1;c++){
        umsatz[2][i]+=umsatz[c][i];
      }
    }
  }

  public void Ausgabe(){
    System.out.println("\t\tQuartalumsätze\n\n\t1. Quartal\t2. Quartal\t3. Quartal\t4. Quartal\tSumme\n\t---------------------------------------------------------------------");
    for( int zeile = 0; zeile < umsatz.length; zeile ++){
    if (zeile==2) {
      System.out.println("-----------------------------------------------------------------------------");
    }
      System.out.print("Filiale "+(zeile+1)+"   ");
	    for (int spalte = 0; spalte <umsatz[0].length; spalte ++ ){
		    System.out.print(umsatz[zeile][spalte]+"\t\t");
      }
      System.out.println();
    }
    System.out.println("=============================================================================");
  }

  public static void main(String [] args){
    Quartalumsätze qu=new Quartalumsätze();
    Scanner sc1=new Scanner(System.in);
    String jn;
    System.out.println("**********************************************************\n\t\tQuartalumsätze\n**********************************************************");
    do{
      qu.Eingabe();
      qu.Verarbeitung();
      qu.Ausgabe();
      System.out.print("\n\nMöchten sie die Eingaben wiederholen? (J/N) ");
      jn=sc1.next();
    } while(jn.equalsIgnoreCase("J"));
    sc1.close();
  }
}
