package lac_17;
import java.util.ArrayList;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]   = in.nextInt();
        }
//        Arrays.sort(arr);
        int k = in.nextInt();
        String st = new String();
        for (int i = 0; i < arr.length; i++) {
            st += String.valueOf(arr[i]);
        }
        sub_sequence(st,"",k);

    }


    public static void sub_sequence(String quest, String ans,int k) {
        if (quest.length()==0){
            if (sum_sequence(0,ans,k)) {
                for (int i = ans.length()-1; i >=0; i--) {
                    System.out.print(ans.charAt(i)+ " ");
                }
                System.out.println();
            }
            return;
        }
        char ch = quest.charAt(0);

        sub_sequence(quest.substring(1), ans,k);  // cda,  ""
        sub_sequence(quest.substring(1),ans+ ch,k);  // cda, a
    }
    public static boolean sum_sequence(int sum, String ans, int k) {
        for (int i = 0; i < ans.length(); i++) {
            sum+= Integer.parseInt(ans.substring(i,i+1));
        }
        if (sum!=k){
            return false;
        }
        return true;
    }



}