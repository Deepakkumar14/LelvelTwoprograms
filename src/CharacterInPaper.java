import java.util.Arrays;

public class CharacterInPaper {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        for(int i=1;i<=n;i++){
           int temp=i;
           while(temp!=0){
               temp=temp/10;
               count++;
           }
        }
        System.out.println(count);
    }
}
