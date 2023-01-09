import java.util.*;

public class PlanetenQuiz {
  String[] Planeten ={"Merkur","Venus","Erde","Mars","Jupiter","Saturn","Uranus","Neptun"};
  String[] eingabe;
  int anzahl;
  int richtig;
  Scanner sc=new Scanner(System.in);

  public void Eingabe(){
    System.out.print("Wie viele Planeten kennen Sie? ");
    anzahl=sc.nextInt();
    while (anzahl>8){
      System.out.print("Hinweis: es gibt nur 8 Planeten!!\n\nWie viele Planeten kennen sie? ");
      anzahl=sc.nextInt();
    }
    eingabe=new String[anzahl];
    System.out.println("\n\nEingabe:"); 
    for(int i=0;i<anzahl;i++){
      System.out.print((i+1)+". Planet: ");
      eingabe[i]=sc.next();
    }
  }

  public void Verarbeitung(){
    int i;
    for(i=0;i<(eingabe.length);i++){
      for(int j=0;j<Planeten.length;j++){
        if(eingabe[i].equals(Planeten[j])){
          richtig++;
        }
      }
    }
  }

  public void Ausgabe(){
    System.out.println("\nAusgabe:\nFolgende "+anzahl+" Planeten wurden eingeben;");
    for(int i=0;i<eingabe.length;i++) {
      System.out.println((i+1)+". Planet: "+eingabe[i]);
    }
    for(String i:eingabe){
      if(i.equals("Sonne")){
        System.out.println("Die Sonne ist ein Stern!");
      }
    }
    for(String j:eingabe){
      if(j.equals("Pluto")){
        System.out.println("Pluto ist kein Planet mehr :(");
      }
    }
    System.out.println("\nVon den "+anzahl+" eingebenen Planeten sind "+richtig+" richtig!"); 
  }

  public static void main(String [] args){
    PlanetenQuiz pQuiz=new PlanetenQuiz();
    System.out.print("**************************************************************************\n\t\tPlaneten-Quiz\n**************************************************************************\n");
    pQuiz.Eingabe();
    pQuiz.Verarbeitung();
    pQuiz.Ausgabe();
  }
}

