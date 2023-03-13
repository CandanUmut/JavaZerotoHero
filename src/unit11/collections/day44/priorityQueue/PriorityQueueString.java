package unit11.collections.day44.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueString {
    public static void main(String[] args) {
        Queue<String >priorityString = new PriorityQueue<>();

        priorityString.offer("Umut");
        priorityString.offer("Hope");
        priorityString.offer("I can do it");
        System.out.println(priorityString);
        priorityString.poll();
        System.out.println(priorityString);
        System.out.println(priorityString.peek());
        System.out.println(priorityString.poll());

        System.out.println(priorityString);

    }
}
