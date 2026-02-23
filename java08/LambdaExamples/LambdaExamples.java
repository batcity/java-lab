package java8.LambdaExamples;

import java.util.ArrayList;
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

    private static void sortByFirstCharacter(List<String> input) {
        input.sort((s1,s2) -> Character.compare(s1.charAt(0), s2.charAt(0)));
    }

    public static void main(String args[]) {

        List<Integer> inputList = List.of(1,2,3,10);

        System.out.println("Printing elements greater than 5...");
        printElements(inputList, list -> list.stream().filter(element -> element > 5).toList());

        System.out.println("Printing elements greater than 1...");
        printElementsWithSingleElementFilter(inputList, element -> element > 1);

        var wordList = new ArrayList<>(List.of("this", "is", "a", "test"));
        System.out.println("Sorting words by their first character");
        sortByFirstCharacter(wordList);
        wordList.forEach(System.out::println);

        System.out.println("For each element in a list, calculate it's square and then sum all the squares");
        // note this returns an optional value
        var output = inputList.stream().map(x -> x * x).reduce((x,y) -> x + y);
        System.out.println("the sum of the elements squared for input: " + inputList + " is: " + output.get());

        // This example showcases a supplier:
        System.out.println("This example showcases a supplier that throws an exception...");
        inputList.stream().filter(n -> n == 100).findAny().orElseThrow(() -> new IllegalArgumentException("Number " + 100 + " not found!"));
    }
}
