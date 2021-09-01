import java.util.Arrays;

public class ProgramPattern {
    public static void main(String[] args) {
        String str = "PROGRAM";
        int mid = str.length() / 2;
        int col=(str.length()*2)-1;
        char array[]=new char[str.length()];
        int j=0;
        for(int i=mid;i<str.length();i++){
            array[j]=str.charAt(i);
            j++;
        }
        for(int i=0;i<mid;i++){
            array[j]=str.charAt(i);
            j++;
        }
       for(int i=0;i< str.length();i++){
           if(col>0) {
               for (int k = 0; k < col - 1; k++) {
                   System.out.print(" ");
               }

               for (int k = 0; k <= i; k++) {
                   System.out.print(array[k]);
               }
               System.out.println();
               col = col - 2;
           }
       }
    }
}


