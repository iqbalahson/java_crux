package Lec14;

public class Transpose {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 }, { 23, 24, 25, 26 } };
        trnaspose(arr);
        display(arr);
    }

    public static void trnaspose(int [] [ ] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                if (i!=j){
                    //swap
                    int temp = arr[i][j];
                   // System.out.println(temp);
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

    }
    public static void  display(int [] [ ]array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
