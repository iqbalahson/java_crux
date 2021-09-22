package Lec6;

import java.util.Scanner;

public class Binary_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        todec(binary);
    }

    public static void todec(int num){
        int mul =1;
        int dec_num = 0 ;
        while (num!=0){
            int rem  = num%10;
            dec_num = dec_num + rem*mul;
            mul*=2;
            num/=10;
        }
        System.out.println(dec_num);
    }


}
