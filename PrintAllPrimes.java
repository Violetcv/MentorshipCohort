import java.util.*;

public class PrintAllPrimes{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();//lower limit
        int high = sc.nextInt();//higher limit
        for(int i = low;i<=high;i++){
            boolean isPrime = true;
            if(i<=1){
                isPrime = false;
            }else{
                for(int j = 2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(i+"");
            }
        }
    }
}
