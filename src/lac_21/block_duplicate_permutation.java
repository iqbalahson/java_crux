package lac_21;

public class block_duplicate_permutation {
    public static void main(String[] args) {
        String st ="abca";
        duplicate(st,"");
    }
    public static void  duplicate(String ques, String ans){
        boolean [ ] visited = new boolean[256];
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if (!visited[ch - 49]) {
                visited[ch-49] =true;
                String reg = ques.substring(0, i) + ques.substring(i + 1);
                duplicate(reg, ans + ques.charAt(i));
            }
        }
    }
}
