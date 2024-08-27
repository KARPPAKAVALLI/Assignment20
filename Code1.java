package com.assignment20;

import java.util.Stack;

public class Code1 {
    //1. Write a Java program that creates a `Stack` of integers.
    // Push the numbers 10, 20, 30, 40, and 50 onto the stack.
    // Then, pop the top element and print the remaining elements in the stack.
    public static void main(String[] args) {
        Stack<Integer> nums=new Stack<>();
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(40);
        nums.push(50);

        nums.pop();

        System.out.println("Remaining elements: "+nums);
    }
}
