package Inheritance;

 class Parent3
 {
      private void display2()              // method 1
     {
        System.out.println("This is parent class");
     }
 }
 class child1 extends Parent3
 {
     void display3()             // method 2
     {
         System.out.println("This is child class");
     }
 }
 public class Parent2 {
    public static void main(String[] args)
    {
        Parent3 Obj= new Parent3();
      // obj.display();           // it is not visible since it is given as private.
        child1 Obj1 = new child1();
        Obj1.display3();
        //obj1.display();
    }
 }