package Lac20;

public class sub_sequence_of_string {
    public static void main(String[] args) {
        String st = "abc";
        String ans = "";
        sub_sequence(st,ans);
        System.out.println(count_sequences(st,ans));
    }
    public static void sub_sequence(String quest, String ans){
        if (quest.length()==0){
            System.out.println(ans  );
            return;
        }
        char ch = quest.charAt(0);
        sub_sequence(quest.substring(1), ans);  // cda,  ""

        sub_sequence(quest.substring(1),ans+ ch);  // cda, a
    }
    public static int count_sequences(String quest, String ans){
        if (quest.length()==0){
            return 1;
        }
        char  ch = quest.charAt(0);
        int count1 = count_sequences(quest.substring(1), ans+ " ");
       int count2 =  count_sequences(quest.substring(1), ans+ ch);
       return count1+count2;
    }
}
