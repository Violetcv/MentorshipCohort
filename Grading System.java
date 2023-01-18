import java.util.*;

public class Grading System {

  public static void main(String[] args) {
    // input - don't change this code
    Scanner scn = new Scanner(System.in);
    int marks = scn.nextInt();
    // input - don't change this code

    // code here
    if(marks>=91){
         System.out.println("Excellent"); }
      else if(90>=marks && marks>80){
         System.out.println("Good"); 
      }
    else if(80>=marks && marks>70){
         System.out.println("Fair"); 
      }
    else if(70>=marks && marks>60){
         System.out.println("Meets Expectations"); 
      }
    else{
      System.out.println("Below Par");
    }
  }
}
