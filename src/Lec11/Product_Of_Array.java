package Lec11;

public class Product_Of_Array {
    /* Do the product of all index except that index which is specified
    and put in the specified position
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {4, 5, 6, 3};
        int[] ans = Product_Array(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
//        System.out.println(Product_of_Array(arr));
    }

    public static int [] Product_of_Array(int [] arr){

        int [] left = new int[arr.length];
//        int [] right = new int[arr.length/2];
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product*arr[i];
        }
//        right [arr.length-1] = 1
        for (int i = 0; i <arr.length ; i++) {
            left[i] = product/arr[i ];
        }
        return left;
    }

    public static int [] Product_Array(int [] arr){

        int [] left = new int[arr.length];
        int [] right = new int[arr.length];
         left[0] = 1;

        for (int i = 1; i <arr.length ; i++) {
            left[i] = left[i-1]*arr[i-1 ];
        }
//        right [ arr.length-1] = 1;
//        for (int i = arr.length-2  ; i >=0; i--) {
//            right[i] = right[i+1]*arr[i+1];
//        }
//        for (int i = 0; i < arr.length; i++) {
//                left[i ]= left[i] *right[i];
//        }
//

        /* replace right array by
        r = 1
        and do in 1 shot
         */
        int r= 1;
        for (int i = arr.length-1   ; i >=0  ; i--) {
                left [i] = left[i]*r;
                r*=arr[i];
        }
        return left;
    }


    }
