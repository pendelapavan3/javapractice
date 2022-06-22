import java.util.Scanner;

class Area12{
    int length;
    int breadth;
    int side;
     double Area(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
        return length*breadth;
    }
     double Area(int side){
        this.side=side;
        return side*side;
}
}
public class SquareAndRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth of a rectangle ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter side of a square ");
        int s=sc.nextInt();
        Area12 obj1=new Area12();
        double k=obj1.Area(l, b);
       double j= obj1.Area(s);
        System.out.println("area of rectangle is " +k);
        System.out.println("area of squareis " +j);
    }
}
