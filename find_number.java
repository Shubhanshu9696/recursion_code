/*Given an array of length N and an integer x, you need to find if x is present in the array or not. 
Return true or false.  do it recursively */

import java.util.Scanner;
public class find_number{
    static boolean search (int arr[], int n , int x){
        // int size = n;
        if (n==0)
        return false;
        if ( arr[n]== x)
        return true ; 
        else
        return search(arr, n-1, x); 
    }
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in );
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println( "enter the number to search ");
        int x = sc. nextInt();
        System.out.println("Enter the elements of the array ");
        int arr[] = new int [n];
        for ( int i =0 ; i< n ;i++)
        arr[i] = sc.nextInt();
        sc.close();
        boolean ans = search(arr,n, x);
        System.out.println(ans);
    }
}