/*#### Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.

##### Input format : 
    Numeric string S (string, Eg. "1234")

##### Output format : 
    Corresponding integer N (int, Eg. 1234)

 ##### Sample Input 1 :
    1231
##### Sample Output 1 :
    1231

##### Sample Input 2 :
    12567
##### Sample Output 2 :
    12567
 */

import java .util.Scanner ;
public class convertIntegertoString {

	static String convertString(int n , String str  ){
		int rem ;

		if (n==0){
			str="0";
			return str ;
		}
		
		if(n>=1){
			while (n>0){
				rem = n%10;
				str = rem + str;
				n = n/10;
			}
		}
		return str;
	}

	public static void main (String [] args ){
		Scanner sc = new Scanner( System.in);
		System.out.println("enter the integer value");
		int n = sc.nextInt();
		String str = "";
		sc.close();
		System.out.println("after converting integer into string");
		System.out.println(convertString(n, str));
	}
}
