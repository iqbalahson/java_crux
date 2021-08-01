package Lac21;

public class tower_of_hanowi {
    public static void main(String[] args) {
        int n= 3;
        String src = "T1";
        String dest = "T2";
        String help = "T3";
        hanoi(n, src, help,dest );
    }
    public static void hanoi(int n , String src , String dest , String help){
        if (n==0){
            return;
        }
        hanoi(n-1, src, help, dest);
        System.out.println("Move "+ n + " th " + "from " + src + " to " + dest +"." );
        hanoi(n-1, help,src, dest);
    }
}
