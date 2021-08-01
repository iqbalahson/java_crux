package Lac34;

public class person {
    private String name;
    private int age;
    public person(String name , int age){
        this.name = name;  /*this it is used because name is of class variable and
                            to distingue the constructor variable */
        this.age = age;
    }
    public person(){
        this.name = "Tabrez";
        this.age = 13;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void IntroYourSelf(){
        System.out.println("my name is "+ this.name + " and age is "+ this.age);
    }
}
