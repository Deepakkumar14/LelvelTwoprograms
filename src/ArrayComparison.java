public class ArrayComparison {
    public static void main(String[] args) {
        int[] array={ 2, -3, -4, 5, 9, 7, 8 };
        System.out.println(array[0]);
        for(int i=1;i<array.length;i++){
            if(array[i]>array[i-1]){
                System.out.println(array[i]);
            }
        }
    }
}
