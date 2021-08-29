package alternatesort;

public class AlternateSort {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        for(int i=0,j=array.length-1;i<=array.length/2 ;i++,j--){
            if(j>i)
            System.out.print(array[j] +" "+array[i]+" ");
           else if(i==j){
                System.out.print(array[i]);
            }
        }
    }
}
