package Lac17;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int test_case = in. nextInt();
        while (test_case-->0){
            int n = in.nextInt();
            int arr [] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]   = in.nextInt();
            }
            String st = new String();
            for (int i = 0; i < arr.length; i++) {
                st += String.valueOf(arr[i]);
            }
            sub_sequence(st,0);
//            if(){
//                System.out.println("Yes");
//            }
//            else
//                System.out.println("No");
        }


    }
    public static void sub_sequence(String quest, int ans) {
        if (quest.length()==0){
//            if (sum_sequence(0,ans,k)) {
//                for (int i = ans.length()-1; i >=0; i--) {
                    System.out.print(ans+ " ");
//                }
//                System.out.println();
//            }
//            return;
//            System.out.println("Yes");
        }
        if (quest.charAt(0)!='-') {
            char ch = quest.charAt(0);
            sub_sequence(quest.substring(1), ans);  // cda,  ""
            sub_sequence(quest.substring(1),ans+ (int)ch);  // cda, a
        }

    }
    public static boolean sum_sequence(int sum, String ans, int k) {
        for (int i = 0; i < ans.length(); i++) {
            sum+= Integer.parseInt(ans.substring(i,i+1));
        }
        if (sum!=0){
            return false;
        }
        return true;
    }

}