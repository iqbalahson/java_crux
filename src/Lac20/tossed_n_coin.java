package Lac20;

public class tossed_n_coin {
    public static void main(String[] args) {
        int n = 3;
        n_coin_tossed(n , "");
    }
    public static void n_coin_tossed(int n , String ans){
        if (n==0){
            System.out.println(ans  );
            return;
        }
        n_coin_tossed(n-1, ans+'H') ;
        n_coin_tossed(n-1,ans+'T');
    }
}
