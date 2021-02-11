package org.PSA_INFO6205;

import org.w3c.dom.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LinkedList_Stack {

    private static Node head;
    ArrayList<String> dataList;

    private class Node{
        String data;
        Node next;

        Node(String d)
        {
            data=d;
            next=null;
        }
    }
    LinkedList_Stack(){
        LinkedList_Stack.head=null;
        dataList=new ArrayList<String>();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String peek() {
        if (!isEmpty()) {
            return head.data;
        } else {
            System.out.println("OOPS!!Stack is Empty");
            return null;
        }
    }
    public void push(String str) {
        Node newNode = new Node(str);
        newNode.next = head;
        head = newNode;
        System.out.println("Item pushed now: " + head.data);
    }

    public void pop() {
        if (head == null) {
            System.out.print("\nOOPS!!Stack is Empty");
            return;
        }

        System.out.print("POPPING ELEMENT\n" + head.data);
        head = (head).next;
    }
    void printReverseOrder() {
        if (head == null) {
            System.out.println("OOPS!!Stack is Empty");
        } else {
            System.out.println("Printing stack in Reverse Order:");
            Node temp = head;
            while (temp != null) {
                System.out.println("Item: " + temp.data);
                temp = temp.next;
            }
        }
    }
    void printOriginalOrder(Node temp) {
        if (temp == null) {
            return;
        }
        printOriginalOrder(temp.next);
        System.out.println("Item: " + temp.data);

    }
    void printOriginalOrder() {
        Node temp = head;
        if (head == null) {
            System.out.println("OOPS!!Stack is Empty");
        } else {
            System.out.println("Printing stack in Original Order:");
            printOriginalOrder(temp);
        }
    }

    public void readFile() {
        Scanner s;
        try {
            s = new Scanner(new File("C:\\Users\\alekh\\Desktop\\PSA-INFO6205\\AlekhyaKadiri_001564618_Homework_2\\input.txt"));

            while (s.hasNextLine()) {
                dataList.add(s.next());
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LinkedList_Stack myStackWithLinkedList=new LinkedList_Stack();
        myStackWithLinkedList.readFile();
        System.out.println("stack is empty ?: " + myStackWithLinkedList.isEmpty());
        System.out.println();
        System.out.println("pushing 4 elements into the stack:");
        //pushing 4 elements into the stack
        for(int i=0; i<4 ; i++)
        {
            myStackWithLinkedList.push(myStackWithLinkedList.dataList.get(i));
        }
        System.out.println();
        System.out.println("Stack isEmpty ?: " + myStackWithLinkedList.isEmpty());
        System.out.println();
        //popping 5 elements from stack
        System.out.println("\nPoping 5 elements from stack");
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();

        System.out.println();
        System.out.println("Stack isEmpty ?: " + myStackWithLinkedList.isEmpty());
        System.out.println();

        System.out.println("Stack isEmpty ?: " + myStackWithLinkedList.isEmpty());
        System.out.println();
        //pushing all elements into stack
        System.out.println("Pushing all elements into stack");
        for (int i = 0; i < myStackWithLinkedList.dataList.size(); i++) {
            myStackWithLinkedList.push(myStackWithLinkedList.dataList.get(i));
        }
        System.out.println("Push the below elements into stack");
        /**
         * Push these into stack
         *           11 	john	henry		“software development”
         * 			12	justin	morgan	“engineering statistics
         */
        myStackWithLinkedList.push("11 john henry  software development");
        myStackWithLinkedList.push("12 justin morgan  engineering statistics");
        System.out.println();
        //popping all elements from stack
        System.out.println("Poping all elements from the stack");
        while (head != null) {
            myStackWithLinkedList.pop();
        }

        System.out.println();
        System.out.println();
//pushing 8 elements into stack
        System.out.println("Pushing 8 elements into stack");
        System.out.println();
        for (int i = 0; i < 8; i++) {
            myStackWithLinkedList.push(myStackWithLinkedList.dataList.get(i));
        }

        //popping 9 elements from stack
        System.out.println("\nPoping 9 elements from stack");
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();
        myStackWithLinkedList.pop();

        System.out.println();
        //pushing all elements into stack
        System.out.println("Pushing all elements into stack");
        for (int i = 0; i < myStackWithLinkedList.dataList.size(); i++) {
            myStackWithLinkedList.push(myStackWithLinkedList.dataList.get(i));
        }
        System.out.println();

        //popping all elements from the stack
        System.out.println("Poping all elements from the stack");
        while (head != null) {
            myStackWithLinkedList.pop();
        }
        System.out.println();

        System.out.println("\nPushing all elements into stack");

        for (int i = 0; i < myStackWithLinkedList.dataList.size(); i++) {
            myStackWithLinkedList.push(myStackWithLinkedList.dataList.get(i));
        }
        System.out.println();

        System.out.println();
        myStackWithLinkedList.printReverseOrder();
        System.out.println();
        myStackWithLinkedList.printOriginalOrder();

    }

}

/*
OUTPUT:
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=54180:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.LinkedList_Stack
stack is empty ?: true

pushing 4 elements into the stack:
Item pushed now: 1,Jack,Irwan,SoftwareEngineering
Item pushed now: 2,Billy,Mckao,RequirementEngineering
Item pushed now: 3,Nat,Mcfaden,MultivariateCalculus
Item pushed now: 4,Steven,Shwimmer,SoftwareArchitecture

Stack isEmpty ?: false


Poping 5 elements from stack
POPPING ELEMENT
4,Steven,Shwimmer,SoftwareArchitecturePOPPING ELEMENT
3,Nat,Mcfaden,MultivariateCalculusPOPPING ELEMENT
2,Billy,Mckao,RequirementEngineeringPOPPING ELEMENT
1,Jack,Irwan,SoftwareEngineering
OOPS!!Stack is Empty
Stack isEmpty ?: true

Stack isEmpty ?: true

Pushing all elements into stack
Item pushed now: 1,Jack,Irwan,SoftwareEngineering
Item pushed now: 2,Billy,Mckao,RequirementEngineering
Item pushed now: 3,Nat,Mcfaden,MultivariateCalculus
Item pushed now: 4,Steven,Shwimmer,SoftwareArchitecture
Item pushed now: 5,Ruby,Jason,RelationalDBMS
Item pushed now: 6,Mark,Dyne,PHPdevelopment
Item pushed now: 7,Philip,namdaf,MicrosoftDotNetplatform
Item pushed now: 8,Erik,Bawn,HTMI&Scripting
Item pushed now: 9,Ricky,ben,Datacommunication
Item pushed now: 10,Van,Miecky,ComputerNetworks
Push the below elements into stack
Item pushed now: 11 john henry  software development
Item pushed now: 12 justin morgan  engineering statistics

Poping all elements from the stack
POPPING ELEMENT
12 justin morgan  engineering statisticsPOPPING ELEMENT
11 john henry  software developmentPOPPING ELEMENT
10,Van,Miecky,ComputerNetworksPOPPING ELEMENT
9,Ricky,ben,DatacommunicationPOPPING ELEMENT
8,Erik,Bawn,HTMI&ScriptingPOPPING ELEMENT
7,Philip,namdaf,MicrosoftDotNetplatformPOPPING ELEMENT
6,Mark,Dyne,PHPdevelopmentPOPPING ELEMENT
5,Ruby,Jason,RelationalDBMSPOPPING ELEMENT
4,Steven,Shwimmer,SoftwareArchitecturePOPPING ELEMENT
3,Nat,Mcfaden,MultivariateCalculusPOPPING ELEMENT
2,Billy,Mckao,RequirementEngineeringPOPPING ELEMENT
1,Jack,Irwan,SoftwareEngineering

Pushing 8 elements into stack

Item pushed now: 1,Jack,Irwan,SoftwareEngineering
Item pushed now: 2,Billy,Mckao,RequirementEngineering
Item pushed now: 3,Nat,Mcfaden,MultivariateCalculus
Item pushed now: 4,Steven,Shwimmer,SoftwareArchitecture
Item pushed now: 5,Ruby,Jason,RelationalDBMS
Item pushed now: 6,Mark,Dyne,PHPdevelopment
Item pushed now: 7,Philip,namdaf,MicrosoftDotNetplatform
Item pushed now: 8,Erik,Bawn,HTMI&Scripting

Poping 9 elements from stack
POPPING ELEMENT
8,Erik,Bawn,HTMI&ScriptingPOPPING ELEMENT
7,Philip,namdaf,MicrosoftDotNetplatformPOPPING ELEMENT
6,Mark,Dyne,PHPdevelopmentPOPPING ELEMENT
5,Ruby,Jason,RelationalDBMSPOPPING ELEMENT
4,Steven,Shwimmer,SoftwareArchitecturePOPPING ELEMENT
3,Nat,Mcfaden,MultivariateCalculusPOPPING ELEMENT
2,Billy,Mckao,RequirementEngineeringPOPPING ELEMENT
1,Jack,Irwan,SoftwareEngineering
OOPS!!Stack is Empty
Pushing all elements into stack
Item pushed now: 1,Jack,Irwan,SoftwareEngineering
Item pushed now: 2,Billy,Mckao,RequirementEngineering
Item pushed now: 3,Nat,Mcfaden,MultivariateCalculus
Item pushed now: 4,Steven,Shwimmer,SoftwareArchitecture
Item pushed now: 5,Ruby,Jason,RelationalDBMS
Item pushed now: 6,Mark,Dyne,PHPdevelopment
Item pushed now: 7,Philip,namdaf,MicrosoftDotNetplatform
Item pushed now: 8,Erik,Bawn,HTMI&Scripting
Item pushed now: 9,Ricky,ben,Datacommunication
Item pushed now: 10,Van,Miecky,ComputerNetworks

Poping all elements from the stack
POPPING ELEMENT
10,Van,Miecky,ComputerNetworksPOPPING ELEMENT
9,Ricky,ben,DatacommunicationPOPPING ELEMENT
8,Erik,Bawn,HTMI&ScriptingPOPPING ELEMENT
7,Philip,namdaf,MicrosoftDotNetplatformPOPPING ELEMENT
6,Mark,Dyne,PHPdevelopmentPOPPING ELEMENT
5,Ruby,Jason,RelationalDBMSPOPPING ELEMENT
4,Steven,Shwimmer,SoftwareArchitecturePOPPING ELEMENT
3,Nat,Mcfaden,MultivariateCalculusPOPPING ELEMENT
2,Billy,Mckao,RequirementEngineeringPOPPING ELEMENT
1,Jack,Irwan,SoftwareEngineering

Pushing all elements into stack
Item pushed now: 1,Jack,Irwan,SoftwareEngineering
Item pushed now: 2,Billy,Mckao,RequirementEngineering
Item pushed now: 3,Nat,Mcfaden,MultivariateCalculus
Item pushed now: 4,Steven,Shwimmer,SoftwareArchitecture
Item pushed now: 5,Ruby,Jason,RelationalDBMS
Item pushed now: 6,Mark,Dyne,PHPdevelopment
Item pushed now: 7,Philip,namdaf,MicrosoftDotNetplatform
Item pushed now: 8,Erik,Bawn,HTMI&Scripting
Item pushed now: 9,Ricky,ben,Datacommunication
Item pushed now: 10,Van,Miecky,ComputerNetworks


Printing stack in Reverse Order:
Item: 10,Van,Miecky,ComputerNetworks
Item: 9,Ricky,ben,Datacommunication
Item: 8,Erik,Bawn,HTMI&Scripting
Item: 7,Philip,namdaf,MicrosoftDotNetplatform
Item: 6,Mark,Dyne,PHPdevelopment
Item: 5,Ruby,Jason,RelationalDBMS
Item: 4,Steven,Shwimmer,SoftwareArchitecture
Item: 3,Nat,Mcfaden,MultivariateCalculus
Item: 2,Billy,Mckao,RequirementEngineering
Item: 1,Jack,Irwan,SoftwareEngineering

Printing stack in Original Order:
Item: 1,Jack,Irwan,SoftwareEngineering
Item: 2,Billy,Mckao,RequirementEngineering
Item: 3,Nat,Mcfaden,MultivariateCalculus
Item: 4,Steven,Shwimmer,SoftwareArchitecture
Item: 5,Ruby,Jason,RelationalDBMS
Item: 6,Mark,Dyne,PHPdevelopment
Item: 7,Philip,namdaf,MicrosoftDotNetplatform
Item: 8,Erik,Bawn,HTMI&Scripting
Item: 9,Ricky,ben,Datacommunication
Item: 10,Van,Miecky,ComputerNetworks

Process finished with exit code 0

*/
