/* Given an integer N, count and return the number of zeros that are present in the given integer using recursion.

Sample Input 1 :
    10204

Sample Output 1 :
    2

Sample Input 2 :
    708000

Sample Output 2 :
    4
*/

import java.util.Scanner;
public class count_zero {

    static int findzero(int n){
        if(n==0)
            return 1;
        
        if(n<10)
            return 0;
                
        if (n%10==0)
            return 1+findzero(n/10);
        
        return findzero(n/10);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findzero(n);
        System.out.println(ans);
    }
    
}
