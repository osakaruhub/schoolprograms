public class WerteZuweisungen {

    public static void main(String[] arg) {
      int a;
      int b;
      int c;
      int d;
  
      a = 0;
      b = 0;
      c = 0;
      d = 0;
      a = 10;                                              
      System.out.println("1. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
      a = a + 4;
      System.out.println("2. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
      b = 30;
      System.out.println("3. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
      a = b + a + 2;
      System.out.println("4. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
      d = a + b;
      System.out.println("5. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
      c = d + 3 * b;
      System.out.println("6. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
      c = c + 1;
      System.out.println("7. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
      b = -a;
      System.out.println("8. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
      d = b - a + d;
      System.out.println("9. Ausgabe A: " + a + "\tB: " + b + "\tC: " + c + "\tD: " + d );
    }
  }