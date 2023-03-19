package Queue;

import LinkedList.LinkedList;

public class LinkedQueue {
    LinkedList queue = new LinkedList();

    public void enqueue(int value){
        queue.addFirst(value);
    }

    public int dequeue(){
        int returnValue = queue.indexOf(0);
        queue.deleteFirst();
        return returnValue;
    }

    public int peek(){
        return queue.indexOf(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
