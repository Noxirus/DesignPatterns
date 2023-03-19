package Queue;

import Stack.Stack;

public class StackQueue {
    int count = 0;
    int capacity;

    public StackQueue(int capacity){
        this.capacity = capacity;
    }

    Stack firstStack = new Stack();
    Stack secondStack = new Stack();

    public void enqueue(int value){
        if(isFull()){
            throw new IllegalStateException();
        }

        firstStack.push(value);
        count++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException();
        }

        int placeholder;
        int returnValue = 0;

        while(!firstStack.isEmpty()){
            placeholder = firstStack.pop();
            if(firstStack.isEmpty()){
                returnValue = placeholder;
            }
            else{
                secondStack.push(placeholder);
            }
        }

        while(!secondStack.isEmpty()){
            firstStack.push(secondStack.pop());
        }

        count--;
        return returnValue;
    }

    public int peek(){
        Stack tempStack = firstStack;
        int returnValue = tempStack.pop();
        while(!tempStack.isEmpty()){
            returnValue = tempStack.pop();
        }

        return returnValue;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == capacity;
    }
}
