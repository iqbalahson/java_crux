package Lec3;

import java.util.Scanner;

public class Reverse_By_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Index_reverse(input);
    }

    public static void Index_reverse(int input ){

         int ans = 0 ;
         int index = 1;
         while  (input!=0){
             int rem = input%10;
             ans = (int) (ans + index*Math.pow(10,(rem-1)));
             input /=10;
             index++;
         }

        System.out.println(ans);

    }


}
