package org.PSA_INFO6205;
/**
 *
 * @author alekhya
 */
public class StackString {

    static final int maxSize = 50;
    private static String[]StackArray_String;
    private int topElement;

    public StackString(){
        StackArray_String=new String[maxSize];
        topElement=-1;
    }
    // push elements into stack
    public void push(String ch)
    {
        if(!isFull()) {
            topElement++;
            StackArray_String[topElement] = ch;
            System.out.println("Recently Pushed Element: " + ch);
        } else{
            System.out.println("OOPS!! Stack is already Full");
        }
    }
    // popping elements from the stack
    public void pop(){
        if(topElement<0)
        {
            System.out.println("Hyy!!Stack is Empty");
            return;
        }
        String str=StackArray_String[0];
        for (int i=0;i<StackArray_String.length-1;i++)
        {
            StackArray_String[i]=StackArray_String[i+1];
        }
        System.out.println("Recent Item popped: " +str);
        topElement-- ;
        return;

    }
    // peeking the elements in the stack
    public String peek() {
        return StackArray_String[topElement];
    }
    // operations: to check if the stack is empty
    public boolean isEmpty() {
        return (topElement == -1);
    }
    // operations: to check if the stack is Full
    public boolean isFull() {
        return (topElement == maxSize - 1);
    }

    public void StringStackprint(){
        if(isEmpty())
        {
            return;
        }
        for(String s : StackString.StackArray_String)
        {
            if(s!=null)
            {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        String myinput="It was the best time";
        String[] array= myinput.split("");
        StackString stack1=new StackString();
        System.out.println();
        System.out.println("Checking if Stack is Empty:" + stack1.isEmpty());
        System.out.println();
        System.out.println("Pushing all the elements into the Stack \n");
        for( String element: array)
        {
            stack1.push(element);
        }
        System.out.println();
        System.out.println("Checking if Stack is Empty: " + stack1.isEmpty());
        System.out.println();
        System.out.println("Displaying back all the elements the from the stack\n");
        while (!stack1.isEmpty()) {

            stack1.pop();
        }
        System.out.println();
        System.out.println("Checking if Stack is Empty: " + stack1.isEmpty());
        System.out.println();
        stack1.pop();
    }
}


/*OUTPUT:

"C:\Program Files\Java\jdk-15.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\lib\idea_rt.jar=53518:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\alekh\IdeaProjects\Leetcode\out\production\Leetcode org.PSA_INFO6205.StackString

Checking if Stack is Empty:true

Pushing all the elements into the Stack

Recently Pushed Element: I
Recently Pushed Element: t
Recently Pushed Element:
Recently Pushed Element: w
Recently Pushed Element: a
Recently Pushed Element: s
Recently Pushed Element:
Recently Pushed Element: t
Recently Pushed Element: h
Recently Pushed Element: e
Recently Pushed Element:
Recently Pushed Element: b
Recently Pushed Element: e
Recently Pushed Element: s
Recently Pushed Element: t
Recently Pushed Element:
Recently Pushed Element: t
Recently Pushed Element: i
Recently Pushed Element: m
Recently Pushed Element: e

Checking if Stack is Empty: false

Displaying back all the elements the from the stack

Recent Item popped: I
Recent Item popped: t
Recent Item popped:
Recent Item popped: w
Recent Item popped: a
Recent Item popped: s
Recent Item popped:
Recent Item popped: t
Recent Item popped: h
Recent Item popped: e
Recent Item popped:
Recent Item popped: b
Recent Item popped: e
Recent Item popped: s
Recent Item popped: t
Recent Item popped:
Recent Item popped: t
Recent Item popped: i
Recent Item popped: m
Recent Item popped: e

Checking if Stack is Empty: true

Hyy!!Stack is Empty

Process finished with exit code 0

*/

