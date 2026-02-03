package java8.LambdaExamples;

import java.util.List;

public class LambdaExamples {

    @FunctionalInterface
    interface ListFilter {
        List<Integer> filter(List<Integer> input);
    }

    @FunctionalInterface
    interface SingleElementFilter {
        boolean filter(int input);
    }

    private static void printElements(List<Integer> input, ListFilter listFilter) {
        List<Integer> outputList = listFilter.filter(input);
        for(int element: outputList) {
            System.out.println(element);
        }
    }

    private static void printElementsWithSingleElementFilter(List<Integer> input, SingleElementFilter listFilter) {
        for(int element: input) {

            if(listFilter.filter(element)){
                System.out.println(element);
            }
        }
    }

    public static void main(String args[]) {

        List<Integer> inputList = List.of(1,2,3,10);

        System.out.println("Printing elements greater than 5...");
        printElements(inputList, list -> list.stream().filter(element -> element > 5).toList());

        System.out.println("Printing elements greater than 1...");
        printElementsWithSingleElementFilter(inputList, element -> element > 1);
    }
}
