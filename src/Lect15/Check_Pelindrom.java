package Lect15;

public class Check_Pelindrom {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = "nitin";
        /*
        print those substrings which are palindrome string
         */
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {
                String ans = str.substring(i, j);
                if (isPalidrome(ans)) {
                    System.out.println(ans);
                }
            }
        }

    }
    public static boolean isPalidrome(String quest){
        int i = 0 ;
        int j = quest.length()-1;
        while (i<j){
            if (quest.charAt(i)!=quest.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
