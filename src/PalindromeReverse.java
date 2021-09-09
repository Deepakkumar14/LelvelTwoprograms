/*Given a number, reverse it and add it to itself unless it becomes a palindrome or number of iterations becomes more than 5.

        Example 1:
        Input: n = 23
        Output: 55
        Explanation: reverse(23) = 32,then 32+23
        = 55 which is a palindrome.

        Example 2:
        Input: n = 30
        Output: 33
        Explanation: reverse(30) = 3,then 3+30
        = 33 which is palindrome.

        Example 3:
        Input n=6799
        output=-1;

        */


public class PalindromeReverse {
    public static void main(String[] args) {
        int n=6799;
        String bool = null;
        int temp=0,reverse=0;
        for(int i=0;i<5;i++){
           temp=n;
             reverse=reverse(temp);
            bool=checker(temp,reverse);

            if(bool.equals("true")){
                break;
            }
            else {
                temp=n+reverse;
                reverse=reverse(temp);
                bool=checker(temp,reverse);
                n=reverse;
                if(bool.equals("true")){
                    break;
                }
            }
            }
        if(bool.equals("true")){
            System.out.println(n);
        }
        else {
            System.out.println(n);
            System.out.println("-1");
        }
        }
    public static int reverse(int temp){
        int reverse=0;
        while(temp>0){
            reverse=(reverse*10)+(temp%10);
            temp/=10;
        }
        return reverse;
    }
    public static String checker(int n, int reverse){
        if(n==reverse){
            return "true";
        }
        else
        return "-1";
    }
}
