package Lac20;

import java.util.ArrayList;
import java.util.Scanner;

public class all_indices_arr {
      static   ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 0;
        int [] array   = {4, 5, 7, 3, 8,5, 3,23,5,1,5,8};
        int [] arr = return_all_indices(array,key, 0, 0);
        ArrayList list1 = all_indices(array,0, 0 );
        for (int j :
                arr){
            System.out.print(j + " ");
        }
        for (int i = 0; i <list1.size(); i++) {
            System.out.print(list1.get(i)+ " ");
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
    public static ArrayList<Integer> all_indices(int [] arr, int index,int k){
            if (index== arr.length){
                return list;
            }
            if (arr[index]==k){
                list.add(index);
            }
            return all_indices(arr, index+1,k);
    }


}
