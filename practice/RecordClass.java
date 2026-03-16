package practice;


record Student(int id, String name,int age)
{
    void display()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class RecordClass
{
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"alok",23);
        System.out.println(s1.id());
        System.out.println(s1);
        s1.display();
    }
}
