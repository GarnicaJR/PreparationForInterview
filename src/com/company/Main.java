package com.company;

public class Main {

    public static void main(String[] args) {
       MyStack<Integer> stack  = new MyStack<>();
       stack.push(10);
       stack.push(100);
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.isEmpty());
    }
}
