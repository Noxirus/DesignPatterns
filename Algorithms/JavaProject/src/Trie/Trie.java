package Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trie {
    class Node{
        char value;
        HashMap<Character, Node> children = new HashMap<>();
        boolean isEndOfWord = false;

        public Node(char value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }

        public boolean hasChild(char ch){
            return children.containsKey(ch);
        }

        public void addChild(char ch){
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch){
            return children.get(ch);
        }

        public Node[] getChildren(){
            return children.values().toArray(new Node[0]);
        }

        public boolean hasChildren(){
            return !children.isEmpty();
        }

        public void removeChild(char ch){
            children.remove(ch);
        }
    }

    private Node root = new Node(' ');

    public void insert(String word){
        Node currentNode = root;
        for(char ch : word.toCharArray()){
            if(!currentNode.hasChild(ch)){
                currentNode.addChild(ch);
            }
            currentNode = currentNode.getChild(ch);
        }
        currentNode.isEndOfWord = true;
    }

    public boolean contains(String word){
        if(word == null)
            return false;

        Node currentNode = root;
        for(var ch : word.toCharArray()){
            if(!currentNode.hasChild(ch))
                return false;

            currentNode = currentNode.getChild(ch);
        }

        return currentNode.isEndOfWord;
    }

    public void traverse(){
        traverse(root);
    }

    private void traverse(Node root){
        for(var child : root.getChildren()){
            traverse(child);
        }
        System.out.println(root.value);
    }

    public List<String> findWords(String prefix){
        List<String> words = new ArrayList<>();
        var lastNode = findLastNodeOf(prefix);
        findWords(lastNode, prefix, words);

        return words;
    }

    private void findWords(Node root, String prefix, List<String> words){
        if(root == null)
            return;

        if(root.isEndOfWord)
            words.add(prefix);
        for(var child : root.getChildren()){
            findWords(child, prefix + child.value, words);
        }
    }

    private Node findLastNodeOf(String prefix){
        if(prefix == null)
            return null;

        var current = root;
        for(var ch : prefix.toCharArray()){
            var child = current.getChild(ch);
            if(child == null)
                return null;
            current = child;
        }
        return current;
    }

    public void remove(String word){
        if(word == null)
            return;

        remove(root, word, 0);
    }

    private void remove(Node root, String word, int index){
        if(index == word.length()){
            root.isEndOfWord = false;
            return;
        }


        var ch = word.charAt(index);
        var child = root.getChild(ch);
        if(child == null)
            return;

        remove(child, word, index + 1);

        if(!child.hasChildren() && !child.isEndOfWord)
            root.removeChild(ch);
    }
}
