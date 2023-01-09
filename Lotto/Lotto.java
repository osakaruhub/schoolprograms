//Problem is that i have no clue how to check for duplicate values in an array while scanning them in
import java.util.*;
public class Lotto{
  int[] eingaben=new int[6];
  int[] zahlen=new int[6];
  Scanner sc=new Scanner(System.in);
  Random rand=new Random();
  public void Eingabe(){
    for(int i=0;i<eingaben.length;i++){
      eingaben[i]=50+i;
    }
    for(int i=0;i<eingaben.length;i++){
      System.out.print("Eingabe "+(i+1)+". Zahl: ");
      eingaben[i]=sc.nextInt();
      while(eingaben[i]>=50||eingaben[i]<=0){
        System.out.println("Bitte Zahlen zwischen 1 und 49 eingeben!");
        System.out.print("Eingabe "+(i+1)+". Zahl: ");
        eingaben[i]=sc.nextInt();
      }
      for(int k=0;k<eingaben.length;k++){
        for(int j=0+1;j<eingaben.length;j++){
          if(eingaben[k]==eingaben[j]){
            System.out.print("\n\n***FEHLER***\nSie haben eine doppelte Zahl eingegeben!\nEingabe"+(i+1)+". Zahl: ");
            for (int t=0;t<eingaben.length;t++) {
              System.out.println(eingaben[t]);
            }
            eingaben[i]=sc.nextInt();
          }
        }
      }
    }
    for(int i:eingaben){
      System.out.println(i);
    }
  }

  public static void main(String [] args){
    Lotto l=new Lotto();
    l.Eingabe();
  }
}
