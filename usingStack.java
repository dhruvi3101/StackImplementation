package com.Netcracker.StackImplementaiton;

public class usingStack {

    public static void main(String[] args) {
        Stack stack = new Stack(9);

        stack.printStack();

        stack.push(23);
        stack.push(43);
        stack.push(66);
        stack.push(32);
        stack.push(17);
        stack.push(84);


        System.out.println("Stack after push operation: ");
        stack.printStack();
        System.out.println("");


        stack.pop();
        System.out.println("Stack after pop operation");
        stack.printStack();
        System.out.println("");

        System.out.print("The top element in the stack is: ");
        System.out.println(stack.getTop());

        System.out.print("Size of the stack is: " );
        System.out.println(stack.getSize());

    }
}