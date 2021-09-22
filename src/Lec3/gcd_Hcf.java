package Lec3;

import java.util.Scanner;

public class gcd_Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1>num2){

            call_gcd(num1, num2);
        }
        else
            call_gcd (num2, num1);
    }
    public static void call_gcd(int devidend, int devisor){
        int rem = Integer.MAX_VALUE;

                while (rem!=0  ){
                    rem = devidend%devisor;
                    devidend = devisor;
                    devisor = rem;

                }
        System.out.println(devidend);
    }



}
