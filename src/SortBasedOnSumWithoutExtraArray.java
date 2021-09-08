import java.util.Arrays;

public class SortBasedOnSumWithoutExtraArray {
    public static void main(String[] args) {
        int[] array={21,41,12,24,14};

        for(int i=0;i< array.length;i++){
            int sum=0;
            int temp=array[i];
            while(temp>0){
                int rem=temp%10;
                sum+=rem;
                temp=temp/10;
            }
            for(int j=i+1;j< array.length;j++){
                int sum1=0;
                int temp1=array[j];
                while(temp1>0){
                    int rem1=temp1%10;
                    sum1+=rem1;
                    temp1=temp1/10;
                }
                if(sum1<sum){
                    sum=sum1;
                    int temp2=array[j];
                    array[j]=array[i];
                    array[i]=temp2;
                }
             else if(sum1==sum){
                    if(array[i]>array[j]){
                        int temp2=array[i];
                        array[i]=array[j];
                        array[j]=temp2;
                    }
                }
            }
            //System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
