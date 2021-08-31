package XOpattern;

import java.util.Scanner;

public class XOPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter M");
        int m = input.nextInt();
        System.out.println("Enter N");
        int n = input.nextInt();
        char[][] matrix = new char[m][n];
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;
        char c;
        while (top<bottom || left<right) {
            if (top % 2 == 0)
                c = 'x';
            else
                c = 'O';

            for(int i=left;i<=right;++i)
                matrix[top][i] = c;
            top++;

            //print last column
            for(int i=top;i<=bottom;++i)
                matrix[i][right] = c;
            right--;


            //print last row
            for(int i=right;i>=left;--i)
                matrix[bottom][i] = c;
            bottom--;

            //print first column
            for(int i=bottom;i>=top;--i)
                matrix[i][left] = c;
            left++;

        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
