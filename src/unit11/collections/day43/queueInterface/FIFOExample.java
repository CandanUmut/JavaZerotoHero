package unit11.collections.day43.queueInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FIFOExample {
    public static void main(String[] args) {
        Queue<Integer>integerQueue
                = new LinkedList<>();


        System.out.println(integerQueue);
        integerQueue.offer(1);
        integerQueue.offer(34);
        integerQueue.offer(111);
        System.out.println(integerQueue);
        System.out.println("Removed element from the pool" + integerQueue.poll());

        System.out.println(integerQueue);
        System.out.println("Removed element from the pool" + integerQueue.poll());
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);
    }
}
