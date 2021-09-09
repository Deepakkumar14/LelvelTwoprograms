package sorting;

import java.util.Arrays;

public class QuickSortPivotLast {
        public static void main(String[] args) {
            int[] array={7,6,10,5,9,2,1,15,7};
            int lower=0;
            int upper= array.length-1;
            quickSort(array,lower,upper);
            System.out.println(Arrays.toString(array));
        }
        public static void quickSort(int[] array,int lower,int upper){
            if(lower<upper){
                int location=partition(array, lower, upper);
                quickSort(array,lower,location-1);
                quickSort(array,location+1,upper);
            }
        }
        public static int partition(int[] array, int lower, int upper){
            int pivot=array[upper];
            int start=lower;
            int end=upper-1;
            while(start<end){
                while( start<=upper && array[start]<=pivot ){
                    start++;
                }
                while(end>=lower && array[end]>pivot){
                    end--;
                }
                if(start<end){
                    swap(array,start,end);
                }
            }
            swap(array,upper,start);
            return start;
        }
        public static void swap(int[] array,int start, int end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
        }
    }

