package bakery;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();

    }

    public void add(Employee employee) {
        if (capacity > employees.size()){
            employees.add(employee);
        }
    }
    public boolean remove(String name){
        for (Employee employee : employees) {
            if (employee.getName().equals(name)){
                employees.remove(name);
                return true;
            }
        }
        return false;
    }
    public int getCount(){
        return employees.size();
    }

    public Employee getOldestEmployee() {
        Employee oldest = null;
        for (Employee employee : employees) {
            if (oldest == null || employee.getAge() > oldest.getAge()) {
                oldest = employee;
            }
        }
        return oldest;
    }

    public Employee getEmployee(String name) {
        Employee currentEmployee = null;
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                currentEmployee = employee;
            }
        }
        return currentEmployee;
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Employees working at Bakery %s%n:",this.name));
        for (Employee employee : employees) {
            stringBuilder.append(employee).append(System.lineSeparator());
        }
       return stringBuilder.toString().trim();
    }
}
