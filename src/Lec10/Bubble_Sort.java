package Lec10;

public class Bubble_Sort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 24, 7, 9, 89, 15};
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
    public static void  bubble_sort(int [] arr){
        for (int pass = 1; pass <arr.length ; pass++) {
            boolean flage = true;
            for (int i = 0; i < arr.length-pass; i++) {
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i ] = arr[i+1];
                    arr[i+1] = temp ;
                    flage = false   ;
                }
            }
            if (flage==true){
                return;
            }

        }
    }
}
