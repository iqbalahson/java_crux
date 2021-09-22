package Lac11;

public class Water_Tapping {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] arr = {3,0,0,2,0,4};
        System.out.println(rainwater(arr));

    }

    public static int rainwater(int [] arr){
        int left [ ] = new int[arr.length];
        int right [] = new int[arr.length ];
        left[0] = arr [0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
        right [arr.length-1] =arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }

        int water_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            water_sum += Math.min(left[i],right[i]) - arr[i];
        }
        return water_sum;

    }





}
