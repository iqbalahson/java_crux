package Lac5;

import java.util.Scanner;

public class Pascal_Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pascal_traingle(input);
    }

    public static void  pascal_traingle(int input ){
        int row = 0;
        while (row<input){
            int val = 1;
            int r = 0;
            while (r<=row){
                System.out.print(val +" ");
                val  = val* (row-r)/(r+1);
                r++;
            }
            System.out.println();
            row++;
        }

    }


}
