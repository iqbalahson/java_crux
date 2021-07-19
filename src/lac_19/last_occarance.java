package lac_19;

public class last_occarance {
    public static void main(String[] args) {
        int [] arr = {5,8,2,3,4,6,3};
        int k = 8;
        System.out.println(last(arr,k,arr.length-1));
    }
    public static int last(int[]arr , int k, int index)  {
        if (index==0){
            return -1;
        }
        if (arr[index]==k){
            return index;
        }
        return  last(arr,k,index-1);
    }
}
