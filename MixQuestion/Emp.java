package MixQuestion;
import java.util.*;
import java.util.stream.Collectors;

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
//        Optional<Employee> lis = empList.stream().min((a,b)->Double.compare(a.salary,b.salary));
//        lis.ifPresent(System.out::println);
//
//        Employee result = empList.stream().min(Comparator.comparing(Employee::getSalary)).get();
//        System.out.println(result);
//
//        Optional<Employee> lis1 = empList.stream().max((a,b)->(int)((a.getSalary() -b.getSalary())));
//        lis1.ifPresent(System.out::println);
//
//        Optional<Employee> lis2 = empList.stream().min((a,b)->a.getAge()-b.getAge());
//        lis2.ifPresent(System.out::println);
//
//        Optional<Employee> lis3 = empList.stream().max((a,b)->a.getAge()-b.getAge());
//        lis3.ifPresent(System.out::println);

//        List<Employee> lis1 = empList.stream().sorted((a,b)->(Double) a.getSalary()-(Double)b.getSalary()).skip(1);
//        Employee ndhigh = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
//        System.out.println(ndhigh);
//
//        Employee ndlow = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
//        System.out.println(ndlow);

//        List<Employee> threeHigh = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
//        System.out.println(threeHigh);
//
//        List<Employee> threeLow = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3).toList();
//        System.out.println(threeLow);

//        empList.stream().collect(Collectors.toMap(Employee::getSalary,e->e,(e1,e2)->e1)).values().forEach(System.out::println);
//        empList.stream().collect(Collectors.toMap(Employee::getName,e->e,(e1,e2)->e1)).values().forEach(System.out::println);

//        Employee minimum = empList.stream().filter(n->n.getDepartment().equals("IT")).min(Comparator.comparing(Employee::getSalary)).get();
//        System.out.println(minimum);
//
//        Employee maximum = empList.stream().filter(n->n.getDepartment().equals("HR")).max(Comparator.comparing(Employee::getSalary)).get();
//        System.out.println(maximum);

//        Employee age = empList.stream().filter(n->n.getAge()>25).min(Comparator.comparing(Employee::getSalary)).get();
//        System.out.println(age);
//
//        Employee age2 = empList.stream().filter(n->n.getAge()<30).max(Comparator.comparing(Employee::getSalary)).get();
//        System.out.println(age2);

//        empList.stream().limit(5).forEach(System.out::println);

//        empList.stream().skip(3).forEach(System.out::println);

//        empList.stream().sorted(Comparator.comparing(Employee::getAge)).limit(2).forEach(System.out::println);
//      empList.stream().sorted(Comparator.comparing(Employee::getAge)).skip(2).limit(2).forEach(System.out::println);

//        empList.stream().filter(n->n.getDepartment().equals("IT")).sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);

        empList.stream().collect(Collectors.toMap(Employee::getName,e->e,(e1,e2)->e1)).values().stream().limit(5).forEach(System.out::println);
    }
}
