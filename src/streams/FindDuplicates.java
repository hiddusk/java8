package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        String[] arr = {"ramu", "ramu", "john", "smith"};
        List<String> names = Arrays.asList(arr);
        Set<String> uniqueNames = new HashSet<>();
        List<String> duplicateNames = names.stream()
                .filter(name -> !uniqueNames.add(name))
                .collect(Collectors.toList());
        System.out.println(uniqueNames);
        System.out.println(duplicateNames);
    }
}
