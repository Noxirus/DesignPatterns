package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    private int size;

    public void reverse(){
        if(isEmpty()) return;

       var previous = first;
       var current = first.getNext();
       while(current != null){
           var next = current.getNext();
           current.setNext(previous);
           previous = current;
           current = next;
       }

       last = first;
       last.setNext(null);
       first = previous;
    }

    public int getKthFromTheEnd(int k){
        if(isEmpty()){
            throw new IllegalStateException();
        }

        if(k <= 0){
            throw new IllegalArgumentException();
        }

        int distance = k - 1;
        Node firstNode = first;
        Node secondNode = first;

        int step = 0;
        while(firstNode.getNext() != null){
            step++;
            if(step > distance){
                secondNode = secondNode.getNext();
            }
            firstNode = firstNode.getNext();
        }

        if(step < distance){
            return -1;
        }

        return secondNode.getValue();
    }

    //addFirst
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            first = newNode;
            last = first;
        }
        else{
            newNode.setNext(first);
            first = newNode;
        }

        size++;
    }

    //addLast
    public void addLast(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            first = newNode;
            last = first;
        }
        else{
            last.setNext(newNode);
            last = newNode;
        }

        size++;
    }

    //deleteFirst
    public void deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last){
            first = last = null;
        }
        else{
            var second = first.getNext();
            first.setNext(null);
            first = second;
        }
        size--;
    }
    //deleteLast
    public void deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last){
            first = last = null;
        }
        else{
            var previous = getPrevious(last);
            last = previous;
            last.setNext(null);
        }
        size--;
    }

    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.getNext() == node){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
    //contains
    public boolean contains(int value){
        return(indexOf(value)) != -1;
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

    public int[] toArray(){
        int[] array = new int[size];
        int count = 0;
        Node currentNode = first;

        while(currentNode != null){
            array[count++] = currentNode.getValue();
            currentNode = currentNode.getNext();
        }

        return array;
    }

    public int size(){
        return size;
    }

    private boolean isEmpty(){
        return first == null;
    }
}
