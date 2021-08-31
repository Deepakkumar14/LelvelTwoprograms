package matrixrotation;

import java.util.Scanner;

public class MatrixRotation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = input.nextInt();
        System.out.println("Enter the col");
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix after 90 degree anticlockwise rotation");
        for (int j = col-1; j >=0; j--) {
            for (int i=0; i<row; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix after 180 degree anticlockwise rotation");
        for (int i = row-1; i >=0; i--) {
            for (int j = col-1; j >=0; j--) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
