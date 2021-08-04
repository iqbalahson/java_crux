package Lac22;

public class count_board_path {
    public static void main(String[] args) {
        int end = 4;
        System.out.println(count_board_path(0, end));

    }
    public static int count_board_path(int current, int end){
        int count = 0;
        if (current==end){
            return 1;
        }
        for (int dice = 1; dice <=6 && current+dice<=end; dice++) {
           count+= count_board_path(current+dice,end);
        }
        return count;
    }
}
