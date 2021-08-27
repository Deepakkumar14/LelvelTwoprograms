package stringpalindrome;

public class StringPalindrome {
    public static void main(String[] args) {
        String str1="121";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        if(str1.equalsIgnoreCase(str2))
            System.out.println("The string is palindrome");
        else
        System.out.println("The string is not palindrome");
    }
}
