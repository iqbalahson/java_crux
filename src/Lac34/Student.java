package Lac34;

public class Student {
    private String name ;
    private int age;
  public void setAge(int age ) {
      System.out.println("setter work");
      try   {
          if (age<0){
              throw new Exception("-ve age "    );
          }
          this.age = age;
      }
      catch (Exception e){
          System.out.println(e);
      }
      finally {
          System.out.println("hello I am finally");
      }
      System.out.println("Bye Set Age");
  }
  public void setAge2(int age ) throws Exception {
      System.out.println("setter work");
      try   {
          if (age<0){
              throw new Exception("-ve age "    );
          }
          this.age = age;
      }
      finally {
          System.out.println("hello I am finally");
      }
      System.out.println("Bye Set Age");
  }
  public void  setAge1(int age )throws Exception {
      System.out.println("here using throw");
      if (age<0){
          throw new Exception("-ve age");
      }
      this.age = age;
      System.out.println("Bye Set Age");
  }
  public void setage(int age) throws Exception{
      if (age<0){
          throw new Exception("-ve input");
      }
      this.age = age;
  }
}
