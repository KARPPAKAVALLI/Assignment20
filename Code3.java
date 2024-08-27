package com.assignment20;

import java.util.Scanner;
import java.util.Stack;

public class Code3 {
    //3. Create a Java program that checks if a string containing parentheses is balanced using a `Stack`.
    // For example, the input "(())" is balanced, but the input "(()" is not.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Parentheses String:");
        String s=sc.next();
        Stack<Character> stack=new Stack<>();
        boolean f=true;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stack.push(s.charAt(i));
            else{
                if(stack.empty() || stack.pop()!='('){
                    f=false;
                    break;
                }
            }
        }
        if(!stack.empty())
            f=false;
        System.out.println("The given parentheses is: "+(f?"Valid":"Not Valid"));
    }
}
