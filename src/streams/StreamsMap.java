package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Integer[] numbers1 = {1234, 5678};
        Integer[] numbers2 = {1234, 5678};
        Integer[] numbers3 = {1234, 5678};
        Integer[] numbers4 = {1234, 5678};

        employees.add(new Employee(1, "John", 50000.0, Arrays.asList(numbers1)));
        employees.add(new Employee(2, "Smith", 25000.0, Arrays.asList(numbers2)));
        employees.add(new Employee(3, "Ramesh", 10000.0, Arrays.asList(numbers3)));
        employees.add(new Employee(4, "Harish", 15000.0, Arrays.asList(numbers4)));

        List<Integer> result = employees.stream()
                        .map((employee) -> employee.getEid())
                                .collect(Collectors.toList());
        System.out.println(result);
    }
}
