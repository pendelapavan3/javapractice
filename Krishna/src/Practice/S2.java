package Practice;

public class S2  
{
    public static void main(String[] args) 
    {
        String str= "rama krishna";
        System.out.println("Characters in string " +str+ " are: ");

        for(char ch: str.toCharArray())
         {                                                                              
            System.out.print(ch+ " , ");               
         }
    }
}