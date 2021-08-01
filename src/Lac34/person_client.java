package Lac34;

public class person_client {
    public static void main(String[] args) {
        person p = new person("patlu" , 34      );
        p.IntroYourSelf();
        person p1 = new person();
        p1.IntroYourSelf();
        p.setAge(56);
        p.setName("labez");
        p.IntroYourSelf();
        System.out.println(p.getAge());
    }
}
