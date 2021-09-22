package Lec5;

import java.util.Scanner;

public class Print_Sereis_Of_Given_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        int num2 = sc.nextInt();
        series(num1,num2);
    }
    public static void series(int num_pattern, int divisible_num){
        int counter = 0;
        int i = 1;
        while (counter++<num_pattern){
            int val = (3*i )+ 2 ;
            if (val%divisible_num!=0){
                System.out.println(val);

            }
            i++;
        }
    }
}
