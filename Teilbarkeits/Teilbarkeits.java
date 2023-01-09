import java.util.*;

public class Teilbarkeits{
  static int zahl,divisor;
  Scanner sc=new Scanner(System.in);

  public void Eingabe(){
    System.out.print("\nZahl: ");
    zahl=sc.nextInt();
    System.out.print("Teiler: ");
    divisor=sc.nextInt();
  }

  public Boolean Teilbarkeit(int zahl, int divisor){
    return (zahl%divisor==0);
  }

  public int[] teilbarkeit(int zahl){
    int index=0;
    int[] c=new int[zahl];
    for(int i=1;i<zahl;i++){
      if(zahl%i==0){
        c[index]=i;
      }
      index++;
    }
    int[] result = Arrays.stream(c)
    .filter(val -> val != 0)
    .toArray();
    return result;
  }

  public void Ausgabe(){
    System.out.println("Testergebnis: ");
    if(Teilbarkeit(zahl,divisor)==true){
      System.out.print(zahl+" ist durch "+divisor+" glatt teilbar!");
    }else{
      System.out.print(zahl+" ist durch "+divisor+" nicht glatt teilbar!");
    }
    System.out.println("\nDie Zahl "+zahl+" ist durch folgende Zahlen teilbar: \n");
    for (int i:teilbarkeit(zahl)) {
      System.out.print(i+",");
    }
    System.out.print(zahl);
  }

  public static void main(String[] args) {
    Teilbarkeits T=new Teilbarkeits();
    System.out.println("**************************************************************\n\t\tTeilbarkeits-Bestimmung\n**************************************************************");
    T.Eingabe();
    T.Teilbarkeit(zahl,divisor);
    T.teilbarkeit(zahl);
    T.Ausgabe();

  }
}
