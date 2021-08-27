package paranthesischecker;

import java.util.Scanner;
import java.util.Stack;

public class paranthesisChecker {
        public static void main( String args[] ) {
            Scanner sc=new Scanner(System.in);
            String input_str= sc.nextLine();
            valid_paren(input_str);
        }
        public static void valid_paren(String input_str) {
            Stack<Character> s = new Stack<Character>();
            for (char st : input_str.toCharArray()) {
                if (st == '(' || st == '{' || st == '[') {
                    s.push(st);
                    System.out.println("Elements in Stack: " + s);

                }
                else if(s.empty()) {
                    System.out.println(input_str +   " contains invalid parentheses.");
                }
                else {
                    char top = s.peek();
                    if(st == ')' && top == '(' || st == '}' && top == '{' || st == ']' && top == '['){
                        s.pop();
                        System.out.println("Elements in Stack: " + s);
                    }
                    else{
                        System.out.println(input_str +  " contains invalid parentheses.");
                        break;
                    }
                }
            }
            if(s.empty()) {
                System.out.println(input_str +  " contains valid parentheses.");
            }
        }
    }
