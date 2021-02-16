package org.PSA_HW4;

public class CircularQueue {
    int MAX_SIZE;
    private int a[];
    int front, rear;

    // Constructor - set front and rear as -1.
    // We are assuming that for an empty Queue, both front and rear will be -1.
    public CircularQueue(int size) {
        this.MAX_SIZE = size;
        a = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    // To check wheter Queue is empty or not
    boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    // To check whether Queue is full or not
    boolean isFull() {
        return (rear + 1) % MAX_SIZE == front ? true : false;
    }

    // Inserts an element in queue at rear end
    void enqueue(int x) {

        if (isFull()) {
            System.out.println("\nQueue is Full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % MAX_SIZE;
        }
        a[rear] = x;
        System.out.println("Enqueued " + x + " at position " + rear);
    }

    // Removes an element in Queue from front end.
    void dequeue() {
        if (isEmpty()) {
            System.out.println("\nQueue is Empty");
            return;
        } else if (front == rear) {
            System.out.println("Dequeued " + a[front] + " from position " + front);
            System.out.println("Queue is reset");
            rear = front = -1;
        } else {
            front = (front + 1) % MAX_SIZE;

            System.out.println("Dequeued " + a[front] + " from position " + front);
        }
    }
    // Returns element at front of queue.

    int front() {
        if (front == -1) {
            System.out.println("\nCannot return front from empty queue");
            return -1;
        }
        return a[front];
    }

    /*
	   Printing the elements in queue from front to rear.
	   This function is only to test the code.
	   This is not a standard function for Queue implementation.
     */
    void displayQueue() {
        if (isEmpty()) {
            System.out.println("\nQueue is Empty");
            return;
        }
        // Finding number of elements in queue
        int count = (rear + MAX_SIZE - front) % MAX_SIZE + 1;

        System.out.println("\nHead position: " + front);
        System.out.print("\nQueue elements: \n");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % MAX_SIZE; // Index of element while travesing circularly from front
            System.out.println(a[index] + " ");
        }
        System.out.println();

        System.out.println("Tail position: " + rear);
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(17); // creating an instance of Queue.
        System.out.println("Queue size: 17");

        System.out.println();
        cq.enqueue(62);
        cq.enqueue(18);
        cq.enqueue(77);
        cq.enqueue(24);
        cq.enqueue(11);
        cq.enqueue(27);
        cq.enqueue(43);
        cq.enqueue(38);
        cq.enqueue(3);
        cq.enqueue(9);
        cq.enqueue(82);
        cq.enqueue(10);
        cq.enqueue(21);
        cq.enqueue(8);
        cq.enqueue(34);
        cq.enqueue(19);
        cq.enqueue(6);
        System.out.println();
        cq.displayQueue();

        System.out.println();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();

        System.out.println();
        cq.displayQueue();

        System.out.println();
        cq.enqueue(62);
        cq.enqueue(18);
        cq.enqueue(77);
        cq.enqueue(24);

        System.out.println();
        cq.displayQueue();

        System.out.println();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();

        System.out.println();
        cq.displayQueue();
    }

}
/*
OUTPUT:
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=55461:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_HW4.CircularQueue
Queue size: 17

Enqueued 62 at position 0
Enqueued 18 at position 1
Enqueued 77 at position 2
Enqueued 24 at position 3
Enqueued 11 at position 4
Enqueued 27 at position 5
Enqueued 43 at position 6
Enqueued 38 at position 7
Enqueued 3 at position 8
Enqueued 9 at position 9
Enqueued 82 at position 10
Enqueued 10 at position 11
Enqueued 21 at position 12
Enqueued 8 at position 13
Enqueued 34 at position 14
Enqueued 19 at position 15
Enqueued 6 at position 16


Head position: 0

Queue elements:
62
18
77
24
11
27
43
38
3
9
82
10
21
8
34
19
6

Tail position: 16

Dequeued 18 from position 1
Dequeued 77 from position 2
Dequeued 24 from position 3
Dequeued 11 from position 4
Dequeued 27 from position 5
Dequeued 43 from position 6
Dequeued 38 from position 7
Dequeued 3 from position 8
Dequeued 9 from position 9


Head position: 9

Queue elements:
9
82
10
21
8
34
19
6

Tail position: 16

Enqueued 62 at position 0
Enqueued 18 at position 1
Enqueued 77 at position 2
Enqueued 24 at position 3


Head position: 9

Queue elements:
9
82
10
21
8
34
19
6
62
18
77
24

Tail position: 3

Dequeued 82 from position 10
Dequeued 10 from position 11
Dequeued 21 from position 12
Dequeued 8 from position 13
Dequeued 34 from position 14
Dequeued 19 from position 15
Dequeued 6 from position 16
Dequeued 62 from position 0
Dequeued 18 from position 1
Dequeued 77 from position 2
Dequeued 24 from position 3
Dequeued 24 from position 3
Queue is reset


Queue is Empty

Process finished with exit code 0

 */