package Practice;
import java.util.Scanner;
public class Exception3 {
    public static void main(String args[])
    {

        Scanner sc = new Scanner (System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        validate(age);
        sc.close();
    }
    static void validate(int age)
    {
        if(age<18)
        {   
           // ArithmeticException ae = new ArithmeticException("In throw  exeception");
           // throw ae;
            throw new NumberFormatException("throw exception is sucessful age is < 18");
        }
else System.out.println("Array EXception");

    }
}
