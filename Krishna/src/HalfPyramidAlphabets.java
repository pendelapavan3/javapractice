public class HalfPyramidAlphabets
{
    public static void main(String[] args)
    {
     for(char i= 'A'; i <='E'; i++)
        {
        for (char j ='A'; j<=i; j++)
            {
            System.out.print(" " + i + " ");
            }
        System.out.println();
        }
        System.out.println("out of for loop");
    }
}