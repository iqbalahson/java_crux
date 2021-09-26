package Lec14;

public class Matrix_Search {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(Search(arr, 8));

    }
    public static int Search(int [][] arr , int item){
        int col = arr[0].length-1;
        int row = 0;
        while (row< arr.length && col>=0){
            if (arr[row][col]== item){
                return 1 ;
            }
            if (arr[row][col]>item){
                col --;
            }
            else
                row++;
        }
        return -1;
    }
}
