package SortedPractice;
import java.util.*;

class Employee{
    int id;
    String name;
    int salary;
    String dept;

    public Employee(int id, String name, int salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
public class SortClass
{
    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList();
        list.add(new Employee(1,"Rahul",20000,"IT"));
        list.add(new Employee(2,"Alok",30000,"IT"));
        list.add(new Employee(3,"Raj",80000,"CS"));
        list.add(new Employee(4,"Karan",50000,"Mechanical"));
        list.add(new Employee(5,"Sneha",60000,"CSE"));

        List<Employee> list2 = list.stream().sorted((a,b)->b.salary-a.salary).toList();
//        System.out.println(list2);
        list2.forEach(System.out::println);

    }
}
