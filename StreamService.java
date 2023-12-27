package Homework3;

import java.util.Collections;
import java.util.List;


public class StreamService {

    public void streamSort(List<LearningStream<String>> streams) {
        Collections.sort(streams, new StreamComparator<>());

    }

    }