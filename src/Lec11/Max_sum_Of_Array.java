package Lec11;

public class Max_sum_Of_Array {
        /* find the max sum of array having -ve and +ve nu in it
            get that sum whose sum is max
            -3, 4 - 1, 5, -7
         */
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int[] arr = { -3, 4 - 1, 5, -7 };
            //Arrays.sort(arr);
            System.out.println(max_sum_work(arr));

        }
        public static int max_sum_work(int arr []){
            int max_sum = Integer.MIN_VALUE;
            for (int exceeder = 0; exceeder < arr.length; exceeder++) {
                int current_sum  =0;
                for (int i = exceeder; i < arr.length; i++) {
                    current_sum +=arr[i];
                    max_sum = max (current_sum,max_sum);
                }
            }
            return max_sum;
        }
        public static int max(int a, int b){
            if (a>b){
                return a;
            }
            else {
                return b;
            }
        }

}
