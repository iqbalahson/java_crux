package Lac22;

public class Board_path {

    public static void main(String[] args) {
        /* nu of path is 1,2,3,4,5,6   dice thrown
        * nu of ways to reache at n*/
        int standing = 0;
        int Toreach = 4;
        boar_path(standing,Toreach," ");
    }
    public static void  boar_path(int current, int end, String ans){
        if (current==end){
            System.out.println(ans);
            return;
        }
        for (int disc = 1  ; disc <=6 && current+disc<=end ; disc++) {
            boar_path(current+disc, end, ans+disc);
        }
    }
}
