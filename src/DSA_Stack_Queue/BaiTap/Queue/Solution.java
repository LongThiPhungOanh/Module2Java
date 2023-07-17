package DSA_Stack_Queue.BaiTap.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.PriorityBlockingQueue;
public class Solution<E> extends Node {
    private LinkedList<E> elements;

    public Solution() {
        elements = new LinkedList<>();
    }

    public void enqueue(E rear, E front) {
        elements.addLast(rear);
        elements.addFirst(front);
    }

    public boolean isFull(E front, E rear) {
        boolean status = false;
        if (front == rear) {
            status = true;
        }
        return status;
//    public E deQueue(){
//        return elements.removeFirst();
//    }
//    public void displayQueue(){}
    }
}