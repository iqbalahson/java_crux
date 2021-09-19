package Lac4;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    public static void  pattern (int n){
        int row = 1;
       // int nst = n;
        int nsp1 = 0;
        int nsp2 = n-2;
        while (row<=n ){
            int csp1 = 1;
            while(csp1<=nsp1){
                System.out.print("  ");
                csp1++;
            }
            System.out.print("* ");
            int csp2 = 1;
            while   (csp2<=nsp2){
                System.out.print("  ");
                csp2++;
            }
            if (row==n/2+1){

            }
            else
                System.out.print("* ");


            System.out.println();
            if (row<=n/2){
                nsp1++;
                nsp2-=2;
            }
            else{
                nsp1--;
                nsp2+=2;
            }

            row++;
        }
    }


}
