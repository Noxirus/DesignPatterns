package Stack;

public class Stack {
    private int[] content = new int[2];
    int size = 0;

    // push
    public void push(int value){
        if(size == content.length){
            content = reSizeArray();
        }
        content[size++] = value;
    }

    private int[] reSizeArray(){
        int[] newArray = new int[content.length * 2];
        for(int i = 0; i < content.length; i++){
            newArray[i] = content[i];
        }

        return newArray;
    }
    // pop
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException();
        }

        return content[--size];
    }
    // peek
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        return content[size - 1];
    }
    // isEmpty
    public boolean isEmpty(){
        return size == 0;
    }
    // int[]
    public String returnStack(){
        StringBuilder stackString = new StringBuilder();
        stackString.append("[");
        for(int i = 0; i < size; i++){
            stackString.append(content[i] + ", ");
        }
        stackString.append("]");
        return stackString.toString();
    }
}
