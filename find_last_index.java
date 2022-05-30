/**Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
####Do this recursively. Indexing in the array starts from 0.
#####Constraints :
####1 <= N <= 10^3

 #####Sample Input : 
    4
    9 8 10 8
    8

#####Sample Output :
    3
 */

import java.util.Scanner;
public class find_last_index {
    public static int findIndex(int arr[], int item, int index){
        int count=0;
        if(index>arr.length-1){
        return -1;
        }
        if(arr[index]==item)
        count =index;
        if(index==arr.length-1)
        return count;
        return findIndex(arr,item,index+1);
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i = 0; i<n; i++)
         arr[i]=sc.nextInt();
        int index = 0;
        System.out.println("enter the no. to be search");
        int item=sc.nextInt();
        sc.close();
        int ans = findIndex(arr,item,index);
        System.out.println("last index ="+ans);
    }
}
