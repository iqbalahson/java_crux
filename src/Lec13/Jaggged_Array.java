package Lec13;

import java.util.Scanner;

public class Jaggged_Array {
    public static void main(String[] args) {
        jagged_array();
        /*
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [][] array = new int[n][];
        for (int i = 0; i < array.length    ; i++) {
            array[i] =  new int[i+2];
        }





        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
            System.out.println();
        } for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

         */
    }

    public static void jagged_array() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] jagged = new int[row][];
        for (int i = 0; i < jagged.length; i++) {
            int col = sc.nextInt();
            jagged[i] = new int[col];
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j]);
            }
            System.out.println();

        }
    }
}
