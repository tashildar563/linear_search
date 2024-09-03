//package org.example;
//class Node{
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data){
//        this.data=data;
//    }
//
//
//}
//public class BinaryTree {
//
//    Node root;
//
//    public void inset(int data){
//        insertRec(root,data);
//    }
//
//    private Node insertRec(Node root, int data) {
//        if(root==null){
//            root.data = data;
//        }else if(root.data>data){
//            root.left=insertRec(root.left,data);
//        }else if(root.data<data){
//            root.right = insertRec(root.right,data);
//        }
//        return root;
//    }
//    public void inorder(){
//        printOrder(root);
//    }
//    public void printOrder(Node root){
//        if(root!=null){
//            printOrder(root.left);
//            System.out.println(root.data+"=>");
//            printOrder(root.right);
//        }
//
//    }
//
//
//}
