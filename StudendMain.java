class Student
{
    private String name;
    private String course;
    private int sid;
    public Student(String name, String course, int sid) 
    {   super();
        this.name = name;
        this.course = course;
        this.sid = sid;
    }
    
    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }
    public int getSid() {
        return sid;
    }
    
}
public class StudendMain 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Student1","MCA",1);
        s1.setSid(2);
        System.out.println("sid= "+s1.getSid());
        System.out.println("Name= "+s1.getName());
        System.out.println("Course= "+s1.getCourse());
    }
}
