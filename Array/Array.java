import java.util.*;

public class Array{
  int[] zahlen1=new int[10];
  int[] zahlen2=new int[10];
  int buffer;

  public void fill(){
    for(int i=1;i<10;i++){
      zahlen1[i]=i;
      zahlen2[i]=0;
    }
    for(int i:zahlen1){
      System.out.print(i);
    }
  }
  public void verschiebeZahlenNachLinksUndRechts(){
    int buffer=zahlen1[0];
      for(int i=0;i<zahlen1.length-1;i++){
        zahlen1[i]=zahlen1[i+1];
      }
    zahlen1[zahlen1.length-1]=buffer;
    System.out.println("\n");
    for (int i:zahlen1){
      System.out.print(i);
    }
  }

  public void uebertrageZahlenUmgekehrteReihenfolge(){
    for(int i=0;i<zahlen1.length;i++){
      zahlen2[i]=zahlen1[zahlen1.length-(i+1)];
    }  
    for (int i:zahlen1){
      System.out.print(i);
    }
    System.out.println("\n");
    for (int i:zahlen2){
      System.out.print(i);
    }
  }

  public void verschiebeZahlenZweiPositionenNachLinks(){
    int buffer1=zahlen1[0];
    int buffer2=zahlen1[1];
      for(int i=0;i<zahlen1.length-2;i++){
        zahlen1[i]=zahlen1[i+2];
      }
    zahlen1[zahlen1.length-1]=buffer1; 
    zahlen1[zahlen1.length-2]=buffer2;
    System.out.println("\n");
    for (int i:zahlen1){
      System.out.print(i);
    }
 
  }
  public static void main(String [] args){
    Array a=new Array();
    a.fill();
    a.verschiebeZahlenNachLinksUndRechts();
    System.out.println("\n");
    a.uebertrageZahlenUmgekehrteReihenfolge();
    a.verschiebeZahlenZweiPositionenNachLinks();
    System.out.println("\n");
  }
}
