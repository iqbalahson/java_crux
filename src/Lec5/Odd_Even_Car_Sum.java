package Lec5;

import java.util.Scanner;

public class Odd_Even_Car_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int car_num = sc.nextInt();
        Odd_Even(car_num);
    }
    public static void Odd_Even(int input ){
        int evem_sum = 0;
        int odd_sum = 0;
        while (input!=0){
            int rem = input%10;
            if (rem%2==0){
                evem_sum = evem_sum+ rem    ;
            }
            else
                odd_sum = odd_sum + rem;
            input = input/10;
        }
        if (evem_sum%4 ==0 || odd_sum %3 == 0){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }

}
