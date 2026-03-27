package StreamMinMax;
import java.util.*;
public class Remove
{
    static void main()
    {
        List<String> list = Arrays.asList("Ram","Shyam","Ram","Amit","Shyam","Ravi");
        List<String> res = list.stream().distinct().toList();
        System.out.println(res);

        List<String> res1 = list.stream().limit(5).toList();
        System.out.println(res1);
    }
}
