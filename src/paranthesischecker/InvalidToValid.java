package paranthesischecker;

import java.util.Scanner;
import java.util.Stack;

public class InvalidToValid {
    public static void main( String args[] ) {
        Scanner sc=new Scanner(System.in);
        String inputStr= sc.nextLine();
        valid_paren(inputStr);
    }
    public static void valid_paren(String inputStr) {
        Stack<Character> stack = new Stack<>();
        char []st = inputStr.toCharArray();
        for (int i=0;i<st.length;i++) {
            System.out.println(i);
            if (st[i] == '(' || st[i] == '{' || st[i] == '[') {
                stack.push(st[i]);
            }
           else if(stack.empty()) {
                System.out.println(inputStr +   " contains invalid parentheses.");
            }
            else {
                char top = stack.peek();
                if(st[i] == ')' && top == '(' || st[i] == '}' && top == '{' || st[i] == ']' && top == '['){
                    stack.pop();
                }
                else{
                    inputStr = inputStr.substring(0, i) + inputStr.substring(i + 1);
                    for(int j=i;j<st.length-1;j++){
                        st[j]=st[j+1];
                    }
                    i--;
                }
            }
        }
        if(stack.empty()) {
            System.out.println(inputStr +  " valid parentheses.");
        }

    }
}
