package Lec4;

import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        pattern(input);
    }
    public static void  pattern (int n){
        int row = 1;
        int nst = 1;
        int nsp = n-1;
        while (row<=n ){
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while   (cst<=nst  ){
                if(cst%2==0){
                    System.out.print("! ");
                }
                else
                    System.out.print("* ");
                cst++;
            }
            System.out.println();
            nst+=2;
            nsp--;
            row++;
        }
    }




}
