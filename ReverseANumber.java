import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // write ur code here
    System.out.print("");
    int n = scn.nextInt();
    int reversed = 0;
    while(n!= 0){
        int digit = n%10;
        reversed = reversed * 10 + digit;
        n/=10;
        }
    System.out.println(reversed);
   }
 }
