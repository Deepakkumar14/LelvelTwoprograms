import java.util.Arrays;

public class SumArrayPuzzle {
    static int j=0;
    static  int[] output = new int[5];

    public static void main(String[] args) {
        int[] array1 = {3, 6, 4, 8, 9};
            int[] output= sum(0,array1);
        System.out.println(Arrays.toString(output));
        }

        public static int[] sum(int n, int[] array1){
        if(n< array1.length) {
            for (int i = 0; i < array1.length; i++) {
                if (i != n) {
                    output[j] += array1[i];
                }
            }
            j++;
            sum(++n,array1);
        }
        return output;
        }
    }


