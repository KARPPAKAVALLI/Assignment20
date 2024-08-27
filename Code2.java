package com.assignment20;

import java.util.Scanner;
import java.util.Stack;

public class Code2 {
    //2. Write a Java program that uses a `Stack` to reverse a string.
    // For example, given the input string "hello", the program should output "olleh".
    public static void reverse(String s){
        Stack<Character>reverse=new Stack<>();
        for (int i=0;i<s.length();i++)
            reverse.push(s.charAt(i));
        System.out.println("Reversed string using stack");
        while (!reverse.empty()){
            System.out.print(reverse.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.next();
        reverse(s);
    }
}
