package Lec4;

import java.util.Scanner;

public class Pattern7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    public static void  pattern (int n){
        int row = 1;
        int nst = n;
        int nsp = n-2;
        while (row<=n ){
            if (row ==1 ||row == n){
                int i = n;
                while (i-->0){
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                int csp = 1;
                while (csp <= nsp) {
                    System.out.print("  ");
                    csp++;
                }
                System.out.print("* ");

            }
            System.out.println();


            row++;
        }
    }

}
