import java.util.Arrays;
import java.util.Scanner;

public class SortDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] date = new String[4];
        long[] array = new long[4];

        for (int i = 0; i < date.length; i++) {
            date[i] = input.nextLine();
            String[] reverse = date[i].split("-");
            String temp = "";
            for (int j = reverse.length - 1; j >= 0; j--) {
                temp += reverse[j];
            }
            array[i] = Long.parseLong(temp);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
            if (array[i] >array[j]) {
                long temp = array[i];
                String temp1 = date[i];
                array[i] = array[j];
                date[i] = date[j];
                array[j] = temp;
                date[j] = temp1;
            }
        }
    }
        System.out.println(Arrays.toString(date));
    }
}
