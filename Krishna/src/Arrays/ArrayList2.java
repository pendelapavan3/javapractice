package Practices;
import java.util.*;

public class ArrayList2 
{
public static void main(String[] args) 
{
class Student
{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age)
    {
        this.rollno= rollno;
        this.name= name;
        this.age = age;
   }
}
    Student s1 = new Student(1, "Rama", 25);
    Student s2 = new Student(2, "Krishna",25);
    ArrayList<Student> AL = new ArrayList<Student>();
    AL.add(s1);
    AL.add(s2);
    System.out.println(AL);
Iterator itr=AL.iterator();  
while(itr.hasNext()){  
  Student st=(Student)itr.next();  
  System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}
}