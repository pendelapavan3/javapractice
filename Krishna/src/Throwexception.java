public class Throwexception {
    public static void main(String args[])
    {
        validate(15);
    }
    static void validate(int age)
    {
        if(age<18)
        {   
           // ArithmeticException ae = new ArithmeticException("In throw  exeception");
            //throw ae;
            throw new NumberFormatException("throw exception is sucessful");
        }
else System.out.println("Array EXception");
    }
}
