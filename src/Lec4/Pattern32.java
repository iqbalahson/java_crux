package Lec4;

import java.util.Scanner;

public class Pattern32 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    public static void  pattern (int n){
        int row = 1;
        int nst = 1;
        int nsp = n-1;
        int val = 1;
        while (row<=2*n-1 ){

            int cst = 1;
            while   (cst<=nst  ){
                if(cst%2!=0)
                System.out.print(val +" ");
                else
                    System.out.print("* ");
                cst++;
            }
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            if(row<=n-1){
                nst++;
                val++;
                nsp--;
            }
            else{
                val--;
                nst--;
                nsp++;
            }

            System.out.println();
            row++;
        }
    }

}
