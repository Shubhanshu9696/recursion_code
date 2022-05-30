import java.util.Scanner;
 class recursion_factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int smallAns = fact(n-1);
        return n*smallAns;
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to find factorial");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        int ans= fact(n);
        System.out.println(ans);
        
    }
    
}
