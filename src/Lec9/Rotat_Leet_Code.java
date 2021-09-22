package Lec9;

public class Rotat_Leet_Code {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        //rotate(arr, k);
        Reversal_Algo(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }


    public static void  Reversal_Algo(int [] arr , int k){
        k = k%arr.length;
        rotate(arr, arr.length-k , arr.length-1 );
        rotate(arr,0,arr.length-k-1);
        rotate(arr,0,arr.length-1);

    }

    public  static void rotate ( int [] arr , int i, int j){
        while (i<j){
            int temp     = arr[i];
            arr[ i ] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
