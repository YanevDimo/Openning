package cafe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Cafe {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();

    }

    public void addEmployee(Employee employee) {
        if (capacity > employees.size()) {
            employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        return employees.removeIf(e -> e.getName().equals(name));
//        for (Employee employee1 : employees) {
//            if (employee1.getName().equals(name)) {
//                this.employees.remove(employee1);
//                return true;
//            }
//        }
//        return false;
    }


    public Employee getOldestEmployee() {
        return employees.stream().max(Comparator.comparing(Employee::getAge)).orElse(null);
    }

    public Employee getEmployee(String name) {
        return employees.stream().filter(employee -> employee.getName().equals(name)).findFirst().orElse(null);
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder(String.format("Employees working at Cafe %s%n:",name));
        employees.forEach(employee -> stringBuilder.append(employee).append(System.lineSeparator()));
        return stringBuilder.toString().trim();
    }
}
