package com.assignment20;

import java.util.Arrays;
import java.util.Stack;

public class Code4 {
    //4. Write a Java program that initializes a `Stack` of doubles with the values {1.1, 2.2, 3.3, 4.4, 5.5}.
    //Convert the stack to an array and print the array.
    //Then, create a new stack from the array and print the elements of the new stack.
    public static void main(String[] args) {
        Stack<Double> vals=new Stack<>();
        vals.push(1.1);
        vals.push(2.2);
        vals.push(3.3);
        vals.push(4.4);
        vals.push(5.5);

        System.out.println("Stack to Array:");
        Double[] arr=new Double[vals.size()];
        vals.copyInto(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Array to Stack:");
        Stack<Double> newStack=new Stack<>();
        for (double d:arr)
            newStack.push(d);
        System.out.println(newStack);

    }
}
