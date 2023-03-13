package unit11.collections.day44.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIntegers {
    public static void main(String[] args) {
        Queue<Integer>priorityInteger = new PriorityQueue<>();
        priorityInteger.offer(14);
        priorityInteger.offer(45);
        System.out.println(priorityInteger);
        System.out.println("-".repeat(15));
        priorityInteger.offer(25);
        System.out.println(priorityInteger);
        System.out.println("-".repeat(15));
        priorityInteger.offer(90);
        priorityInteger.poll();
        System.out.println(priorityInteger);
        priorityInteger.offer(1);
        priorityInteger.offer(85);
        System.out.println(priorityInteger);
        priorityInteger.poll();
        System.out.println(priorityInteger);


    }
}
