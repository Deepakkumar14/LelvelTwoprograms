import java.util.Arrays;
import java.util.Scanner;

public class SortBasedOnCountInReverse {


        public static void main(String[] args) {
            findCount(inputArray());
        }

        public static int[] inputArray() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length of array");
            int size = input.nextInt();
            System.out.println("Enter the value of array");
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(array));
            return array;
        }

        public static void findCount(int array[]) {
            int count = 1;
            int flag = 0;
            for (int i = 0; i < array.length; i++) {
                int element = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (element == array[j]) {
                        flag = 1;
                        break;
                    }
                    if (flag == 0) {
                        continue;
                    }
                    for (int k = i + 1; k < array.length; k++) {
                        if (array[i] == array[k]) {
                            count++;
                        }

                    }
                }
            }
            System.out.println();
        }
    }

