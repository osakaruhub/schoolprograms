public class Aufgabe {
    public static void main(String [] args){
    int w = 3; 
    int x = 1;
    int y = 3;
    int z = 4;

    if (y <= 2 && y == 3) {
    System.out.println("true!" );
    }
    else {
    System.out.println("false!" );
    }
    if (y <= 2 || y == 3) {
    System.out.println("true!" );
    }
    else {
    System.out.println("false!" );
    }
    if (y <= 3 || y != 2 && y >= 4) {
    System.out.println("true!" );
    }
    else {
    System.out.println("false!" );
    }
    if ((y <= 3 ||  y != 2 ) && y >= 4) {  
    System.out.println("true!" );
    }
    else {
    
    System.out.println("false!" );
    }
    if (x < y && w > z && x == 0 && w!=2 || x >= -1){ 
    System.out.println("true!" );
    }
    else {
    System.out.println("false!" );
    }
    if (x != 2 && y > 3) {		
    System.out.println("true!" );
    }
    else {
    System.out.println("false!" );
    }
    if (z >= 1  ||  z <= 3){
    System.out.println("true!" );
    }
    else {
    System.out.println("false!" );
    }
    if (y <= 1 && y >=6 ){
    System.out.println("true!" );
    }
    else {
    System.out.println("false!" );
    }
    }
    
}