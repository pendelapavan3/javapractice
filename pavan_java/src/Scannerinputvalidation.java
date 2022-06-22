import java.util.Scanner;

public class Scannerinputvalidation {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int num;
        num = validate(scannerObj);
        System.out.println( "my value is ="+num );
        scannerObj.close;
        do
        {
            System.out.println("Enter the positive number ");
            while (!scannerObj.hasNextInt() )
            {
                System.out.println( "this is not a number. Please enter a number");
                scannerObj.next()

            }            
            num = scannerObj.nextInt;
            
        } while (num <= 0);

        return num;
    }
}
