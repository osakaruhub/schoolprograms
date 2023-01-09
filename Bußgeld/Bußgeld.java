import java.util.*;

public class Bußgeld{
    int ort;    //innerhalb oder außerhalb geschlossener Ortschaften?
    double höchst; //Höchstgeschwindigkeit
    double km;     //gefahrenen km/h
    double zuvielkm1;
    double zuvielkm2;
    double bußgeld;
    int strafpunkte;
    int fahrverbot;

    
    public void Eingabe(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Eingabe:\n****************************************\nWo haben Sie die Geschwindigkeitsübertretung begangen?\n1: innerhalb geschlossener Ortschaften,\n2. ausserhalb geschlossener Ortschaften\nBitte geben Sie die entsprechende Kennziffer ein: ");
        ort=sc.nextInt();
        if (ort==1||ort==2) {}
        else {System.out.println("Sie haben die falsche Kennziffer ausgewählt, Programm wird beendet...");
        System.exit(0);}
        System.out.print("Wie Hoch ist die erlaubte Höchstgeschwindigkeit? (in km/h)\nauf dieser Strasse? ");
        höchst=sc.nextInt();
        System.out.print("Wie schnell sind Sie gefahren? (in km/h)? ");
        km=sc.nextDouble();    
    }

    public void Verarbeitung(){
        zuvielkm1=km-höchst;
        if (höchst>=100) {zuvielkm2=zuvielkm1*0.97;}
        else {zuvielkm2=zuvielkm1-3;}
        if (ort==1) {
        if (zuvielkm2<=10)                    {bußgeld=30;}

        else if (zuvielkm2>10&&zuvielkm2<=15) {bußgeld=50;}

        else if (zuvielkm2>15&&zuvielkm2<=20) {bußgeld=70;
                                               strafpunkte=1;}

        else if (zuvielkm2>20&&zuvielkm2<=25) {bußgeld=115;
                                               strafpunkte=1;}

        else if (zuvielkm2>25&&zuvielkm2<=30) {bußgeld=180;
                                               strafpunkte=1;}

        else if (zuvielkm2>30&&zuvielkm2<=40) {bußgeld=260;
                                               strafpunkte=2;
                                               fahrverbot=1;}

        else if (zuvielkm2>40&&zuvielkm2<=50) {bußgeld=400;
                                               strafpunkte=2;
                                               fahrverbot=1;}

        else if (zuvielkm2>50&&zuvielkm2<=60) {bußgeld=600;
                                              strafpunkte=2;
                                              fahrverbot=2;}

        else if (zuvielkm2>60&&zuvielkm2<=70) {bußgeld=700;
                                               strafpunkte=2;
                                               fahrverbot=2;}

        else                                  {bußgeld=800;
                                               strafpunkte=2;
                                               fahrverbot=3;}
        }

        if (zuvielkm2<=10)                    {bußgeld=20;}

        else if (zuvielkm2>10&&zuvielkm2<=15) {bußgeld=40;}

        else if (zuvielkm2>15&&zuvielkm2<=20) {bußgeld=60;}

        else if (zuvielkm2>20&&zuvielkm2<=25) {bußgeld=100;
                                               strafpunkte=1;}

        else if (zuvielkm2>25&&zuvielkm2<=30) {bußgeld=150;
                                               strafpunkte=1;}

        else if (zuvielkm2>30&&zuvielkm2<=40) {bußgeld=200;
                                               strafpunkte=2;
                                               fahrverbot=1;}

        else if (zuvielkm2>40&&zuvielkm2<=50) {bußgeld=320;
                                               strafpunkte=2;
                                               fahrverbot=1;}

        else if (zuvielkm2>50&&zuvielkm2<=60) {bußgeld=480;
                                              strafpunkte=2;
                                              fahrverbot=2;}

        else if (zuvielkm2>60&&zuvielkm2<=70) {bußgeld=600;
                                               strafpunkte=2;
                                               fahrverbot=2;}

        else                                  {bußgeld=700;
                                               strafpunkte=2;
                                               fahrverbot=3;}

    }

    public void Auswertung(){
        if (ort==1) {System.out.println("Ausgabe:\n****************************************\nSie haben sich nicht an die Vorschriften gehalten und\nsind Innerhalb geschlossener Ortsschaften "+zuvielkm1+" km/h zu schnell gefahren.");} 
        else {System.out.println("Ausgabe:\n****************************************\nSie haben sich nicht an die Vorschriften gehalten und\nsind außerorts "+zuvielkm1+" km/h zu schnell gefahren.");
    } 
        if (strafpunkte==1) {System.out.println("\n Sie müssen "+bußgeld+" Euro bezahlen und bekommen 1 Strafpunkt.");}
        else if (fahrverbot==1) {System.out.println("\n Sie müssen "+bußgeld+" Euro bezahlen, bekommen"+strafpunkte+" Strafpunkte und bekommen 1 Monat Fahrverbot.");}
        else {System.out.println("\n Sie müssen "+bußgeld+" Euro bezahlen, bekommen "+strafpunkte+" Strafpunkte und bekommen "+fahrverbot+" Monate Fahrverbot.");
    }
    }

    public static void main(String [] args){
        Bußgeld bg;
        bg=new Bußgeld();
        System.out.println("****************************************\n\tBußgeld-Berechnung\n****************************************");
        bg.Eingabe();
        bg.Verarbeitung();
        bg.Auswertung();
    }
}
