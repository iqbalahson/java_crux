package Lac23;

import java.util.ArrayList;

public class pelindrom_partion {
    // leet code 131
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        String ques = "nitin";
    partition(ques, "");
    Partitioning_LeetCode(ques,list,ans);
        System.out.println(ans);
    }

    public static void  partition(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int partition = 1; partition <= ques.length(); partition++) {
            String rog = ques.substring(partition);
            String roar = ques.substring(0, partition);
            if (IsPelindrom(roar)){
                partition(rog,ans + " " +roar);
            }
        }
    }
    public static boolean IsPelindrom(String ans){
        int i =0;
        int  j = ans.length()-1;
        while (i<j){
            if (ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void Partitioning_LeetCode(String ques, ArrayList<String> list, ArrayList<ArrayList<String>> ans) {
        if (ques.length() == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String roq = ques.substring(i);// Rest of Question
            String roa = ques.substring(0, i);// Rest of answer
            if (IsPelindrom(roa)) {
                list.add(roa);
                Partitioning_LeetCode(roq, list, ans);
                list.remove(list.size()-1);//

            }

        }

    }
}
