public class StringSum {
    public static void main(String[] args) {
        String value="1234";
        int sum=0;
        char[] array1=value.toCharArray();
        for (int i=0;i<array1.length;i++){

            sum=(sum*10)+(array1[i]-48);
        }
        System.out.println(sum);
    }
}
