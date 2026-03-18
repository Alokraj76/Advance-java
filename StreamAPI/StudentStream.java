package StreamAPI;

import java.util.*;
import java.util.stream.Stream;
class Student
{
    String name;
    int marks;
    Student(String name,int marks)
    {
        this.name = name;
        this.marks = marks;
    }
    public void display()
    {
        System.out.println(name+" "+marks);
    }
    public String toString()
    {
        return String.format("name:%s,marks:%d",name,marks);
    }
}
public class StudentStream
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alok",50));
        students.add(new Student("Raj",70));
        students.add(new Student("AR",80));
        students.add(new Student("RA",75));
//        System.out.println(students);
        students.stream().filter((n)->n.marks>60).forEach(s->s.display());
        List<Student> st = students.stream().filter((n)->n.marks>60).toList();
        System.out.println(st);

    }
}
