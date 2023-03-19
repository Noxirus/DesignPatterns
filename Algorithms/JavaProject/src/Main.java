import Stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack testStack = new Stack();

        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        testStack.push(5);

        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.pop();

        System.out.println(testStack.peek());
    }
}