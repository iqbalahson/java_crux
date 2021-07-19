package lac_19;

public class fact_tail_recursion  {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact_tail(n,1));
    }
    public static int  fact_tail(int n, int ans){
        if (n==0){
            return ans ;
        }
       return fact_tail(n-1,ans*n);
    }
}
