package tutorial;
import java.util.Scanner;
public class stringwordrev {

	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
 // Step 1: Input matrix size
		        System.out.print("Enter number of rows: ");
		        int rows = sc.nextInt();

		        System.out.print("Enter number of columns: ");
		        int cols = sc.nextInt();

		        // Step 2: Declare 3 matrices
		        int[][] matrix1 = new int[rows][cols];
		        int[][] matrix2 = new int[rows][cols];
		        int[][] result = new int[rows][cols];

		        // Step 3: Input matrix1 values
		        System.out.println("Enter elements of Matrix 1:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                matrix1[i][j] = sc.nextInt();
		            }
		        }

		        // Step 4: Input matrix2 values
		        System.out.println("Enter elements of Matrix 2:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                matrix2[i][j] = sc.nextInt();
		            }
		        }

		        // Step 5: Add the matrices
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                result[i][j] = matrix1[i][j] + matrix2[i][j];
		            }
		        }

		        // Step 6: Print the result
		        System.out.println("Resultant Matrix after Addition:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println(); // new line after each row
		        }
		    }
		}
