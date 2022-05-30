/*####Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
 Do this recursively. Indexing in the array starts from 0.
     #####Sample Input : 
        5
        9 8 10 8 8
        8
    
    #####Sample Output :
        1 3 4
*/
import java.util.Scanner;
public class find_all_index {

    static void findindex(int arr[] , int item, int index){
        if(index>arr.length-1)
           return;
        if(arr[index] == item)
            System.out.print(index+" ");
            findindex(arr, item, index+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array ");
        for(int i =0; i<n ;i++)
            arr[i] = sc.nextInt();
        System.out.println("enter the number to be searched ");
        int item = sc.nextInt();
        findindex(arr,item,0);

    }
}
