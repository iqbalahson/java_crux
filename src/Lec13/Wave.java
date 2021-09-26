package Lec13;

public class Wave {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };
//        display(arr);
        Wave(arr);

    }
    public static void display  (int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length   ; j++) {
                System.out.print(arr[i][j]  +" ");
            }
            System.out.println();
        }

    }
    public static void Wave(int [ ][] arr){
        int col = arr[0].length-1;
        int row = arr.length-1;
        for (int i = 0; i <=col; i++) {
            if (i % 2 == 0) {

                for (int j = 0; j <= row; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            else    {
                for (int j = row; j >=0; j--) {
                    System.out.print(arr[j][i]+ " ");
                }
            }
            System.out.println();

        }
    }
}
