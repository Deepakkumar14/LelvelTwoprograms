import java.util.Scanner;

public class LocalMaximum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= input.nextInt();
        System.out.println("Enter array elements");
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(i==0){
                if(array[i]<=array[i+1]){
                    System.out.println(array[i]);
                }
            }
           else if(i==array.length-1){
                if(array[i]<=array[i-1]){
                    System.out.println(array[i]);
                }
            }
           else{
               if(array[i]<=array[i-1]&&array[i]<=array[i+1]){
                   System.out.println(array[i]);
               }
            }
        }
    }
}
