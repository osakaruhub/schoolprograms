import java.util.Scanner;

public class TicTacToe{
  char[][] spielFeld=new char[3][3];
  int x,y;
  String spot;
  String[] spieler={"Spieler 1(=X):","Spieler 2(=O)"};
  Scanner sc1=new Scanner(System.in);

  public void StarteSpiel(){
    for(int i=0;i<spielFeld.length;i++){
      for(int c=0;c<spielFeld[2].length;c++){
        spielFeld[i][c]="#";
      }
    }
  }

  public void SetzeSpielstein(){ 
    if(c%2==0){
      s=1;
      spot="X";
    }
    else{
      s=2;
      spot="O";
    }
    System.out.println("Spieler "+j+"(="+spot+")");
    System.out.print("\nEingabe Koordinate x (0-2): ");
    x=sc.nextInt();
    System.out.print("Eingabe Koordinate y (0-2): ");
    y=sc.nextInt();
    spielFeld[y][x]=spot;
  }

  public void AusgabeSpielfeld(){
   for(int i=0;i<spielFeld.length;i++){
      for(int c=0;c<spielFeld[2].length;c++){
        System.out.print(spielFeld[i][c]+" ");
      }
      System.out.println();
    }
  }

  public Boolean AuswertungTreffer(Boolean endgame){
    for(int q=0;q<spielFeld.length;q++){
      for(int p=0;p<spielFeld[2].length;p++){
        if(spielFeld[q][0]==spielFeld[q][1]&&spielFeld[q][1]==spielFeld[q][2]){
          return true;
        }
        if (spielFeld[0][q]==spielFeld[1][q]&&spielFeld[1][q]==spielFeld[2][q]){
          return true;
        }
      }
    }
    if (spielFeld[0][0]==spielFeld[1][1]&&spielFeld[1][1]==spielFeld[2][2]) {
      return true;
    }
    if (spielFeld[2][0]==spielFeld[1][1]&&spielFeld[1][1]==spielFeld[0][2]) {
      return true;
    }else{return false;}
  }
 
  public static void main(String[] args){ 
    TicTacToe TTT=new TicTacToe();
    Scanner sc=new Scanner(System.in);
    System.out.println("****************************************************************\nTic-Tac-Toe\n****************************************************************");
    Boolean Endgame;
    int s,c;
    do{
      TTT.StarteSpiel();
      do{
        TTT.SetzeSpielstein();
        TTT.AusgabeSpielfeld();
        TTT.AuswertungTreffer(Boolean);
        c++;
      }while (AuswertungTreffer);
      System.out.println("Spieler "+s+" hat gewonnen!");
      System.out.print("\nMöchten Sie nochmal spielen? ");
      jn=sc.next().CharAt();
    }while(jn=="j"); 
  }
}
