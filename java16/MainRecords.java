package java16;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

record Student(int sid,String name, String course)
{

};
public class MainRecords
{
    public static void main(String[] args)
    {
//        Student s = new Student(1,"Student 1","MCA");
//        System.out.println(s.sid());
//        System.out.println(s.name());
//        System.out.println(s.course());
//        System.out.println(s);
        int data[] = {23,20,45,56};
//        List<int[]> list = Arrays.asList(data);
//        System.out.println(list.get(0)[1]); // 0 ka second value
//        System.out.println(list.get(0)[2]); // 0 ka third value
        List<Integer> list1 = Arrays.stream(data).boxed().toList(); // use of stream, boxed, toList.
        System.out.println(list1);
        list1.forEach((value)-> System.out.println(value)); // use of foreach


    }
}
