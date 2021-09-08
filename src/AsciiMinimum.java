public class AsciiMinimum {
    public static void main(String[] args) {
        String input="deepak";
        String occurance="";
        int count=0;
        for(int i=0,j=i+1;i<input.length()&&j<input.length();i++,j++){
            if(input.charAt(i)==input.charAt(j)){
                count++;
            }
            occurance+=count;
            count=0;
        }
        System.out.println(occurance);
    }
}
