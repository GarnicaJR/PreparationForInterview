package com.company;

public class MyLinkedList<T extends Comparable<T>>  {

    private Node head;
    private int size;

    public MyLinkedList(){ }

    public MyLinkedList(T item){
        if(item ==  null){
            return;
        }

        Node<T> node = new Node<>();
        node.item = item;
        node.next = null;
        head = node;
        size++;
    }

    public void insertToFront(T item){
        if(item==null){
            return;
        }
        Node<T> temp = head;
        Node<T> node = new Node<>();
        node.item = item;
        node.next = temp;
        head =  node;
        size++;
    }

    public void append(T item){
        if(item==null){
            return;
        }
        Node<T> node = new Node<T>();
        if(head==null){
            node.item = item;
            node.next = null;
            head = node;
        }
        else{
            Node<T> temp = head;

            while(temp.next!=null){
                temp = temp.next;
            }
            node.item = item;
            node.next = null;
            temp.next = node;
        }
        size++;
    }

    public void delete(T item){
        if(item==null || size == 0){
            return;
        }

        Node<T> temp = head;

        if(temp.item.compareTo(item)==0){
            head = temp.next;
            return;
        }

        while(temp!=null){
            if(temp.next!=null && temp.next.item.compareTo(item)==0){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

    }


    public T find(T item){
        if(item == null || size == 0){
            return null;
        }
        Node<T> temp = head;
        while(temp!=null){
            if(temp.item.compareTo(item) == 0){
                return item;
            }
            temp = temp.next;
        }
        return null;
    }

    public void printList(){
        Node<T> temp = head;

        while(temp!=null){
            System.out.print(temp.item+" ");
            temp = temp.next;
        }
    }
}
