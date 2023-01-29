public class QueueSuv {

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.deQueue();
        q.showQueue();
        System.out.println("Programme successfully terminated ...");
    }
}

class Queue {
    private int size, start, end;
    private int[] a;

    Queue(int size) {
        this.size = size;
        this.start = -1;
        this.end = -1;
        int[] b = new int[size];
        a = b;
    }

    private static boolean isEmpty(Queue q) {
        return q.start == q.end;
    }

    private static boolean isFull(Queue q) {
        return (q.size - 1) == q.end;
    }

    public void enQueue(int val) {
        try {
            if (isFull(this)) {
                throw new OverFlow("Queue is Full");
            } else {
                this.end++;
                this.a[this.end] = val;
            }
        } catch (OverFlow e) {
            e.printStackTrace();
        }
    }

    public int deQueue() {
        int val = -1;
        try {
            if (isEmpty(this)) {
                throw new UnderFlow("Queue is Empty");
            } else {
                this.start++;
                return this.a[this.start];
            }
        } catch (UnderFlow e) {
            e.printStackTrace();
        }
        return val;
    }

    public void showQueue() {

        try {
            if (isEmpty(this)) {
                throw new UnderFlow("Queue is Empty");
            } else {
                for (int i = this.start + 1; i <= this.end; i++) {
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