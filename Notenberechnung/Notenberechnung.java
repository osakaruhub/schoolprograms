/*       if      (prozent>95) {Note=15;}
else if (prozent>90) {Note=14;}
else if (prozent>85) {Note=13;}
else if (prozent>80) {Note=12;}
else if (prozent>75) {Note=11;}
else if (prozent>70) {Note=10;}
else if (prozent>65) {Note= 9;}
else if (prozent>60) {Note= 8;}
else if (prozent>55) {Note= 7;}
else if (prozent>50) {Note= 6;}
else if (prozent>45) {Note= 5;}
else if (prozent>40) {Note= 4;}
else if (prozent>33) {Note= 3;}
else if (prozent>27) {Note= 2;}
else if (prozent>20) {Note= 1;}
*/

import java.util.*;
import java.text.*;

public class Notenberechnung{
    double max;
    double punkte;
    double prozent;
    double Note;
    DecimalFormat df=new DecimalFormat("#.#");

    public void Eingabe(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Eingabe:\n----------------------------------------\nWie viele Punkte konnten Sie maximal erreichen? ");
        max=sc.nextDouble();
        System.out.print("Wie viele Punkte haben Sie erreicht? ");
        punkte=sc.nextDouble();
        if (punkte>max) {System.out.println("\nDu kannst nicht mehr als das maximum haben, Vollidiot!");
                         System.exit(0);}   
    }

    public void Verarbeitung(){
        prozent=punkte/max;
        if      (prozent>=0.95) {Note=15;}
        else if (prozent>=0.90) {Note=14;}
        else if (prozent>=0.85) {Note=13;}
        else if (prozent>=0.80) {Note=12;}
        else if (prozent>=0.75) {Note=11;}
        else if (prozent>=0.70) {Note=10;}
        else if (prozent>=0.65) {Note= 9;}
        else if (prozent>=0.60) {Note= 8;}
        else if (prozent>=0.55) {Note= 7;}
        else if (prozent>=0.50) {Note= 6;}
        else if (prozent>=0.45) {Note= 5;}
        else if (prozent>=0.40) {Note= 4;}
        else if (prozent>=0.33) {Note= 3;}
        else if (prozent>=0.27) {Note= 2;}
        else if (prozent>=0.20) {Note= 1;}
    }

    public void Auswertung(){
        prozent=prozent*100;
        System.out.println("\nAusgabe:\n---------------------------------------\nSie haben "+punkte+" von "+max+" Punkten erreicht!");
        System.out.println("\nDas enspricht "+df.format(prozent)+" Prozent und damit der Note: "+Note+".");
    }

    public static void main(String [] args){
        Notenberechnung Nt;
        Nt=new Notenberechnung();
        System.out.println("****************************************\n\tNotenberechnung\n****************************************\n");
        Nt.Eingabe();
        Nt.Verarbeitung();
        Nt.Auswertung();
    }
}