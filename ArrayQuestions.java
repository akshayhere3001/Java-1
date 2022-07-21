//import java.util.Arrays;

public class ArrayQuestions {
	public static void main(String[] args) {
		
		// Problem-1 -> Create an Array of 5 float and Calculate their sum
		
//		float[] arr = {1.2F, 1.3F, 1.4F, 1.5F, 1.6F};
//		float sum = 0;
//		for (int i = 0; i<arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		
//		System.out.print(sum);
//	}
//	
	
		// Problem-2 -> Write a program to find if the given number is present in an Array or not
//		int[] arr = {12, 1, 2, 3, 6, 5};
//		int num = 15;
//		boolean isInArray = false;
//		
//		// solving by For-Each loop
//		for(int element: arr) {
//			if(num == element) {
//				isInArray = true;
//				break;
//			}
//		}
//		
//		if(isInArray) {
//			System.out.print("Number " + num + " is present in an Array");
//		}else {
//			System.out.print("Number " + num + " is not present in an Array");
//		}
		
		
		// Problem-3 -> 3Calculate the average marks from an array Containing marks of all students in Physics!
		// using for each loop.

//		int[] arr = {1, 2, 3, 5, 6, 4, 7, 8, 9, 10};
//		int sum  = 0;
//		
//		for(int i = 0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		// average will be sum/length of an array (total outcomes)
//		// getting the exact value by explicit type casting
//		System.out.println((float)sum/arr.length);
		
		
		// Problem-4 -> Create a java Program to add two Matrix of size 2x3
		
		int[][] mat1 = {{1,2,3}, {4,5,6}};
		int[][] mat2 = {{7,8,9}, {10,11,12}};
		
		int[][] result = {{0, 0, 0}, {0, 0, 0}}; // initially result is 0
		
		for (int i = 0; i<mat1.length; i++) {       // for rows
			for (int j = 0; j<mat1[i].length; j++) { // for columns
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
	
		// Printing the Result
		for (int i = 0; i<mat1.length; i++) {       // for rows
			for (int j = 0; j<mat1[i].length; j++) { // for columns
				System.out.print(result[i][j] + " ");
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
			System.out.println();
		}
		}
}
