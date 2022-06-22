package Practices;
import java.util.Scanner;

class InputMismatchException extends Exception
{
    public InputMismatchException(String s)
    {
        super(s);
    }
}
public class CustomException 
{
    static void validate (int id)
    throws InputMismatchException 
    {
        if(id == hasNextChar() )
        {
        throw new InputMismatchException("Invalid emp id");
        }
        else
         System.out.println("employee id ");
    }
    private static int hasNextChar() {
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter emp id:" );
        int id = sc.nextInt();
        sc.close();
     try 
     {
         validate( id);
     }
     catch(InputMismatchException iae)
     {
         System.out.println("caught the exception");
         System.out.println("Exception occured:" +iae);
     }
     System.out.println("rest of the code");
    }
}