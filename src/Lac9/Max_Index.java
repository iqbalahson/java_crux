package Lac9;

import java.util.Scanner;

public class Max_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        int [] arr   = new int[leng];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxindex(arr));
    }
    // no duplicacy
    public static int maxindex (int [] arr ){

        int index =0 ;
        for (int i = 1; i < arr.length; i++) {
            if (arr[0]<arr[i]){
                index = i;
            }
        }
        return index;
    }
}
