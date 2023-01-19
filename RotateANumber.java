import java.util.*;
   
   public class RotateANumber{
   
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("");
        String n = sc.nextLine();
        System.out.print("");
        int k = sc.nextInt();
        k = k % n.length();
        if(k<0) k = n.length() + k;
        String rotated = n.substring(n.length()-k) + n.substring(0,n.length()-k);
        System.out.println(rotated);
    }
}
