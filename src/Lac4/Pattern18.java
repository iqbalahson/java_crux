package Lac4;

import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    public static void  pattern (int n){
        int row = 1;
        int nst = 1;
        int nsp = (n-1)/2;
        while (row<=n ){
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while   (cst<=nst  ){

                System.out.print("* ");
                cst++;
            }
            if(row<=(n-1)/2){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }

            System.out.println();
            row++;
        }
    }




}
