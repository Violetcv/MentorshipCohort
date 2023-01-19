import java.util.*;

public class IsANumberPrime {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    System.out.print("");
    int t = scn.nextInt();
    // no of test cases
    while(t-->0){
    int n = scn.nextInt();
      //run test xases
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime = false;
                    break;
            }
        }
    }
if(isPrime){
    System.out.println("prime");
           }else{
    System.out.println("not prime");
                }
            }
        }
    }
