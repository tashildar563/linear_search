package org.example;

import java.util.LinkedList;

public class LinkedListNew {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //add - first, last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode= currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst (){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void  deleteLast(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next= null;
    }


    public static void main (String [] args){
        LinkedListNew list = new LinkedListNew();
        list.addFirst("rakesh");
        list.addFirst("name");
        list.addFirst("my");
        list.addLast("and");
        list.deleteFirst();
        list.deleteLast();
        list.printList();

        LinkedList<String> newlist = new LinkedList<>();
        newlist.addFirst("a");
        newlist.addFirst("is");
        System.out.println(newlist);
        newlist.addLast("last");
        System.out.println(newlist);

        for ( int i = 0 ; i<newlist.size();i++){
            System.out.println(newlist.get(i)+" -> ");
        }


    }


}
