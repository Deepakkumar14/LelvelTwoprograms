package threefourseries;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeFourSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= input.nextInt();
        int[] array=new int[size];
        array[0]=3;
        array[1]=4;
        for (int i=2,j=2;i<size;i++,j++){
            array[i]=(array[j-2]*10)+array[0];
            i++;
            if(i<size)
            array[i]=(array[j-2]*10)+array[1];
            else
                break;
        }
        System.out.println(Arrays.toString(array));
    }
}
