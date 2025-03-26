class class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;
    int size;

    public Queue() {
        front = rear = null;
        size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    public int size() {
        return size; // Fixed the typo here
    }
}

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(21);
        queue.enqueue(12);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue size: " + queue.size());
    }
}
 {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private StackNode top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedData = top.data; 
        top = top.next;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data; 
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        StackNode current = top;
        System.out.println("Stack elements:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(); 
        stack.push(1);
        stack.push(21);
        stack.push(12);
        stack.display();
        System.out.println("Top element is: " + stack.peek());
        System.out.println(stack.pop() + " popped from the stack");
        stack.display();
    }
}
