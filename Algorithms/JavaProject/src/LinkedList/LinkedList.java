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
    public void deleteFirst(){
        if(first.getNext() == null){
            last = null;
        }
        first = first.getNext();
    }
    //deleteLast
    public void deleteLast(){
        Node currentNode = first;
        Node previousNode = null;
        while(currentNode != null){
            if(currentNode.getNext() == null){
                System.out.println("Current: " + currentNode.getValue() + " / Previous: " + previousNode.getValue());
                last = previousNode;
                last.setNext(null);
                return;
            }
            else{
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }
    }
    //contains
    public boolean contains(int value){
        Node currentNode = first;
        while(currentNode != null){
            if(currentNode.getValue() == value){
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }
    //indexOf
    public int indexOf(int index){
        Node currentNode = first;
        int currentIndex = 0;
        while(currentNode != null){
            if(currentIndex == index){
                return currentNode.getValue();
            }
            currentIndex++;
            currentNode = currentNode.getNext();
        }

        return -1;
    }

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
