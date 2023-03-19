package Queue;

public class PriorityQueue {
    int[] queue;
    int count = 0;
    int front = 0;

    public PriorityQueue(int capacity){
        queue = new int[capacity];
    }

    public void enqueue(int value){
        if(isFull()){
            throw new IllegalStateException();
        }

       int index = shiftItemsToInsert(value);

        queue[index] = value;
        count++;
    }

    public int shiftItemsToInsert(int value){
        int i;
        for(i = count - 1; i >= 0; i--){
            if(queue[i] > value){
                queue[i + 1] = queue[i];
            }
            else{
                break;
            }
        }

        return i + 1;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        return queue[--count];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == queue.length;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("[");
        for(var num : queue){
            string.append(num + ", ");
        }
        string.append("]");
        return string.toString();
    }

}
