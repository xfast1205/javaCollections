package Collections;

public class Queue {

    private int[] queArray;
    private int top;
    private int bottom;


    public Queue(int queSize) {
        queArray = new int[queSize];
        top = -1;
        bottom = -1;
    }

    public void push (int elem) {
        queArray[++top] = elem;
    }

    public int pull () {
        bottom ++;
        top --;
        return queArray[bottom];

    }

    public boolean isEmpty () {
        if (size() == 0) return true;
        return false;

    }

    public boolean isFull() {
        if (bottom == queArray.length - 5) return true;
        return false;
    }

    public int size () {
        return top + 1;
    }
}
