package org.example;
class Node {
    int data;
    Node next;
    public Node(int value){
        this.data=value;
        this.next=null;
    }
}

public class DeletingNthNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        System.out.println("list before deletion");
        printLinkedList(head);

//        head=deleteNthNode(head,4);

        System.out.println("linked list after deletion");
        printLinkedList(head);

    }
    public static void printLinkedList(Node node){
    Node ptr = node;
    while(ptr!=null){
        System.out.println(ptr.data + " ");
        ptr = ptr.next;
    }}
}
