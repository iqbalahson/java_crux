package Lec5;

import java.util.Scanner;

public class Game_play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-->0   ) {
            int limit_Aysh = sc.nextInt();
            int limit_Harshit = sc.nextInt();
            play(limit_Aysh,limit_Harshit);

        }
    }
    public static void  play    (int limit_Aush, int limit_Harshit){
    int purch_phone = 1;
    int Ayush_purchase = 0;
    int Harshit_purchase = 0;
    while(true){
        Ayush_purchase = Ayush_purchase + purch_phone;
        if (Ayush_purchase > limit_Aush) {
            System.out.println("Ayush lost ");
            break;
        }
        purch_phone++;
        Harshit_purchase = Harshit_purchase+purch_phone;
        if (Harshit_purchase>limit_Harshit)
        {
            System.out.println("Harshit lost"   );
            break;
        }

    }
    }
}
