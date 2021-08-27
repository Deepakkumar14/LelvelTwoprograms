package divideandsort;

import java.util.Arrays;
import java.util.Collections;

public class DivideAndSort {
    public static void main(String[] args) {
        Integer[] array1={1,2,3,4,5,6,7,8,9};
        int size=array1.length;
        int[] even={};
        Integer[] odd=new Integer[size/2];;
        if(size%2==0)
            even=new int[size/2];
        else
          even=new int[size/2+1];
        for(int i=0,j=0;i< size;i+=2,j++){
            even[j]=array1[i];
        }
      Arrays.sort(even);
        for(int i=1,j=0;i< size;i+=2,j++){
            odd[j]=array1[i];
        }
        Arrays.sort(odd,Collections.reverseOrder());
        for(int i=0,k=0;k<size;) {
            array1[k++]=even[i];
            if(k<size){
                array1[k++]=odd[i];
            }
            i++;
        }
        for(int i=size-1;i>=0;i--) {
            System.out.print(array1[i]+" ");
        }
    }
}
