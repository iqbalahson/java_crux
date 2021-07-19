package lac_19;

public class fact_head_recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact_head(n));
    }

    public static int fact_head(int n){
        if (n==0)  {
            return 1;
        }
       return n*fact_head(n-1);
    }

}
