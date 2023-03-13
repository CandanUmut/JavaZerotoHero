package unit11.collections.day43.queueInterface;

import java.util.Deque;
import java.util.LinkedList;

public class LIFOexample {
    public static void main(String[] args) {
        Deque<Integer>integerStack
                =new LinkedList<>();
        integerStack.push(99);
        System.out.println(integerStack);
        integerStack.push(11);
        System.out.println(integerStack);
        integerStack.push(55);
        System.out.println(integerStack);
        System.out.println("Pooped from the stack, yani cikarttik stackten , son ekledigimiz ilk cikar" + integerStack.pop());
        System.out.println(integerStack);

        System.out.println("Peeked from the stack " + integerStack.peek());
        integerStack.pop();
        integerStack.pop();

    }
}
