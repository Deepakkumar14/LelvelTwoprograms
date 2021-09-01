public class StringReverseRecursion {
    public static void main(String[] args) {
        String str="one two three";
        String[] array=str.split("\\s");
        recursion(array,array.length-1);
    }

    private static void recursion(String[] array, int length) {
        if(length>=0){
            System.out.print(array[length]+" ");
            recursion(array,--length);
        }
    }

}
