package Lec13;

public class Spiral {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] arr = {{11, 12, 13, 14, 31}, {15, 16, 17, 18, 41}, {19, 20, 21, 22, 51},
                {23, 24, 25, 26, 61}};
        print(arr);

    }

    public static void print(int[][] arr) {
        int min_col = 0;
        int max_col = arr[0].length - 1;
        int min_row = 0;
        int max_row = arr.length - 1;
        int count = arr.length * arr[0].length;
        //System.out.println(count);
        while (count > 0) {
            for (int j = min_col; j <= max_col; j++) {
                System.out.print(arr[min_row][j] + " ");
                count--;
            }

            min_row++;
           // System.out.println();
            for (int j = min_row; j <=max_row; j++) {
                System.out.print(arr[j][max_col] +" ");
                count--;
            }
            max_col--;
          //  System.out.println();
            for (int j = max_col; j >=min_col ; j--) {
                System.out.print(arr[max_row][j]+ " ");
                count--;
            }
            max_row--;
          //  System.out.println();
//            System.out.println();
            for (int j = max_row; j >=min_row ; j--) {
                System.out.print(arr[j][min_col]+ " ");
                count--;
            }
            min_col++;
          //  System.out.println();
        }
    }
}
