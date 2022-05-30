/** INPUT:- welcome to coding world
    OUTPUT:- world coding to welcome
 */

import java.util.Scanner;
public class string_wordviseReverse {
    public static String reverseWordWise(String input) {
		// Write your code here
		int n = input.length(); int end=n;int i;
        String currentWord="";
        for( i=n-1;i>=0;i--){
            if(input.charAt(i)==' '){
				 currentWord =currentWord+input.substring(i+1,end)+" ";
         		 end =i;
            }
        }
        currentWord = currentWord+input.substring(i+1,end);
        return currentWord;
	}
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
		String input = s.nextLine();
        s.close();
		System.out.println(reverseWordWise(input));
	}
}
