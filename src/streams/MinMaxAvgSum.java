package streams;

import java.util.*;
import java.util.stream.Collectors;

public class MinMaxAvgSum {
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

        Optional<Integer> minResult = employees.stream()
                .map(employee -> employee.getEid())
                .min((Integer a, Integer b) -> a - b);
        System.out.println(minResult.get());

        Optional<Employee> maxResult = employees.stream()
                .max((Employee e1, Employee e2) -> e1.getEid() - e2.getEid());
        System.out.println(maxResult.get().getEid());

        int sum = employees.stream()
                .mapToInt(employee -> employee.getEid())
                .sum();
        System.out.println(sum);

        OptionalDouble average = employees.stream().mapToInt(employee -> employee.getEid())
                .average();
        System.out.println(average.getAsDouble());

    }


}
