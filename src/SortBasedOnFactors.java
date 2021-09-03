import java.util.Arrays;

public class SortBasedOnFactors {
    public static void main(String[] args) {
        int[] array={8, 2, 3, 12, 16};
        int[] factors=new int[array.length];
        for(int i=0;i< array.length;i++){
            int temp=array[i];
            int count=0;
            for(int j=temp-1;j>1;j--){
                if(temp%j==0){
                    count++;
                }
                factors[i]=count;
            }
        }
        for (int i = 0; i < factors.length; i++) {
            for (int j = i + 1; j < factors.length; j++){
                if (factors[i] <factors[j]) {
                    int temp = factors[i];
                    int temp1 = array[i];
                    factors[i] = factors[j];
                    array[i] = array[j];
                    factors[j] = temp;
                    array[j] = temp1;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

