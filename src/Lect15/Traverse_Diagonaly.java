package Lect15;

import java.util.ArrayList;
import java.util.Collections;

public class Traverse_Diagonaly {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11,12 }, { 13, 14, 15, 16} };
        DiagonalTraverse(arr);

    }
        public  static void DiagonalTraverse(int [ ] [ ] arr){
        int row = arr.length;
            int col = arr[0].length;
            ArrayList <Integer> list = new ArrayList<>();
            for (int d = 0; d < row + col - 1; d++) {
                int c = 0;
                int r = 0;
                if (d<col){
                     c = d;
                     r =0;
                 //   System.out.println(r+ " " + c);

                }
                else    {
                    c = col-1;
                    r = d-(col-1);
                  //  System.out.println(r+ " " + c);
                }
                ArrayList <Integer> temp = new ArrayList<>();
                while (c>=0 && r <row){
//                    System.out.println(r+ " " + c);
//                    System.out.println(arr[r][c]);
                    temp.add(arr[r][c]);
                    c--;
                    r++;
                }
                if (d%2==0){
                    for (int i = 0; i < temp.size(); i++) {
                        list.add(temp.get(i));
                    }
                }
                else {
                    Collections.reverse(temp);
                    for (int i = 0; i < temp.size(); i++) {
                        list.add(temp.get(i));
                    }
                }
            }
            System.out.println(list);
        }
}
