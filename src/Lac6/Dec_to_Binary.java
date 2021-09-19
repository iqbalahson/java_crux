package Lac6;

import java.util.Scanner;

public class Dec_to_Binary {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int decnum = sc.nextInt();
    tobinary(decnum);
}

    public static void tobinary(int num){
        int mul =1;
        int binay_num = 0 ;
        while (num!=0){
            int rem  = num%2;
            binay_num = binay_num + rem*mul;
            mul*=10;
            num/=2;
        }
        System.out.println(binay_num);
    }
}
