public class Control 
{
    public static void main(String[] args)
    {
        String marks = "zero"; //"n  inty"; 
        if(marks == "ninty")
        {
            System.out.println("student is a topper");
        }
        if (marks == "seventy five")
        {
            System.out.println("student passed in distinction");
        }
        else if(marks == "seventy")
        {
            System.out.println("student passed in first class");
        }
        else 
        {
            System.out.println("student failed in the exam");
        }
        int num = 2;  
switch (num){  
case 0:  
System.out.println("number is 0");  
break;  
case 1:  
System.out.println("number is 1");  
break;  
default:  
System.out.println(num);  
}  
    }
}