package Homework3;

import java.util.Comparator;

public class StreamComparator<T> implements Comparator<LearningStream<T>>{

    @Override
    public int compare(LearningStream<T> o1, LearningStream<T> o2) {
        return Integer.compare(o1.size(), o2.size());
    }
}
