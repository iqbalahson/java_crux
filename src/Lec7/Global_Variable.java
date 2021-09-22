package Lec7;

public class Global_Variable {
      static int val =100;

    public static void main(String[] args) {
        hello(val);
        System.out.println(val);
    }
    public static int hello(int a) {
        a++;

        System.out.println(a);

        System.out.println(val );


return a;

    }


}
