import java.util.*;
import java.text.*;

public class BodyMassIndex{
  double kg;
  double m;
  double bmi;
  String gesund;

  DecimalFormat df=new DecimalFormat("#.##");

  public void Eingabe(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Bitte geben Sie ihr Gewicht (in kg) ein: ");
    kg=sc.nextDouble();
    System.out.print("Bitte geben Sie ihre Koerpergroesse (in m) ein: ");
    m=sc.nextDouble();
    System.out.println("\n");
  }

  public void Verarbeitung(){
    bmi=kg/(m*m);
    if (bmi<19) {gesund="Sie sind untergewichtig!";}
    
      else if (bmi>=20)
        if (bmi<25) {gesund="Sie haben Normalgewicht!";}
        
          else if (bmi>=25)
            if (bmi<30) {gesund="Sie sind uebergewichtig!";}
            
            else {gesund="Sie sind stark uebergewichtig!";}         
  }
  
  public void Auswertung(){
    System.out.println("Ihr Body-Mass-Index (BMI) betraegt: "+df.format(bmi));
    System.out.println(gesund);
  }
  public static void main(String[] args){
    BodyMassIndex ds;
    ds=new BodyMassIndex();
    System.out.println("********************************************\n\tBerechnung Body-Mass-Index\n********************************************");
    ds.Eingabe();
    ds.Verarbeitung();
    ds.Auswertung();
  }
}