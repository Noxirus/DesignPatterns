package Queue;

import java.util.Arrays;

public class ArrayQueue {
    int[] queue;

    public ArrayQueue(int capacity){
        queue = new int[capacity];
    }
    int front = 0;
    int end = 0;
    int count = 0;

    public void enqueue(Integer value){
        if(isFull()){
            throw new IllegalStateException();
        }
        queue[end] = value;
        end = (end + 1) % queue.length;
        count++;
    }

    public Integer dequeue(){
        int returnValue = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return returnValue;
    }

    public Integer peek(){
        return queue[front];
    }

    public boolean isFull(){
        return count == queue.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(queue);
    }
}
