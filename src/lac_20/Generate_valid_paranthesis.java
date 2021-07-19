package lac_20;

public class Generate_valid_paranthesis {
    public static void main(String[] args) {
        int n =3;
        String st = "";
        valid_paranthesis(n,0,0,st);
    }
    public static void  valid_paranthesis(int n, int nop, int noc , String ans){
        if (nop==n&&noc==nop){
            System.out.println(ans  );
            return;
        }
        if (nop<n){
            valid_paranthesis(n, nop+1,noc, ans+'(');
        }
        if (noc<nop){
            valid_paranthesis(n, nop, noc+1, ans+')');
        }

    }
}
