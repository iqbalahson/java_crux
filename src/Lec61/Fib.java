package Lec61;

public class Fib {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 10;
//         System.out.println(FibNo(n));            // recursive approach
        int[] dp = new int[n + 1];
//        System.out.println(FibNoTD(n, dp));       // dp recursive approach
//        System.out.println(FibNoBU(n, dp));             // dp iterative Approach
        System.out.println(FibNoBUSpOPTi(n));            // dp iterative approach and space optimization
    }
    public static int FibNo(int n)  {
        if (n==0 || n==1){
            return n;
        }
        System.out.println(n);
        int fibo1 = FibNo(n-1);
        int fibo2 = FibNo(n-2);
        return  fibo1+fibo2;
    }
    public static int FibNoTD(int n, int [ ] dp){
        if (n==0 || n==1){
            return n;
        }
        if (dp[n]!=0){
            return dp[n];
        }
        System.out.println(n);
        int fibo1 = FibNo(n-1);
        int fibo2 = FibNo(n-2);
        int fibo =   fibo1+fibo2;
        dp  [n ] = fibo;
        return dp[n];
    }
    public static int FibNoBU(int n, int [] dp ){

        dp [ 0 ] = 0;
        dp [ 1 ] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp  [i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int FibNoBUSpOPTi(int n){
        int a = 0;
        int b = 1;
        for (int i = 2; i < n+1; i++) {
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }

}
