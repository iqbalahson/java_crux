package Lec10;

public class Binary_Search {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 24, 7, 9, 89, 15};
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(binar_search(arr, 8));
//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.print(arr[i] + " ");
//        }
    }

    public static int  binar_search(int [] arr , int item){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid  = (low+high)/2;
            if (arr[mid] == item ){
                return mid;
            }
            else if (arr[mid]<item){
                low=mid +1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }

}
