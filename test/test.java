import java.util.*;

public class test{
  String not="=NOT()";
  String and="=AND()";
  String or ="=OR()" ;
  String function;
  String function0;
  String function1;
  String ausgabe0;
  String ausgabe1;
  public static void main(String [] args){
    test t;
    t=new test();
    t.huh();
  }
  public void huh(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please name the function");
    function=sc.next();
    if (function.contains("(")) {
      ausgabe0=function.substring(function.indexOf('(')+1, function.indexOf(')')).trim();
      function0=function.replace(ausgabe0,"");
    }
    if (ausgabe0.contains("(")) {
      ausgabe1=function0.indexOf("(",function0.indexOf('(')+1).trim();
      function1=function0.replace(ausgabe0,"");
      
    }
    System.out.println(function0);
    System.out.println(function1);
    System.out.println(ausgabe0);
    System.out.println(ausgabe1);
  }
}   
