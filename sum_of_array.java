import java .util. Scanner;

public class sum_of_array {
    public static int sum(int arr[] , int n){
        if(n<0)
        return 0;
        return (sum(arr, n-1)+arr[n]);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements of array");
        for(int i=0 ; i<n; i++)
            arr[i]= sc.nextInt();
            sc.close();
        int ans = sum(arr,n);
        System.out.println(ans);
    }
}