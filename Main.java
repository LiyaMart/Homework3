// Создать класс Поток, содержащий в себе список учебных групп и реализующий интерфейс Iterable;
// Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
// Модифицировать класс Контроллер, добавив в него созданный сервис;
// Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.


package Homework3;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        LearningStream<String> stream1 = new LearningStream<>();
        stream1.add("ЭБ-1");
        stream1.add("ЭБ-2");
        stream1.add("ЭБ-3");

        LearningStream<String> stream2 = new LearningStream<>();
        stream2.add("ПИМ-1");
        stream2.add("ПИМ-2");
        stream2.add("ПИМ-3");
        stream2.add("ПИМ-4");

        LearningStream<String> stream3 = new LearningStream<>();
        stream3.add("Х-1");
        
        List<LearningStream<String>> streams = new ArrayList<LearningStream<String>>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        StreamService streamService = new StreamService();

        new Controller(streamService);

        Controller.streamSort(streams);


        for (LearningStream<String> learningStream : streams) {
            System.out.println("LearningStream:");
            System.out.println(" " + learningStream.getItems());
            }       
        }
    }