package Lac34;

public class Stakc_client {
    public static void main(String[] args) throws Exception{
        Stack s = new Stack(4   );
        s.push(56)  ;
        s.push(34)  ;
        s.push(20);
        s.push(67);
//        s.push(56);
        System.out.println(s.size());
        System.out.println( s.peak());
        s.Display();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
