package Lac8;

import java.util.Scanner;

public class Chew_Baca_Nu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        System.out.println(Chewbaca(input));
    }

        public static long   Chewbaca(long num){
        long mul = 1;
        long ans= 0;
        while (num>9){
            long rem = num%10;
            if (rem>9-rem   ){
                ans = ans +(9-rem)*mul;
            }
            else
                ans = ans +rem*mul;

            mul*=10;
            num/=10;

        }
        if (num!=9){
            if(num>9-num){
                num = 9-num;
            }
        }
        ans = ans +num*mul;
        return  ans ;
        }
}
