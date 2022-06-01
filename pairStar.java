/** #### Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

##### Input format :
    String S

##### Output format :
    Modified string

 ##### Sample Input 1 :
    hello

##### Sample Output 1:
    hel*lo

##### Sample Input 2 :
    aaaa

##### Sample Output 2 :
    a*a*a*a
 
 */
import java.util.Scanner;
public class pairStar {

    static String finalString= "";

    static void modifiedString(String str , int i){
        int n = str.length()-1;
        
        finalString = finalString + str.charAt(i) ;
        
        if(i==n)
            return ;

        if ( str.charAt(i) == str.charAt(i+1) ) 
            finalString = finalString + '*' ;
        
        modifiedString(str,i+1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        sc.close();
        modifiedString(str,0);
        System.out.println("string after pair star ");
        System.out.println(finalString);
    }
}
