package org.example;

public class ReverseLinkedList {
Node head;
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reverseList (){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head = prevNode;
    }

    public void printlist(){
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        ReverseLinkedList list = new ReverseLinkedList();
        list.addfirst("1");
        list.addfirst("2");
        list.addfirst("3");
        list.printlist();
        list.reverseList();
        list.printlist();
    }
}
