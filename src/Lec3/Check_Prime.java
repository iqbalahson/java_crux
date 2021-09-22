package Lec3;

import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check_prime(num);
    }
    public static void check_prime(int num ){
        int i = 2;
        boolean counter =false ;
        while (i<=num/2){
            if (num%i==0)
            {
                System.out.println("No");
                counter = true;
                break;

            }
            i++;
        }
        if (!counter){
            System.out.println("Yes");
        }


    }

}
