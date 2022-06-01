/*#### Given a string, compute recursively a new string where all 'x' chars have been removed.


 ##### Sample Input 1 :
    xaxb
##### Sample Output 1:
    ab

##### Sample Input 2 :
    abc
##### Sample Output 2:
    abc

##### Sample Input 3 :
    xx
##### Sample Output 3:

 */    


import java.util.Scanner;
public class remove_char {
    static String removeCharcter(String str , int X){

        if (str.length()== 0)
            return str;
        
        if (str.charAt(0)==X) {
            return removeCharcter(str.substring(1), X);
        }

        return str.charAt(0)+removeCharcter(str.substring(1), X);

    }

    public static void main(String [] args ){
        Scanner sc = new Scanner( System.in);
        System.out.println("enter a string ");
        String str = sc.nextLine();
        System.out.println("enter the character to remove");
        char c = sc.next().charAt(0);
        System.out.println("string after removing charecter");
        System.out.println(removeCharcter(str, c));
    
    }
}
