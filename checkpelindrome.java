/*#### Check whether a given String S is a palindrome using recursion. Return true or false.
##### Input Format : 
    String S
##### Output Format : 
    'true' or 'false'


 #####Sample Input 1 :
    racecar
#####Sample Output 1:
    true

#####Sample Input 2 :
    ninja
#####Sample Output 2:
    false
*/

import java.util.Scanner;

public class checkpelindrome{
    

    static String reverse(String str){
        if(str == null || str.length()<=1)
            return str;
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = reverse(str);   
        if(str.equals(str1))
            System.out.println("string is pelindrome");
        else  System.out.println("string is not pelindrome");
    }
}




     /* program to check any number is pelindrom or not*/

import java.util.Scanner;
public class checkpelindrome {

    static int pelindrome(int n,int temp ){
        if(n==0)
            return temp;
        temp = (temp*10) + (n%10);
        return pelindrome(n/10, temp) ;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter no. to check pelindrome");
        int n = sc.nextInt();
        int temp = pelindrome(n,0);
        if(temp == n)
        System.out.println("pelindrome number");
        else
        System.out.println("not a pelindroem number");
    }

}
