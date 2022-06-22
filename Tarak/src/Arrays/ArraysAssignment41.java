package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class ArraysAssignment41 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of array1");
        int len1=scannerObject.nextInt();
        int[] array1=new int[len1];
        System.out.println("enter elements of array1");
        for(int i=0;i<array1.length;i++){
            array1[i]=scannerObject.nextInt();
        }
        System.out.println("enter length of array2");
        int len2=scannerObject.nextInt();
        int[] array2=new int[len2];
        System.out.println("enter elements of array2");
        for(int i=0;i<array2.length;i++){
            array2[i]=scannerObject.nextInt();
        }
        System.out.println("elements of array1");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("elements of array2");
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        System.out.println("concatenated array is: "+Arrays.toString(array1)+Arrays.toString(array2));
    }
}
