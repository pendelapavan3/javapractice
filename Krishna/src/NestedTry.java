public class NestedTry{
    public static void main(String args[]) {
        try{
            System.out.println("outer try block");
            try{
                System.out.println("inner try block");
                int a = 5/0;
            }
            catch(ArithmeticException ae) 
            {
                System.out.println(ae);
            }
                System.out.println("from catch blk of inner try");
            try{
                System.out.println("second inner try block");
                int []a = new int[5];
                a[5] = 5;
            }
            catch(ArrayIndexOutOfBoundsException ai)
            {
                System.out.println("catch blk for second inner try");
            }
        }
        catch(Exception e)
        {
            System.out.println("catch blk for outer try");
        }
        finally{
            System.out.println("finally block is executed");
        }
          System.out.println("remaining code");
    }
}