import java.util.*;

public class MinMax{
  double[] zahlen;
  double max;
  double min;
  int anzahl;

  public void eingabe_0(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Bitte geben Sie die Anzahl der Zahlen an: "); 
    anzahl=sc.nextInt();
    zahlen=new double[anzahl];
    for(int i=0;i<anzahl;i++){
      System.out.print("geben Sie die "+(i+1)+". Zahl ein: ");
      zahlen[i]=sc.nextDouble();
    }
    sc.close();
  }

  public void ermitteleMax(){
    for(double i:zahlen){
      for(double j:zahlen){
        if(j>i){
          max=j;
        }
      }
    }
  }

  public void ermitteleMin(){
    for(double i:zahlen){
      for(double j:zahlen){
        if(i<j){
          min=i;
        }
      }
    }
  }

  public void Ausgabe(){
    System.out.println("Die Größte Zahl ist: "+max+".");
    System.out.println("Die kleinste Zahl ist: "+min);
  }

  public static void main(String [] args){
    MinMax mm=new MinMax();
    System.out.println("*****************************************************************\n\t\tMinMax\n*****************************************************************\n"); 
    mm.eingabe_0();
    mm.ermitteleMax();
    mm.ermitteleMin();
    mm.Ausgabe();
    }
  }
