/**fibonacci series:- 0,1,1,2,3,5,8,13..,,
 if we enter 5, then for 5th element fabonacci series will be 5 
 */
import java.util.Scanner;
public class fibonacci_series {

    public static int fibonacci(int n ){
        if (n==0)
         return 0;
        else if (n==1)
        return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));   
    }
}

// fabonacci series by without using recursion
// public class fibonacci_series{
//     public static void main (String[] args ){
//         System.out.println("Enter the nth number");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         int a=0, b=1;
//         if ( n==0)
//          System.out.println(a);
//         for (int i = 2; i<=n ; i++){
//            int c = a+b;
//            a=b;
//            b=c;
//         } System.out.println(b);
        
//     }
// }

