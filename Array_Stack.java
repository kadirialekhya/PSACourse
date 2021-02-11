package org.PSA_INFO6205;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Stack {

    static final int MAX=50;
    String arr[];
    private static int head;
    List<String> dataList;

    Array_Stack()
    {
        this.arr = new String[MAX];
        dataList = new ArrayList<String>();
        Array_Stack.head = -1;
    }

    public void push(String elementPushed) {
        if (!isFull()) {
            head++;
            arr[head] = elementPushed;
            System.out.println("Pushed element:" + elementPushed);
        } else {
            System.out.println("Hyy!!Stack is full !");
        }
    }

    public void pop() {
        if (head <= -1) {
            System.out.print("OOPS!!Stack is empty");
            return;
        }

        head--;
    }
    public String peek() {
        if (!this.isEmpty()) {
            return arr[head];
        } else {
            System.out.println("OOPS!!Stack is Empty");
            return null;
        }
    }
    public boolean isEmpty() {
        return (head == -1);
    }

    public boolean isFull() {
        return (MAX - 1 == head);
    }
    void printOriginalOrder() {
        if (head == -1) {
            System.out.println("OOPS!!Stack is Empty");
        } else {
            System.out.println("Printing back the stack in Original Order:");
            for (int i = 0; i <= head; i++) {
                System.out.println("Item: " + arr[i]);

            }
        }
    }

    void printReverseOrder() {
        if (head == -1) {
            System.out.println("OOPS!!Stack is Empty");
        } else {
            System.out.println("Printing back the stack in Reverse Order:");
            for (int i = head; i >= 0; i--) {
                System.out.println("Item: " + arr[i]);

            }

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
        Array_Stack myStackWithArray = new Array_Stack();
        myStackWithArray.readFile();
        System.out.println("Stack isEmpty: " + myStackWithArray.isEmpty());
        System.out.println();
        System.out.println("Pushing 4 elements into stack");
        //pushing 4 elements into stack
        for (int i = 0; i < 4; i++) {
            myStackWithArray.push(myStackWithArray.dataList.get(i));
        }
        System.out.println();
        System.out.println("Stack isEmpty: " + myStackWithArray.isEmpty());
        System.out.println();

        System.out.println("\nPoping 5 elements from stack");
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();

        System.out.println();
        System.out.println("Stack isEmpty: " + myStackWithArray.isEmpty());
        System.out.println();


        System.out.println("\nPushing all elements into stack");
        for (int i = 0; i < myStackWithArray.dataList.size(); i++) {
            myStackWithArray.push(myStackWithArray.dataList.get(i));
        }
        System.out.println();

        System.out.println("\nPoping all elements from stack");
        while (head > -1) {
            myStackWithArray.pop();
        }

        System.out.println();
        System.out.println("Pushing 8 elements into stack");
        //pushing 4 elements into stack
        for (int i = 0; i < 8; i++) {
            myStackWithArray.push(myStackWithArray.dataList.get(i));
        }
        System.out.println();
        System.out.println("Stack isEmpty: " + myStackWithArray.isEmpty());
        System.out.println();

        System.out.println("\nPoping 9 elements from stack");
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();
        myStackWithArray.pop();

        System.out.println();
        System.out.println("Stack isEmpty: " + myStackWithArray.isEmpty());
        System.out.println();

        System.out.println();

        System.out.println("\nPushing all elements into stack");

        for (int i = 0; i < myStackWithArray.dataList.size(); i++) {
            myStackWithArray.push(myStackWithArray.dataList.get(i));
        }

        System.out.println("Push the below elements into stack");
        /**
         * Push these into stack
         *           11 	john	henry		“software development”
         * 			12	justin	morgan	“engineering statistics
         */
        myStackWithArray.push("11 john henry  software development");
        myStackWithArray.push("12 justin morgan  engineering statistics");
        System.out.println();

        System.out.println("\nPoping all elements from stack");
        while (head > -1) {
            myStackWithArray.pop();
        }
        System.out.println("\nPushing all elements into stack");

        for (int i = 0; i < myStackWithArray.dataList.size(); i++) {
            myStackWithArray.push(myStackWithArray.dataList.get(i));
        }

        System.out.println();
        System.out.println();
        myStackWithArray.printReverseOrder();
        System.out.println();
        myStackWithArray.printOriginalOrder();

    }


}
/*
OUTPUT:
"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=54168:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.Array_Stack
Stack isEmpty: true

Pushing 4 elements into stack
Pushed element:1,Jack,Irwan,SoftwareEngineering
Pushed element:2,Billy,Mckao,RequirementEngineering
Pushed element:3,Nat,Mcfaden,MultivariateCalculus
Pushed element:4,Steven,Shwimmer,SoftwareArchitecture

Stack isEmpty: false


Poping 5 elements from stack
OOPS!!Stack is empty
Stack isEmpty: true


Pushing all elements into stack
Pushed element:1,Jack,Irwan,SoftwareEngineering
Pushed element:2,Billy,Mckao,RequirementEngineering
Pushed element:3,Nat,Mcfaden,MultivariateCalculus
Pushed element:4,Steven,Shwimmer,SoftwareArchitecture
Pushed element:5,Ruby,Jason,RelationalDBMS
Pushed element:6,Mark,Dyne,PHPdevelopment
Pushed element:7,Philip,namdaf,MicrosoftDotNetplatform
Pushed element:8,Erik,Bawn,HTMI&Scripting
Pushed element:9,Ricky,ben,Datacommunication
Pushed element:10,Van,Miecky,ComputerNetworks


Poping all elements from stack

Pushing 8 elements into stack
Pushed element:1,Jack,Irwan,SoftwareEngineering
Pushed element:2,Billy,Mckao,RequirementEngineering
Pushed element:3,Nat,Mcfaden,MultivariateCalculus
Pushed element:4,Steven,Shwimmer,SoftwareArchitecture
Pushed element:5,Ruby,Jason,RelationalDBMS
Pushed element:6,Mark,Dyne,PHPdevelopment
Pushed element:7,Philip,namdaf,MicrosoftDotNetplatform
Pushed element:8,Erik,Bawn,HTMI&Scripting

Stack isEmpty: false


Poping 9 elements from stack
OOPS!!Stack is empty
Stack isEmpty: true



Pushing all elements into stack
Pushed element:1,Jack,Irwan,SoftwareEngineering
Pushed element:2,Billy,Mckao,RequirementEngineering
Pushed element:3,Nat,Mcfaden,MultivariateCalculus
Pushed element:4,Steven,Shwimmer,SoftwareArchitecture
Pushed element:5,Ruby,Jason,RelationalDBMS
Pushed element:6,Mark,Dyne,PHPdevelopment
Pushed element:7,Philip,namdaf,MicrosoftDotNetplatform
Pushed element:8,Erik,Bawn,HTMI&Scripting
Pushed element:9,Ricky,ben,Datacommunication
Pushed element:10,Van,Miecky,ComputerNetworks
Push the below elements into stack
Pushed element:11 john henry  software development
Pushed element:12 justin morgan  engineering statistics


Poping all elements from stack

Pushing all elements into stack
Pushed element:1,Jack,Irwan,SoftwareEngineering
Pushed element:2,Billy,Mckao,RequirementEngineering
Pushed element:3,Nat,Mcfaden,MultivariateCalculus
Pushed element:4,Steven,Shwimmer,SoftwareArchitecture
Pushed element:5,Ruby,Jason,RelationalDBMS
Pushed element:6,Mark,Dyne,PHPdevelopment
Pushed element:7,Philip,namdaf,MicrosoftDotNetplatform
Pushed element:8,Erik,Bawn,HTMI&Scripting
Pushed element:9,Ricky,ben,Datacommunication
Pushed element:10,Van,Miecky,ComputerNetworks


Printing back the stack in Reverse Order:
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

Printing back the stack in Original Order:
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