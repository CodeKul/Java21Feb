package collectionframework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);
        System.out.println(stack.capacity());
//        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search(20));


    }
}
