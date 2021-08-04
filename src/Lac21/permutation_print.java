package Lac21;

public class permutation_print {
    public static void main(String[] args) {
        String st = "bcd";
        permutation(st,"");
    }
    public static void  permutation(String ques, String ans ){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length()   ; i++) {
            String reg   = ques.substring(0,i) + ques.substring(i+1);
            permutation(reg, ans+ques.charAt(i));
        }
    }
}
