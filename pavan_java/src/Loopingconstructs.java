public class Loopingconstructs {
        public static void main(String[] args)
        { 
              //simple for loop
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
    
            // nested for loop
            for (int i=1; i<=5; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*  ");
                }
                System.out.println();
            }
            // while loop
                int i =1;
            while(i<=5){
                System.out.println(i);
                i++;
            } 
            // do while loop
            //int i=1;
            do{
                System.out.println(i);
                i++;
            } while(i<=10);
            //pattern
            /*for (int i=1; i<=5; i++)
            {
                for(int j=1; j<=i; j++){
                    System.out.print("*  ");
                }
                System.out.println();
            }*/

        }
    }    

