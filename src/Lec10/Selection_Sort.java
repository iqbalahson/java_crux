package Lec10;

public class Selection_Sort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 24, 7, 9, 89, 15};
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void selection_sort(int [ ] arr){
        for (int counter = 0; counter < arr.length - 1; counter++) {
            int min_index = counter;
            for (int i = counter+1; i < arr.length; i++) {
                if (arr[i]<arr[min_index]){
                    // update min index
                    min_index = i;
                }
            }
            //swap
            int temp = arr[counter];
            arr[counter] = arr[min_index];
            arr[min_index] = temp;
        }

    }


}
