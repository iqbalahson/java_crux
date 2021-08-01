package Lac20;

public class no_2_head_are_consecutive {
    public static void main(String[] args) {
        int n= 3;
        String st = "";
        no_consecutive(n,st,false);
    }
    public static void  no_consecutive(int n, String ans,boolean flage){
        if (n==0){
            System.out.println(ans);
            return;
        }
        if (!flage){
            no_consecutive(n-1, ans+'H' , true);
        }
        no_consecutive(n-1,ans+'T', false);

    }
}
