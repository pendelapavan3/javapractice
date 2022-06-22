public class Sums 
{
    public static void main(String[] args) 
    {
      String name = "John";
      System.out.println(name);
      int num = 55;
     System.out.println(num);
     double myDouble = 9.78d;
    int myInt = (int) myDouble;
    System.out.println(myInt);
     display();
     
     //java program to add 2 integers
     int x= 51, y= 4,sum;
     sum = x + y;
     System.out.println(sum);
     System.out.println(x+y);
     System.out.println(x-y);
     System.out.println(x*y);
     System.out.println(x/y);
     System.out.println(x%y);
    
    
     // unary operators ++
     x =10;
    // x++;
     System.out.println("Sum values = ");
     System.out.println(x++ + x++); // 10 + 11 = 21

     System.out.println(x);
     // unary operator
     y= -5;
     System.out.println(~x);
     System.out.println(~y);
     // unary operator !
     boolean a =true;
     boolean b = false;
     System.out.println(!a);
     System.out.println(!b);
    
    
     //left& right shift opertaors
     System.out.println(10<<2);//10*2^2=10*4=40
     System.out.println(10<<3);
     System.out.println(10>>2);//10/2^2=10/4=2
     
     // Bit wise operators checks both conditions
     x = 10;
     y = 15;
     System.out.println(x<y & y>x); // for & both needs true
     System.out.println(x<y & x>y);
     System.out.println(x>y | x<y);// for | one statement shoud be true either 1st or 2nd

     // logical operators checks only 1 st condition
     System.out.println(x<y && y<x);
     System.out.println(x<y && x>y);
     System.out.println(x<y || x>y);

      
    }
    private static void display() {
    
        float hi = 59.3f;
        System.out.println(hi); 
        int j = (int) hi;
        System.out.println(j);
    
    }
  }
  