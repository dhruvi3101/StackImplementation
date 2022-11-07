package com.Netcracker.StackImplementaiton;


public class Stack {

    private int arr[];

    private int top;

    private int stackSize;


    Stack(int size) {


        arr = new int[size];
        stackSize = size;
        top = -1;
    }


    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        System.out.println("Element " + data + " has been inserted in the stack successfully");
        this.arr[++top] = data;
    }


    public int pop() {


        if (isEmpty()) {
            System.out.println("Stack is empty");

        }

        return arr[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public int getTop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return top;
    }


    public Boolean isEmpty() {
        return top == -1;
    }


    public Boolean isFull() {
        return top == stackSize - 1;
    }


    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}

