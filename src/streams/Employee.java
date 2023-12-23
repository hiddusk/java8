package streams;

import java.util.List;

public class Employee {
    private int eid;
    private String name;
    private Double salary;
    private List<Integer> numbers;

    public Employee(int eid,String name, Double salary, List<Integer> numbers) {
        this.eid=eid;
        this.name=name;
        this.salary=salary;
        this.numbers=numbers;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
