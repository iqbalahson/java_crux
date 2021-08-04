package Lac24;

public class ways_to_sit_queen_permut {
    public static void main(String[] args) {
        boolean [] board = new boolean[4];
        int quen = 2;
        queen_combination(board,quen, 0, "");

    }
    //qs total queen placed
    // qpsf queen placed so far
    public static void  queen_combination(boolean [ ] board, int tq, int qpsf, String ans){
        if (qpsf==tq){
            System.out.print(ans + " ");
            System.out.println();
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (!board[i]){
                board[i] =true;
                queen_combination(board,tq,qpsf+1, ans+"b"+i+"q"+qpsf+" ");
            board[i] = false;
            }
        }
    }

}
