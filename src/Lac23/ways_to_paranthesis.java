package Lac23;

import java.util.ArrayList;

public class ways_to_paranthesis {
    public static void main(String[] args) {
        String st = "2*3-4*5";
        ArrayList <Integer> list = parenthesis(st);
        System.out.println(list);
    }
    public static ArrayList<Integer> parenthesis(String st){
        if(st.indexOf('*')==-1 && st.indexOf('+')==-1 && st.indexOf('-')==-1){
            ArrayList<Integer> bs = new ArrayList<>();
            bs.add(Integer.parseInt(st));
            return bs;
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < st.length(); i++) {
            char ch  = st.charAt(i);
        if  (ch=='+'|| ch=='-'||ch=='*'){
            ArrayList<Integer> left = parenthesis(st.substring(0,i));
            ArrayList<Integer> right = parenthesis(st.substring(i+1));
            for (int val :
                    left) {
                for (int val2 :
                        right) {
                    if (ch == '+') {
                        ans.add(val+val2);
                    }
                    if (ch=='-'){
                        ans.add(val-val2);
                    }
                    if (ch=='*'){
                        ans.add(val*val2);
                    }
                }
            }
        }
        }
        return ans;
    }

}
