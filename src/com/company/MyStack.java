package com.company;



public class MyStack<T>{
    private Node<T> top;
    private int size;


    public MyStack(){}

    public MyStack(T item){
        if(item==null){
            return;
        }
        Node<T> node = new Node<>();
        node.item = item;
        node.next = null;
        top = node;
        size++;
    }


    public void push(T item){
        if(item == null){
            return;
        }

        Node<T> temp = top;
        Node<T> node = new Node<>();
        node.item = item;
        node.next = null;
        top =  node;
        top.next = temp;
        size++;
    }

    public T pop(){
        Node<T> temp = top;
        if(top!=null){
            top =  temp.next;
            size--;
            return  temp.item;
        }
        return null;
    }

    public T peek(){
        return top.item;
    }

    public boolean isEmpty(){
        return size<=0;
    }


}
