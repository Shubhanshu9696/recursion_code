package recursion;
import java.util.Scanner;

public class recurssion_PMI {

    public static int sum(int n){
        if (n==1) {
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        int ans = sum(n);
        System.out.println("required answer will :"+ans);
    }
}