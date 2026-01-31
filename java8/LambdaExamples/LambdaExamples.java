package java8.LambdaExamples;

import java.util.List;

public class LambdaExamples {

    @FunctionalInterface
    interface FilterList<T> {
        List<T> filter(List<T> input);
    }
    
}
