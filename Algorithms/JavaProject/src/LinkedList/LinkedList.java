package LinkedList;

public class LinkedList {
    private Node first;
    private Node last;

    //addFirst
    public void addFirst(int value){
        if(first == null){
            first = new Node(value);
            last = first;
        }
        else{
            Node newNode = new Node(value);
            newNode.setNext(first);
            first = newNode;
        }
    }

    //addLast
    public void addLast(int value){
        if(first == null){
            first = new Node(value);
            last = first;
        }
        else{
            Node newNode = new Node(value);
            last.setNext(newNode);
            last = newNode;
        }
    }

    //deleteFirst
    //deleteLast
    //contains
    //indexOf

    public String returnList(){
        StringBuilder string = new StringBuilder();
        Node currentNode = first;
        string.append("[");
        while(currentNode != null){
            string.append(currentNode.getValue() + ", ");
            currentNode = currentNode.getNext();
        }
        string.append("]");
        return string.toString();
    }
}
