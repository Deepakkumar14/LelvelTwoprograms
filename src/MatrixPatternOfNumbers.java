import java.util.Scanner;

public class MatrixPatternOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int row = input.nextInt();
        int rowcount = row;
        for (int i = 0; i <row; i++) {
            int start = i+1;
            int temp=row;
            if(i==0||i==1){
                rowcount++;
            }
            for (int col = 0; col <rowcount; col++) {
                if ((i == 0 && col == 0 )||( i == 1 && col == 0)) {
                    System.out.print(" " + "\t\t");
                }
                else {
                    System.out.print(start+"\t\t");
                    start+= temp;
                    temp--;
                    //System.out.println(temp+"w");
                }
            }
            if(i==0||i==1){
                rowcount--;
            }
            rowcount--;
            System.out.println();
        }
    }
}
