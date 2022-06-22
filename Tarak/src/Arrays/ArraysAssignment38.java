package Arrays;

import java.util.Scanner;

public class ArraysAssignment38 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Number of Rows in first Array:");
        int rows1=scannerObj.nextInt();
        System.out.println("Number of Columns in first Array:");
        int columns1=scannerObj.nextInt(); 
        int matrix1[][]=new int[rows1][columns1];
        System.out.println("Number of Rows in Second Array:");
        int rows2=scannerObj.nextInt();
        System.out.println("Number of Columns in Second Array:");
        int columns2=scannerObj.nextInt(); 
        int matrix2[][]=new int[rows2][columns2];
        if(columns1!=rows2)
        {
            System.out.println("Matrices cannot be multiplied");
        }
        else
        {
        System.out.println("Enter elements of First Matrix :");
            for(int i=0;i<rows1;i++)
            {
                for (int j=0;j<columns1;j++)
                {
                    matrix1[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
            System.out.println("Enter elements of Second Matrix :");
            for(int i=0;i<rows2;i++)
            {
                for (int j=0;j<columns2;j++)
                {
                    matrix2[i][j]=scannerObj.nextInt();//getting input from the user
                }
            } 
        }
        int[][] result = new int[rows1][columns2];

		// Calling a function for matrix multiplication core logic
		doMatricMultiplication(matrix1, matrix2, rows1, columns1, columns2, result);
		// printing the result
		doPrintResultMatric(result);

	}

	
	private static void doMatricMultiplication(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int columns2,
			int[][] result) {

		// matrix addition core logic
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for (int k = 0; k < columns1; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

	}

	// prints the result matrix
    
	private static void doPrintResultMatric(int[][] result) {
        System.out.println("product of two matrices");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[1].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}