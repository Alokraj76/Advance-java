package MixQuestion;
import java.util.*;
class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}


public class Emp
{
    static void main() {
        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee(101, "Amit", 50000, 25, "IT"),
                new Employee(102, "Neha", 60000, 28, "HR"),
                new Employee(103, "Ravi", 45000, 24, "IT"),
                new Employee(104, "Karan", 70000, 30, "Finance"),
                new Employee(105, "Pooja", 55000, 27, "HR"),
                new Employee(106, "Rohit", 80000, 32, "IT"),
                new Employee(107, "Simran", 65000, 29, "Finance"),
                new Employee(108, "Amit", 50000, 25, "IT")
        ));
//        Optional<Employee> lis = empList.stream().min((a,b)->(int)((a.getSalary() -b.getSalary())));
        Optional<Employee> lis = empList.stream().min((a,b)->Double.compare(a.salary,b.salary));
        lis.ifPresent(System.out::println);

        Optional<Employee> lis1 = empList.stream().max((a,b)->(int)((a.getSalary() -b.getSalary())));
        lis1.ifPresent(System.out::println);

        Optional<Employee> lis2 = empList.stream().min((a,b)->a.getAge()-b.getAge());
        lis2.ifPresent(System.out::println);

        Optional<Employee> lis3 = empList.stream().max((a,b)->a.getAge()-b.getAge());
        lis3.ifPresent(System.out::println);

    }
}
