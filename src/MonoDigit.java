import java.util.Arrays;

public class MonoDigit {
    public static void main(String[] args) {
        String number = "31241";
        int[] array = new int[number.length()];
        String output="";
        int count=0;
        for (int i = 0; i < number.length(); i++) {
            array[i] = number.charAt(i)-48;
        }
        int temp1=array[0];
        output+=temp1;
        for (int i = 1; i < number.length(); i+=2) {
            if (i + 1 < number.length()) {
                int temp2 = (array[i]) + array[i + 1];
                int temp3 = (array[i]) - array[i + 1];
                if (temp1 == temp2) {
                    output += temp2;
                    count++;
                }
                if (temp1 == temp3) {
                    output += temp3;
                    count++;
                }
            } else{
                count=0;
                break;
            }
        }
        if(count>0) {
            System.out.println(number + "  becomes  " + output + "  it is a mono digit number");
        }
        else{
            System.out.println("Not a mono digit number");
        }
    }
}
