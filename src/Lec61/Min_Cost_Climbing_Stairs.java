package Lec61;


import java.util.*;
public class Min_Cost_Climbing_Stairs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
//        System.out.println(Climbing_Stairs(arr));
        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        System.out.println(Climbing_StairsTD(arr, dp));
        System.out.println(Climbing_StairsBU(arr));

    }
    public static int Climbing_Stairs(int [] arr){
        int zeroth = climb_start(arr,0);        // start from 0th position
        int first = climb_start(arr,1);            // start from 1st position
        return Math.min(zeroth,first);
    }
    public static int climb_start(int [] arr , int i){
        if (i>=arr.length){
            return 0;
        }
        int stepone = climb_start(arr, i+1);
        int step2 = climb_start(arr, i+2);
        return arr[i] + Math.min(step2,stepone);
    }

    public static int Climbing_StairsTD(int [ ] arr, int [] dp){
        int zeroth  = climb_startTD (arr,0,dp);
        int first  = climb_startTD (arr,1,dp);
        return Math.min(zeroth,first);
    }
    public static int climb_startTD(int [] arr , int i ,int [] dp){
        if (i>=arr.length){
            return 0;
        }
        if (dp[i]!= -1){
            return dp[i];
        }
        int stepone = climb_startTD(arr, i+1, dp);
        int step2 = climb_startTD(arr, i+2, dp  );
        dp[i] = arr[i] + Math.min(step2,stepone);
        return dp[i];
    }

    public static int Climbing_StairsBU(int [] arr){
        int dp [ ] = new int[arr.length];
        int n = arr.length;
        dp[0] = arr[0];
        dp[1 ] = arr[1];
        for (int i = 2; i < n; i++) {
            dp[i] = arr[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}
