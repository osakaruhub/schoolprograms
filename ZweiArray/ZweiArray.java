import java.util.Random;
import java.util.Scanner;

public class ZweiArray{
  Random rand=new Random();
  Scanner sc=new Scanner(System.in);

  public void BerechneSummen(){ 
    int zahlen[][]=new int[5][6];
    int[] summeZeilen=new int[5];
    int[] summeSpalten=new int[6];
    int summeGesamt=0; 
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<6;c++){
        zahlen[i][c]=c+1;
      }
    } 
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<6;c++){
        System.out.print(zahlen[i][c]);
      }
      System.out.println();
    }
    for(int i=0;i<zahlen.length+1;i++){
      
      for(int c=0;c<6;c++){
        if (i==5) {
          ;break;
        }
        summeZeilen[i]+=zahlen[i][c];
      }
      for(int c=0;c<5;c++){
        summeSpalten[i]+=zahlen[c][i];
      }
      summeGesamt+=summeSpalten[i];
    }
    for (int i:summeZeilen) {
      System.out.print(i+"\t");
    }
    System.out.println();
    for (int i:summeSpalten) {
      System.out.print(i+"\t");
    }
    System.out.println(summeGesamt);
  }
  
  public void BerechneSummeDiagonalen(){
    int[][] zahlen;
    int[] summeDiagonalen=new int[2];
    int j=0;
    int zahl;
    System.out.print("\nWelche größe soll das Array haben? ");
    zahl=sc.nextInt();
    zahlen=new int[zahl][zahl];
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<zahlen.length;c++){
        zahlen[i][c]=c+1;
      }
    } 
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<zahlen.length;c++){
        System.out.print(zahlen[i][c]);
      }
      System.out.println();
    }
    for(int i=0;i<zahlen.length;i++){
      summeDiagonalen[0]+=zahlen[i][j];
      summeDiagonalen[1]+=zahlen[zahlen.length-1-i][i];
      j++;
    }
    for(int i:summeDiagonalen){
      System.out.println(i);  
    }
    System.out.println();
  }

  public void BerechneKleinsteGrößteZahl(){
    int[][] zahlen=new int[6][6];
    int[] index={0,0,0,0};
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<zahlen[5].length;c++){
        zahlen[i][c]=rand.nextInt(99)+1;
        System.out.print(zahlen[i][c]+" ");
      }
      System.out.println();
    }
    int min=zahlen[0][0];
    int max=zahlen[0][0];
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<zahlen[i].length;c++){
        if(zahlen[i][c]<min){
          min=zahlen[i][c];
          index[0]=i;
          index[1]=c;
        }
        if(zahlen[i][c]>max){
          max=zahlen[i][c];
          index[2]=i;
          index[3]=c;
        }
      }
    }
    System.out.println("\nDie kleinste Zahl im Array beträgt "+min+" und liegt in der Zeile"+index[0]+" und in Spalte "+index[1]);
    System.out.println("\nDie größte Zahl im Array beträgt "+max+" und liegt in der Zeile"+index[2]+" und in Spalte "+index[3]);
  }

  public void PrüfeGleicheZahlenInEinerZelle(){
    int zahl;
    System.out.print("\nWelche Größe soll das Array haben? ");
    zahl=sc.nextInt();
    int[][] zahlen=new int[zahl][zahl];
    Boolean same=false;
    int j=rand.nextInt(zahl-1);
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<zahlen[zahl-1].length;c++){
        if (i==j) {
          for(int f=0;f<zahlen[zahl-1].length;f++){
            zahlen[i][c]=69;
            System.out.print(zahlen[i][c]+" ");
          }
          ;break;
        }
        zahlen[i][c]=rand.nextInt(99)+1;
        System.out.print(zahlen[i][c]+" ");
      }
      System.out.println();
    }
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<zahlen[zahl-1].length-1;c++){
        if(zahlen[i][c]==zahlen[i][c]){
          same=true;
          j=i;
        }
        else{same=false;}
      }
    }
    if(same==true){
    System.out.println("Es stehen inder Zeile "+j+" im Array nur gleiche Zahlen!");
    }
    else{System.out.println("Alle Zeilen sind verschieden!");}
    System.out.println();
  }

  public void ErmitteleMaxMinDiagonale(){
    int[][] zahlen=new int[6][6];
    int[] index=new int[2];
    int min=zahlen[0][0];
    int max=zahlen[0][0];
    for(int i=0;i<zahlen.length;i++){
      for(int c=0;c<zahlen[5].length;c++){
        zahlen[i][c]=rand.nextInt(99)+1;
        System.out.print(zahlen[i][c]+" ");
      }
      System.out.println();
    }
    for(int i=0;i<zahlen.length;i++){
      if(zahlen[i][i]>max){                 //Maximum der Diagonale
        max=zahlen[i][i];
        index[0]=i;
      }
      if(zahlen[i][i]<min){                 //Minimum der Diagonale 
        min=zahlen[i][i];
        index[1]=i;
      }
    }
    System.out.println("Die Zahl ["+index[0]+"]["+index[0]+"] ist die größte Zahl und beträgt: "+max);
    System.out.println("Die Zahl ["+index[1]+"]["+index[1]+"] ist die kleinste Zahl und beträgt: "+min);
  }

  public static void main(String[] args) {
    ZweiArray ZA=new ZweiArray();
    ZA.BerechneSummen();
    ZA.BerechneSummeDiagonalen();
    ZA.BerechneKleinsteGrößteZahl();
    ZA.PrüfeGleicheZahlenInEinerZelle();
    ZA.ErmitteleMaxMinDiagonale();
  }
}
