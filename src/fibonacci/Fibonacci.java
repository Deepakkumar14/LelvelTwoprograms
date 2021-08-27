package fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] fiboArray = new int[size];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        for (int i = 2; i < size; i++) {
            fiboArray[i] = fiboArray[i - 2] + fiboArray[i - 1];
        }
        System.out.println(Arrays.toString(fiboArray));
    }
}

