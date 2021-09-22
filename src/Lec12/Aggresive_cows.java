package Lec12;

import  java.util.*;
public class Aggresive_cows {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int nost = sc.nextInt();
        int noc = sc.nextInt();
        int[] stalls = new int[nost];
        for (int i = 0; i < stalls.length; i++) {
            stalls[i] = sc.nextInt();
        }

        Arrays.sort(stalls);
        System.out.println(AggressiveCows(stalls, noc));

    }

    public static int AggressiveCows(int [] stalls , int noc){
        int low = 0;
        int high = stalls[stalls.length-1]-stalls[0];
        int ans = 0;
        while (low<=high){
            int mid = (low+high)/2;
            if (ispossible(stalls,mid,noc)){
                ans = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return ans;
    }
    public static boolean ispossible(int [ ] stalls , int mid , int noc ){
        int nu_cows = 1;
        int placeholder = stalls[0];
        int i = 1 ;
        while (i< stalls.length){
            if (stalls[i]-placeholder>=mid){
                placeholder = stalls[i];
                nu_cows++;
            }
            i++;
        }
        if (nu_cows>=noc){

            return true;
        }
        return false;
    }

}
