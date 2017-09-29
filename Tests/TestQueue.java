package Tests;

import Collections.Queue;

public class TestQueue {

    private static int i = 0;

    public static void main(String[] args) {
        Queue queue = new Queue(10);

        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);

        System.out.println("Размер очереди: " + queue.size());
        while (!queue.isEmpty()){
            System.out.println("Вытащили:" + queue.pull());
            System.out.println("Размер очереди: " + queue.size());
        }

    }

}
