import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows: ");
      int rows = sc.nextInt();
      System.out.println("Enter the number of columns: ");
      int cols = sc.nextInt();
      int matrix[][] = new int[rows][cols];
      System.out.println("Enter the elements of the matrix: ");
      for(int i = 0; i<rows;i++) {
    	  for(int j = 0;j<cols; j++) {
    		  matrix[i][j] = sc.nextInt();
    	  }
      }
      int[][] result = new int[cols][rows];

      for (int i = 0; i < cols; i++) {
          for (int j = 0; j < rows; j++) {
              result[i][j] = matrix[j][i];
          }
      }
      System.out.println("Transpose Array: ");
      for(int i = 0; i<result.length; i++) {
    	  for(int j = 0; j<result[0].length; j++) {
    		  System.out.print(result[i][j]+" ");
    	  }System.out.println();
      }
      sc.close();
    }
}
