import java.util.ArrayList;
import java.util.List;


public class SubString {
    public static void main(String[] args) {
        String str = "test123string";
        String compare="213";
        int count =0;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            for (int j =i+1; j <= str.length(); j++) {
                    list.add(str.substring(i,j));
            }
        }
        for (String s:list) {
            if (s.equals(compare)) {
                count++;
                break;
            }
        }
        if(count>0)
            System.out.println("1");
            else
        System.out.println("-1");

    }
}
