package optional;

import streams.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        OptionalExample1 optionalExample = new OptionalExample1();
        List<Employee> defaultEmployees =new ArrayList<>();
        List<Employee> employees = optionalExample.getEmployees().orElse(defaultEmployees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public Optional<List<Employee>> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Integer[] numbers1 = {1234, 5678};
        Integer[] numbers2 = {1234, 5678};
        Integer[] numbers3 = {1234, 5678};
        Integer[] numbers4 = {1234, 5678};

        employees.add(new Employee(1, "John", 50000.0, Arrays.asList(numbers1)));
        employees.add(new Employee(2, "Smith", 25000.0, Arrays.asList(numbers2)));
        employees.add(new Employee(3, "Ramesh", 10000.0, Arrays.asList(numbers3)));
        employees.add(new Employee(4, "Harish", 15000.0, Arrays.asList(numbers4)));
        employees =  null;
        return Optional.ofNullable(employees);
    }
}
