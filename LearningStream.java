package Homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LearningStream<T> implements Iterable<T> {

    private List<T> items;  

    public LearningStream() {
        this.items = new ArrayList<>();
    }

    public void add(T item){
        items.add(item);
    }

    public int size(){
        return items.size();
    }

    @Override
    public Iterator<T> iterator(){
        return items.iterator();
    }

    public List<T> getItems() {
        return items;
    }
}
