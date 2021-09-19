package Lac4;

import java.util.Scanner;

public class Pattern17 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    public static void  pattern (int n){
        int row = 1;
        int nst = n/2;
        int nsp = 1;
        while (row<=n ){

                int cst1 = 1;
                while (cst1 <= nst) {

                    System.out.print("* ");
                    cst1++;
                }
                int csp = 1;
                while (csp <= nsp) {
                    System.out.print("  ");
                    csp++;
                }
                int cst = 1;
                while (cst <= nst) {

                    System.out.print("* ");
                    cst++;
                }
                if (row <= n/2) {
                    nst--;
                    nsp+=2;
                } else {
                    nst++;
                    nsp-=2;
                }

            System.out.println();
            row++;
        }
    }



}
