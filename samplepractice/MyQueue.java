/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplepractice;

/**
 *
 * @author sumitdeshmukh
 * Queue using stack
 */
import java.util.*;

public class MyQueue {

    /**
     * Initialize your data structure here.
     */
    private Stack<Integer> stack = null;

    public MyQueue() {
        stack = new Stack();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (stack != null) {
            stack.push(x);
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        Stack<Integer> newStack = new Stack();
        int x = 0;
        while (!stack.empty()) {
            x = stack.pop();
            newStack.push(x);
        }
        if (! newStack.empty()) 
            newStack.pop();
        while (!newStack.empty()) {
            stack.push(newStack.pop());
        }

        return x;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        Stack<Integer> newStack = new Stack();
        int x = 0;
        while (!stack.empty()) {
            x = stack.pop();
            newStack.push(x);
        }

        while (!newStack.empty()) {
            stack.push(newStack.pop());
        }

        return x;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.empty();
    }

    public static void main(String[] args) {

        MyQueue obj = new MyQueue();
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);

    }
}
