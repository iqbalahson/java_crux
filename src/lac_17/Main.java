package lac_17;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("\n" + Rat_Maz(0,0,n,m,""));

    }


    public static int Rat_Maz(int cc, int cr, int er,int ec, String ans) {
        if (cc==ec-1 && cr == er-1  ){
            System.out.print(ans+ " ");
            return 1;
        }
        if (cc>=ec || cr>=er){
            return 0;
        }

       int ans1 = Rat_Maz(cc,cr+1,er,ec,ans+"V");  // cda, a
        int ans2 = Rat_Maz(cc+1, cr,er,ec,ans+"H");  // cda,  ""
        int ans3 =0;
        if (cc==cr && er>1 && ec>1){
        ans3 = Rat_Maz(cc+1,cr+1,er,ec,ans+"D");
        }
        return ans1+ans2+ans3;
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