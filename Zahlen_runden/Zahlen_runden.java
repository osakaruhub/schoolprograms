import java.util.Scanner;

public class Zahlen_runden{
  static double zahl;
  static int stellen;

  public void Eingabe(){
    Scanner sc =new Scanner(System.in);
    System.out.print("\nEingabe Zahl ");
    zahl=sc.nextDouble();
    System.out.print("Eingabe Dezimalstellen ");
    stellen=sc.nextInt();
    sc.close();
  }

  public double runden(double zahl,int stellen){
    zahl=((int) ((zahl*Math.pow(10,stellen))+0.5))/Math.pow(10,stellen);
    return zahl;
  }

  public static void main(String[] args){
    Zahlen_Runden ZR=new Zahlen_Runden();
    System.out.println("*********************************************************\n\t\tZahlen runden\n*********************************************************");
    ZR.Eingabe();
    System.out.println(ZR.runden(zahl,stellen));
  }
}
