package Lac34;
// exception Handling work
public class Student_client {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
//        s.setAge(-19) ;
//        s.setAge1(-12);
        try {
            s.setage(-13);

        }
       catch (Exception e){
            e.printStackTrace();
           System.out.println(e);
       }

    }
}
