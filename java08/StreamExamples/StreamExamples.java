import java.util.*;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> carBrandList = List.of("mercedes", "volvo", "mazda", "bmw", "mcLaren");

        // The following block uses the Stream API: It looks 
        // concise and readable compared to the for-loop that does something similar 
        // below this block
        carBrandList.stream()
                    .filter(brand -> brand.startsWith("m"))  // keep brands starting with 'm'
                    .map(String::toUpperCase)               // convert to uppercase
                    .sorted()                               // sort alphabetically
                    .forEach(System.out::println);          // print each

        // Equivalent using for-loops (more verbose)
        List<String> filteredBrands = new ArrayList<>();
        for (String brand : carBrandList) {
            if (brand.startsWith("m")) {
                filteredBrands.add(brand.toUpperCase());
            }
        }
        Collections.sort(filteredBrands);
        for (String brand : filteredBrands) {
            System.out.println(brand);
        }
    }
}
