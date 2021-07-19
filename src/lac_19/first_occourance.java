package lac_19;

public class first_occourance {
    public static void main(String[] args) {
        int [] arr = {3,5,6,2,8,5,6};
        int k= 6;
        System.out.println(first(arr,k,0));
    }
    public static int first(int [] arr, int k, int index){
        if (index==arr.length){
            return-1;
        }
        if (arr[index]==k){
            return index;
        }
        return first(arr,k,index+1);
    }
}
