import java.util.*;

class Student1
{
    private int id;
    private String name;
    private String course;

    Student1(int id,String name, String course)
    {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }
}
public class ArrayL 
{
    public static void main(String[] args) 
    {
        ArrayList<Student1> li = new ArrayList<>();
        li.add(new Student1(1,"alok","mca"));
        li.add(new Student1(2,"raj","mca"));
        li.add(new Student1(3,"harsh","btech"));
        li.add(new Student1(4,"akhil","btech"));
        li.add(new Student1(5,"abhi","bpharm"));
        System.out.println("Student ID\tName\tCourse");
        for(Student1 s: li)
        {
            String res = String.format("\t%d\t%s\t%s", s.getId(),s.getName(),s.getCourse());
            System.out.println(res);
        }
        // for(Student1 s: li)
        // {
        //     System.out.println("id:="+s.getId()+" \n"+"name:="+s.getName()+" \n"+"course:=" +s.getCourse()+"\n");
        // }
    }
}
