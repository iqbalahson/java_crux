package Lac24;

public class rat_maiz {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(maiz(0,0,n,m,""));
    }
    public static int maiz(int cr, int cc,int ec, int er, String ans){
        if (cr==er-1&&cc == ec-1){
            System.out.print(ans+" " );
            return 1;
        }
        // -ve base case
        if (cr>=er||cc>=ec){
            return 0;
        }
        int hrz = maiz(cr, cc+1,er,ec,ans+"H");
        int vrt = maiz(cr+1,cc,ec,er,ans+ "V");
        return hrz+vrt;
    }
}
