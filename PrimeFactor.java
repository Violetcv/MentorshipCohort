import java.util.*;

public class PrimeFactor{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  // prime factorisation
  for(int i = 2;i<=num;i++){
      while(num%i==0){
        System.out.print(i+" ");
        num/=i;
      }
    }
  }
}
