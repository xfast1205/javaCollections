package Tests;

import Collections.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.readTop());
        stack.pop();
        System.out.println(stack.readTop());
    }
}
