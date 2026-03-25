package StreamMinMax;
import java.util.*;
public class FindMax
{
    static void main()
    {
        List<Integer> list = Arrays.asList(10,20,5,40,15);
        Optional<Integer> result = list.stream().min((a,b)->a-b);
        result.ifPresent(System.out::println);

        Optional<Integer> res1 = list.stream().max((a,b)->a-b);
        res1.ifPresent(System.out::println);
    }
}
