public class ArrayAddition {
    public static void main(String[] args) {

        int[] array1 = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int[] array2 = {7, 8, 4, 6, 2, 1, 9, 9, 7};
        long s1=0,s2=0,value=0;
        long sum;
        for (int i = 0; i < array1.length; i++){
            s1=(s1*10)+array1[i];
        }
        for (int i = 0; i < array2.length; i++){
            s2=(s2*10)+array2[i];
        }
        sum=s1+s2;
        int size=String.valueOf(sum).length();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            value=sum%10;
            array[i]= (int) value;
            sum=sum/10;
        }
        for (int i=array.length-1;i>=0;i--) {
            System.out.print(array[i]);
        }
    }
}
