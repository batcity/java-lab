import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShallowCopy {

    private static List<StringBuilder> copyListOfStringBuilders(List<StringBuilder> inputList) {
        List<StringBuilder> outputList = new ArrayList<>();

        for(StringBuilder item: inputList) outputList.add(item);
        return outputList;
    }

    public static void main(String args[]) {

        List<StringBuilder> inputList = new ArrayList<>();
        inputList.add(new StringBuilder("Hello"));
        inputList.add(new StringBuilder("Earth"));
        var copiedList = copyListOfStringBuilders(inputList);
        StringBuilder elementOne = inputList.get(1);
        elementOne.replace(0, elementOne.length(), "Mars");
        System.out.print(copiedList);
    }
}
