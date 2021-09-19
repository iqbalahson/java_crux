package Lac3;

import java.util.Scanner;

public class Fibo_Num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fab_num = sc.nextInt();
        fab_func(fab_num, 0,1);
    }
    public static void fab_func(int fab_num, int a , int b){

        while (fab_num-->=1){
            //System.out.println(a + "  " +b  );
            int c = a+b;
          //  System.out.println(a + "  " +b  );
            a = b;
            b = c;
        }
        System.out.println(a);
    }


}
