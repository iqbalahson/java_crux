package Lac20;

import java.util.Scanner;

public class all_indices_arr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 5;
        int [] array   = {4, 5, 7, 3, 8,5, 3,23,5,1,5,8};
        int [] arr = return_all_indices(array,key, 0, 0);
        for (int j :
                arr){
            System.out.print(j + " ");
        }
    }
    public static int [] return_all_indices(int [] arr, int key,int index,int count){
        if (index == arr.length-1){
            return new int[count];
        }
        if (arr[index]==key){
           count++;
           int [] res =  return_all_indices(arr, key, index+1, count);
           res[count-1] =index;
           return res;
        }
        else
        return return_all_indices(arr, key, index+1,count);
    }


}
