package org.example;

public class DoublyLinkedList {
    ListNode  head;
    ListNode tail;
    int length;
    private class ListNode {
        int  data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }
}
