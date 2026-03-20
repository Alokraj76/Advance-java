package StreamAPI;

import java.util.ArrayList;
import java.util.*;

public class Employee
{
    String name;
    int id;
    Employee(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args)
    {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Alok",101));
        emp.add(new Employee("Raj",201));
        List<String> res = emp.stream().map(n->n.name).toList();
        System.out.println(res);
    }
}
