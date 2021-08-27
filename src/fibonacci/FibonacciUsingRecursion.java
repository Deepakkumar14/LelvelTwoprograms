package fibonacci;

import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println(fibonacci(i));
        }

    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2)
            return 1;
        return fibonacci(number - 2) + fibonacci(number - 1);
    }
}
