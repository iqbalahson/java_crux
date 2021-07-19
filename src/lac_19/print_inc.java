package lac_19;

public class print_inc {
    public static void main(String[] args) {
        int n  = 5;
        inc(n);
    }
    public static void inc(int n){
        if (n==0){
            return;
        }
        inc(n-1);
        System.out.println(n);

    }
}
