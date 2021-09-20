package Lac10;

public class Insertion_Sort{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {6, 5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
    public static void  insertion_sort(int [] arr){
        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int i = counter+1; i > 0; i--) {
                if (arr[i]<arr[i-1] ){
                    //swap
                    int temp = arr[i];
                    arr[i ] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
    }
}
