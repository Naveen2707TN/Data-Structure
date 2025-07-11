package Queue;

public class JavaQueue {
    
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.EnQueue(10);
        queue.EnQueue(20);
        queue.EnQueue(30);
        System.out.println(queue.DeQueue());
        System.out.println(queue.DeQueue());
        System.out.println(queue.DeQueue());
        System.out.println(queue.DeQueue());
                System.out.println(queue.DeQueue());

    }
}

class Queue {
    int Max = 10;
    int front = -1, rear = -1;
    int Queue[] = new int[Max];
    
    public void EnQueue(int val){
        if (rear == Max -1) {
            System.out.println("out of space");
            return;
        }
        Queue[++rear] = val;
    }

    public int DeQueue(){
        if (front >= rear) {
            System.out.println("out of space");
            return -1;
        }
        int val = Queue[++front];
        return val;
    }
}
