package queue;

public class MyQueueTests {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        System.out.println("peek is " + queue.peek());
        System.out.println("poll is " + queue.poll());

        queue.add("January");
        queue.add("February");
        queue.add("March");
        queue.add("April");
        queue.add("May");
        queue.add("June");


        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.size() = " + queue.size());

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.size() = " + queue.size());

        queue.clear();
        System.out.println("queue.size() = " + queue.size());
    }

}



