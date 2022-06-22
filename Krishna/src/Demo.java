public class Demo {
    
    public class AgeException extends Exception{
public AgeException(String s){
    super(s);
}
    }
    public Demo (String name, int age) {
        if(age < 18)
        {
            AgeException Ae = new AgeException("age should not be negetive");
            try {
                throw Ae;
            } catch (Demo.AgeException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else{
            System.out.println("vote ");
        }
        }
public static void main (String [] args) {
Demo d = new Demo("xyz", -19);

    }
}
