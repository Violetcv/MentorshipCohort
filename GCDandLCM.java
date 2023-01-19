import java.util.*;
    
    public class GCDandLCM{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      //Gcd
      int gcd = 1;
      for(int i = 1;i<=num1 && i<=num2;i++){
          if(num1 % i == 0 && num2 % i == 0){
              gcd = i;
          }
     }
     System.out.println(gcd);
     //lcm
     int lcm = (num1*num2)/gcd;
     System.out.println(lcm);
      }
    }
