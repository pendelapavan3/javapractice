public class Assign1 {
    public static void main(String[] args) {
        /*int a=10;
        int b=35;
        System.out.println(a+b);// add 2 integers
        System.out.println(a/b);// quotient
        System.out.println(a%b);//reminder
        // swap numbers
        System.out.println("Before swapping values of a and b are: "+ a + ", " + b);
        int temp=0;
        temp = a; 
        a = b;
        b = temp;
        System.out.println(+a+ " "+b);*/
         //pattern
            for (int i=5; i>=1; --i)
            {
                for(int j=1; j<=i; ++j){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            char last = 'E', alphabet = 'A';

    for (int i = 1; i <= (last - 'A' + 1); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(alphabet + " ");
      }
      ++alphabet;

      System.out.println();
    }
    
  }
    
}
