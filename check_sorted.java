import java.util.Scanner;
public class check_sorted {

    static boolean checkSorted ( int arr[] ){
        if (arr.length<=1)
        return true;
        int smallInput[] = new int [arr.length -1];
        for(int i =1; i<arr.length ; i++)
         smallInput[i-1] = arr[i];
        boolean smallans = checkSorted(smallInput);

        if (!smallans)
        return false;
        if (arr[0]<=arr[1]) return true ;
        else return false ;

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter the elements of the array");
        for(int i = 0; i<n ; i++)
            arr[i]= sc.nextInt();
        sc.close();
        boolean ans = checkSorted(arr);
        System.out.println(ans);
    }
}
