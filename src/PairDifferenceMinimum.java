

public class PairDifferenceMinimum {
    public static void main(String[] args) {
        int[] array={901,40,35,0,60,900,903,1000};
        int index1=0;
        int index2=0;
       int mindifference=array[0]-array[1];
        for(int i=0;i< array.length-1;i++) {
            for (int j=i+1;j< array.length;j++) {
                int difference1 = array[i] - array[j];
                if (Math.abs(difference1) < Math.abs(mindifference)) {
                    mindifference = difference1;
                    index1= i;
                    index2=j;
                }
            }
        }
        System.out.println("Difference between "+array[index1]+" and "+array[index2]+" is minimum");
    }
}
