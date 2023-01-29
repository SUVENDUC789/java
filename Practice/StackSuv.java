import java.util.*;

public class StackSuv {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        s.showStack();
        // System.out.println(Arrays.toString(s.a));
    }
}

class Stack {
    private int size;
    private int top;
    public int[] a;

    Stack(int size) {
        this.size = size;
        this.top = -1;
        int[] b = new int[size];
        a = b;
    }

    private static boolean isEmpty(Stack s) {
        if (s.top == -1)
            return true;
        return false;
    }

    private static boolean isFull(Stack s) {
        if (s.top == s.size - 1)
            return true;
        return false;
    }

    public void push(int val) {

        try {
            if (isFull(this)) {
                throw new OverFlow("Stack is full !");
            } else {
                this.top++;
                this.a[this.top] = val;
            }
        } catch (OverFlow e) {
            e.printStackTrace();
        }

    }

    public int pop() {
        int val = -1;
        try {
            if (isEmpty(this)) {
                throw new UnderFlow("Stack is Empty !");
            } else {

                val = this.a[this.top];
                this.top--;
            }
        } catch (UnderFlow e) {
            e.printStackTrace();
        }
        return val;

    }

    public void showStack() {
        try {
            if (isEmpty(this)) {
                throw new UnderFlow("Stack is Empty !");
            } else {
                for (int i = this.top; i >= 0; i--) {
                    System.out.print(this.a[i] + "    ");
                }
            }
        } catch (UnderFlow e) {
            e.printStackTrace();
        }
        System.out.println();
    }

}

class OverFlow extends RuntimeException {
    OverFlow(String msg) {
        super(msg);
    }
}

class UnderFlow extends RuntimeException {
    UnderFlow(String msg) {
        super(msg);
    }
}
