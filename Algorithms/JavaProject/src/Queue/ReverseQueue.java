package Queue;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public Queue<Integer> reverse(Queue<Integer> queue){

        Stack<Integer> reversedList = new Stack<>();
        while(!queue.isEmpty()){
            Integer removed = queue.remove();
            reversedList.add(removed);
        }

        while(!reversedList.isEmpty()){
            Integer popped = reversedList.pop();
            queue.add(popped);
        }

        return queue;
    }
}
