package Homework3;

import java.util.List;

class Controller {
    private static StreamService streamService;

    public Controller(StreamService streamService) {
        Controller.streamService = streamService;
    }

    public static void streamSort(List<LearningStream<String>> streams) {
        streamService.streamSort(streams);
    }
}