package core.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

    private Queue<String> myQueue = new LinkedList<>();

    public QueueExamples(){
        myQueue.add("one");
        myQueue.add("two");
    }

    public void queueFeatures(){
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
    }

    public static void main(String[] args) {
        QueueExamples queueExamples = new QueueExamples();
        queueExamples.queueFeatures();
    }

}
