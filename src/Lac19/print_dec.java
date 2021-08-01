package Lac19;

public class print_dec {
    public static void main(String[] args) {
        int n =5;
        dec(n);
    }
    public static void dec(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }
}
