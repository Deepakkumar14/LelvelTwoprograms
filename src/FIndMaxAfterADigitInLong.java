public class FIndMaxAfterADigitInLong {
    public static void main(String[] args) {
        long value=26789608;
        int pointer=9;
        String a=String.valueOf(value);
        int c = 0;
        for(int i=0;i<a.length();i++){
            if(pointer==a.charAt(i)-48){
                 c=a.charAt(i+1)-48;
                while(i<a.length()-1){
                    if(c<a.charAt(i+1)-48){
                        c=a.charAt(i+1)-48;
                    }
                    i++;
                }
            }
        }
        System.out.println(c);
    }
}
