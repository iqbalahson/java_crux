    package Lec61;

    import java.util.Arrays;

    public class Lis {
        public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] arr = {10,9,2,5,3,7,101,18};
            System.out.println(LIS(arr));
    }
    public static int LIS(int [] arr ){
            int n = arr.length;
            int [] dp = new  int [n ];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j]<arr[i]){
                    dp  [i] = Math.max(dp[j]++, dp[i]);
                }
            }
        }
        Arrays.sort(dp);
        return dp[n-1];
    }



    }
