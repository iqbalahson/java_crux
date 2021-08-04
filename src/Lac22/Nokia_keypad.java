package Lac22;

public class Nokia_keypad {
    // push keypad only 1 to 9
    static String[] get_string = {"abs", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" } ;
    public static void main(String[] args) {
        String st ="23";
        keyPad(st,"");
    }
    public static void keyPad(String ques, String ans){
        if (ques.length()==0){
            System.out.print(ans +" " );
            return;
        }
        char ch = ques.charAt(0);
        String current_string = get_string[ch-49];
        for (int i = 0; i < current_string.length(); i++) {
            keyPad(ques.substring(1), ans+current_string.charAt(i));
        }
    }
}
