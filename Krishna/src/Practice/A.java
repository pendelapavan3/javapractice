package Practice;
public class A 
{
    public static void main(String[] args) 
    {
        {
            int array[]=new int[]{1,2,3,4,5};                             
            int sum=0;                                                   
            for(int i=0;i<array.length;i++)                             // i value gets increased until it is less than the array length. 
            {
                sum=sum+array[i];                                       //array[i] gives the element present at ith location in the array
            }
            System.out.println("Sum of elements in an Array : " +sum);
        }

        int originalarray[]={1,2,3,4,5};                                                   //Initialize an array with integer values
        int copiedarray[]=new int[originalarray.length];                                       //initialize another array with same size
        System.out.println("Original Array :" );

       for(int i=0;i<originalarray.length;i++)
        {
            System.out.println(originalarray[i] + " ");                                
        }
        System.out.println("Copied Array ");
        for(int i=0;i<copiedarray.length;i++)
        {
            copiedarray[i]=originalarray[i];                                             
            System.out.println(copiedarray[i] + " ");                            //to print copied array
        }

        char array1[] = {'a', 'b','c'};                                        
        char array2[] = new char[array1.length];
        //System.out.println("array1 is: " +array1);
        System.arraycopy(array1, 0, array2, 0, array1.length);                //syntax is System.arraycopy(src, srcPos, dest, destPos, length);
        //System.out.println("array2 is: " +array2);
        System.out.println("array2 is: " +String.valueOf(array2));             // prints the copied array2 value.
    }  
}



   
