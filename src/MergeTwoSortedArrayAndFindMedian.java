import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class MergeTwoSortedArrayAndFindMedian {
    public static void main(String[] args) {
        int[] array1={1,3,5,7,8};
        int[] array2={2,4,6,7};
        int[] main=new int[array2.length+ array1.length];
        int i = 0, j = 0, k = 0;
        while (i<array1.length && j<array2.length)
        {
            if (array1[i] < array2[j])
                main[k++] = array1[i++];
            else
                main[k++] = array2[j++];
        }
        while (i < array1.length)
            main[k++] = array1[i++];

        while (j < array2.length)
            main[k++] = array2[j++];

        System.out.println(Arrays.toString(main));

        int mid= main.length/2;
        if(main.length%2==0){
            float res=(float)(main[mid]+main[mid-1])/2;
            System.out.println(res);
        }
        else{
            System.out.println(main[mid]);
        }
    }

}
