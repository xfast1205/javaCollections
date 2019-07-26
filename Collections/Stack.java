package Collections;

public class Stack {

    private int mSize;
    private int [] stackArray;
    private int top;


    public Stack(int mSize) {
       stackArray = new int[mSize];
       top = -1;
    }

    public void push (int elem) {
        stackArray[++top] = elem;
    }

    public int pop () {
        return stackArray[top--];
    }

    public int readTop () {
        return stackArray[top];
    }

    public boolean isEmpty () {
        if (top == -1) return true;
        return false;
    }

    public boolean isFull () {
        if (top == mSize - 1) return true;
        return false;
    }
}
