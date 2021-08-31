public class Threshold {
    public static void main(String[] args) {
        int[] array={5,8,10,13,6,3};
        int threshold=3;
        int count =0;
        for(int i=0;i<array.length;i++){
            int temp=threshold;
            while (temp > 0) {
                if (array[i] >= temp) {
                    array[i] = array[i] - temp;
                    count++;
                } else
                    temp--;
                if (array[i] == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
