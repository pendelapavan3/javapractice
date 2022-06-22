package Practice;
import java.util.Arrays;
public class S1 {
    public static void main(String[] args) 
    {
        String str1= "Race";
        String str2= "Cures";
        System.out.println(str1.equals(str2));

        str1=str1.toLowerCase();                                        // converts the characters in the string to lower case  
        str2=str2.toLowerCase();    
        System.out.println("str1 length is:" + str1.length());         
        System.out.println(str1.indexOf('r'));     

        String string1= "total class are: ";
		Integer string2= 9;
        String s1 = String.valueOf(string2);                         // to convert integer into strings using string method
        System.out.println(s1);

		StringBuilder newstring=new StringBuilder ();              	// using append method to concatenate strings
		StringBuilder concatenate=newstring.append(string1).append(string2);
		System.out.println(concatenate);

        StringBuffer newstring1=new StringBuffer();    
        StringBuffer concatenate1=newstring1.append(string1).append(string2);     
        System.out.println(concatenate1);    
            
        if(str1.length()==str2.length())
         {
             char charArray1[]= str1.toCharArray();                      //converting the string to char array using toCharArray
            char charArray2[]= str2.toCharArray();

            Arrays.sort(charArray1);                                    //sorting the char array
            Arrays.sort(charArray2);
            boolean result= Arrays.equals(charArray1, charArray2);     //if sorted char arrays are same then string is anagram
            if(result)
            {
                System.out.println(str1+ " , " +str2 +" are anagram");
            }
            else
            {
                System.out.println(str1+ " , " +str2 +" are not anagram");
            }
         }
        else
        {
            System.out.println( str1+ ", " +str2 + " are not anagram");
        }
    }
    }
