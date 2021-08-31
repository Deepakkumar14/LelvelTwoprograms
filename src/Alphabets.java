public class Alphabets {
    public static void main(String[] args) {
        int number=78;
        String output="";
        while(number>0){
            int remainder=number%26;
            if(remainder==0){
                output+='Z';
            }
            else {
               int value=65+(remainder-1);
               output+=(char)value;
            }
            number = number / 26;
        }
        StringBuffer str=new StringBuffer(output);
        System.out.println(str.reverse());
    }
}
