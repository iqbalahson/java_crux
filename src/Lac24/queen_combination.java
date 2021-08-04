package Lac24;

public class queen_combination {
    public static void main(String[] args) {
        boolean [] board = new boolean[4];
        int tq = 2;
        queen_permut(board,tq, -1 ,0, "");

    }
    //qs total queen placed
    // qpsf queen placed so far
    public static void  queen_permut(boolean [ ] board, int tq, int index , int qpsf, String ans){
        if (qpsf==tq){
            System.out.print(ans + " ");
            System.out.println();
            return;
        }
        for (int i = index+1; i < board.length; i++) {
            if (!board[i]){
                board[i] =true;
                queen_permut(board,tq,i, qpsf+1, ans+"b"+i+"q"+qpsf+" ");
                board[i] = false;
            }
        }
    }
}
