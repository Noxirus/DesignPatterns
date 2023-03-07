package Structural.Proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, EBook> ebooks = new HashMap<>();

    public void add(EBook ebook){
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEBook(String fileName){
        ebooks.get(fileName).show();
    }
}
