package org.PSA_INFO6205;



public class ArrayImplementationQueue {
    private int rear,front,maxSize;
    private String[] queue;
    ArrayImplementationQueue(int size)
    {
        maxSize=size;
        queue=new String[maxSize];
        rear=-1;
        front=0;
    }
    public void enqueue(String str)
    {
        if (maxSize-1 == rear) {
            System.out.println("\nQueue is full\n");
            return;
        }
        else {

            System.out.println("Pushed element:" + str);
            rear++;
            queue[rear] = str;

        }
        return;
    }
    public void dequeue()
    {
        // If queue is empty, return.
        if (rear==-1) {

            System.out.print("Queue is empty");
            return;
        }


        System.out.print("\nPOPPING ELEMENT:\n" + queue[rear] + "\n");
        if (rear==0){
            queue[rear] = "";
            rear--;
            return;
        }
        for (int i = 0; i < rear ; i++) {
            queue[i] = queue[i + 1];
        }
        // store 0 at rear indicating there's no element
        if (rear < maxSize)
            queue[rear] = "";
        rear--;

    }
    public boolean isFull()
    {
        return rear == maxSize-1;
    }
    public boolean isEmpty()
    {

        return rear==-1;
    }
    public String peek() {
        if (isEmpty())  System.out.println("\nQueue is Empty\n");
        return queue[front];
    }
    public void display()
    {
        if (rear==-1) {
            System.out.println("\nQueue is Empty\n");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
        return;
    }
    public static void main(String[] args) {
        ArrayImplementationQueue q = new ArrayImplementationQueue(10);
        q.enqueue("It");
        q.enqueue("Was");
        q.enqueue("the");
        q.enqueue("best");
        q.enqueue("of");
        q.enqueue("times");
        q.dequeue();
        q.dequeue();
        //q.dequeue();

        System.out.println( " Peek element is: " + q.peek());


        //q.dequeue();

        System.out.println( "Displaying all elements in the queue");
        q.display();
    }
}
/*
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=55466:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.ArrayImplementationQueue
Pushed element:It
Pushed element:Was
Pushed element:the
Pushed element:best
Pushed element:of
Pushed element:times

POPPING ELEMENT:
times

POPPING ELEMENT:
times
 Peek element is: the
Displaying all elements in the queue
the
best
of
times

Process finished with exit code 0

 */
