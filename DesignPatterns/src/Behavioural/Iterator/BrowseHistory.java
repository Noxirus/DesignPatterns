package Behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url){urls.add((url));}

    public String pop(){
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements  Iterator {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){

            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}

//A class can contain an iterator to handle the logic of iterating through contents as specified, without needing to change the implementation from outside
// Example, if we change the content to a different collection, we would need to change how we iterate through it, but with this implementation we can leave the hasNext, etc in place
// And then just change how the next item is retrieved

/*
 var history = new BrowseHistory();
       history.push("a");
       history.push("b");
       history.push("c");

       Behavioural.Iterator iterator = history.createIterator();
       while(iterator.hasNext()){
           var url = iterator.current();
           System.out.println(url);
           iterator.next();
       }
 */