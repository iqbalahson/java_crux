package Lec4;

import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    public static void  pattern (int n){
        int row = 1;
        int nst = n;
        int nsp = n-1;
        while (row<=2*n-1 ){
            int csp = 1;
            while(csp<=nsp){
                System.out.print("   ");
                csp++;
            }
            int cst = 1;
            while   (cst<=nst  ){
                System.out.print("*  ");
                cst++;
            }
            System.out.println();
            if (row<=n-1){
                nst--;
                nsp--;
            }
            else    {

                nst++;
                nsp++;
            }
            row++;
        }
    }

}
