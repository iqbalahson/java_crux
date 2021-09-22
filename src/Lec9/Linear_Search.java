package Lec9;

import java.util.ArrayList;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        int [] arr   = new int[leng];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int item = sc.nextInt();
        list = linear_Search(arr,item);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList linear_Search (int [] arr, int item){
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == item  ){
                    list.add(i);
                }
        }
        if (list.isEmpty()){
            list.add(-1);
        }
        return list;
    }



}
