package Lac4;

import java.util.Scanner;

public class Pattern25 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    public static void  pattern (int n){
        int row = 1;
        int nst = 1;
        int nsp = 2*n;
        int val = 1;
        while (row<=n ){

            int csp = 1;
            while(csp<=nsp){
                if(val<9){
                    System.out.print("  ");
                }
                else
                System.out.print("  ");
                csp++;
            }

            int cst = 1;
            while   (cst<=nst  ){
                if(val/10==0){
                    System.out.print( val++ + "   ");
                }
                else
                    System.out.print(val++ + "  " );
                cst++;
            }
            System.out.println();
            nst+=2;
            nsp-=2;
            row++;
        }
    }







}
