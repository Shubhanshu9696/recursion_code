/*#### Given k, find the geometric sum i.e. 
    1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
#### using recursion.

 ##### Sample Input 1 :
    3

##### Sample Output 1 :
    1.875

##### Sample Input 2 :
    4

##### Sample Output 2 :
    1.93750
*/

import java.util.Scanner;
import java.lang.Math;
public class geometricsum {
    static double geometricSum(int n ){
        
        if (n==0) {
            return 1;
        }

            double sum= (1/(Math.pow(2, n)))+geometricSum(n-1);
            
        return sum;
            
    }
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        System.out.println(geometricSum(n));

    }
}


// alternate method for this question is:

// import java.util.Scanner;
// import java.lang.Math;
// public class geometric_sum {
//     static double geometricSum(int n ){
//         double sum = 0;

//         for (int i = 0 ; i<=n ;i++){
//             sum = sum + (1/(Math.pow(2, i)));
//         }
//         return sum ; 
            
//     }
//     public static void main (String[] args ){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number ");
//         int n= sc.nextInt();
//         System.out.println(geometricSum(n));

//     }
// }