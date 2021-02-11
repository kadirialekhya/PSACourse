package org.PSA_INFO6205;


import java.util.NoSuchElementException;

public class TestLinkedListWithQueue {
    private Node front, rear;

    private class Node {

        String data;
        Node next;
    }

    TestLinkedListWithQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String str) {
// If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            Node node = new Node();
            node.data = str;
            node.next = null;
            this.front = this.rear = node;
            System.out.println("Enqueued: " + node.data);
            return;
        }
        Node node = new Node();
        node.data = str;
        node.next = null;
        System.out.println("Enqueued: " + node.data);

        // Add the new node at the end of queue and change rear
        this.rear.next = node;
        this.rear = node;
    }
    public void dequeue() {
        // If queue is empty, return NULL.
        if (this.front == null) {
            return;
        }
        System.out.println("\nDequeued: " + this.front.data);
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null) {
            this.rear = null;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public String peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        return front.data;
    }

    public void display() {
        if (front == null) {
            System.out.println("\nQueue Underflow");
        } else {
            Node temp = front;
            System.out.println("\nElements in the queue:");
            while (temp != null) {

                System.out.println(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        TestLinkedListWithQueue q = new TestLinkedListWithQueue ();
        q.enqueue("to");
        q.enqueue("be");
        q.enqueue("or");
        q.display();
        q.dequeue();
        q.display();
        q.enqueue("not");
        q.enqueue("to");
        q.enqueue("be");
        q.display();
    }



}
/*
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=55440:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.TestLinkedListWithQueue
Enqueued: to
Enqueued: be
Enqueued: or

Elements in the queue:
to->
be->
or->

Dequeued: to

Elements in the queue:
be->
or->
Enqueued: not
Enqueued: to
Enqueued: be

Elements in the queue:
be->
or->
not->
to->
be->

Process finished with exit code 0

 */
