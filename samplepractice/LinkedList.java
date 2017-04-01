/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplepractice;

import java.util.Stack;

/**
 *
 * @author sumitdeshmukh
 */
public class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void headInsert(Node d) {
        d.next = head;
        head = d;
    }

    public void tailInsert(Node d) {
        d.next = null;
        if (head == null) {
            d = head;
            return;
        }
        Node n = head;
        while (n != null) {
            n = n.next;
        }
        n.next = d;
    }

    public void insertAfter(Node d, Node prev) {
        if (prev == null) {
            tailInsert(d);
        }

        d.next = prev.next;
        prev.next = d;
    }

    public void recursiveReverse(Node currentNode) {
        //check for empty list 
        if (currentNode == null) {
            return;
        }

        /* if we are at the TAIL node:
    recursive base case:
         */
        if (currentNode.next == null) {
//set HEAD to current TAIL since we are reversing list
            head = currentNode;
            return; //since this is the base case
        }

        recursiveReverse(currentNode.next);
        currentNode.next.next = currentNode;
        currentNode.next = null; //set "old" next pointer to NULL
    }

    public void reverseListIteratively(Node head) {
        if (head == null || head.next == null) {
            return;  //empty or just one node in list
        }
        Node Second = head.next;

//store third node before we change 
        Node Third = Second.next;

//Second's next pointer
        Second.next = head;  //second now points to head
        head.next = null;  //change head pointer to NULL

//only two nodes, which we already reversed
        if (Third == null) {
            return;
        }

        Node CurrentNode = Third;

        Node PreviousNode = Second;

        while (CurrentNode != null) {
            Node NextNode = CurrentNode.next;

            CurrentNode.next = PreviousNode;

            /*  repeat the process, but have to reset
     the PreviousNode and CurrentNode
             */
            PreviousNode = CurrentNode;
            CurrentNode = NextNode;
        }

        head = PreviousNode; //reset the head node
    }
}
