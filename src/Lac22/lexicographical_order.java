package Lac22;

public class lexicographical_order {


    public static void main(String[] args) {
        int endpoint = 1000;
        lexico(0,endpoint);
    }
    public static void lexico(int current, int end){
        if (current>end){
            return;
        }
        System.out.println(current);
        int i=0;
        if (current==0){
            i++;
        }
        for (; i <=9; i++) {
            lexico(current*10 +i, end);
        }
    }
}
