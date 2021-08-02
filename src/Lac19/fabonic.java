package Lac19;

public class fabonic {
    public static void main(String[] args) {
        int n= 3;
        System.out.println(fabo(n)  );
    }
    public static int fabo(int n){
        if (n==0 || n==1 ){
            return n;
        }
        int ans = fabo(n-1)+ fabo(n-2);
        return ans  ;
    }
}
