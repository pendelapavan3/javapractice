import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("age");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("fullname");
        String fullname = sc.nextLine();
       //sc.next();
        //sc.nextLine();
        System.out.println("enter phone");
        String phone = sc.next();
     //sc.nextLine();
       
      

        System.out.println(age + fullname+ phone );

        
    }
}
