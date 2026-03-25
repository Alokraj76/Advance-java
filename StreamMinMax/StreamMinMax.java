package StreamMinMax;
import java.util.*;
public class StreamMinMax
{
    static void main()
    {
        List<Integer> list = Arrays.asList(12, 1, 4, 100, 200, 150, 45, 67, 99);
//        List<Integer> sorted = list.stream().sorted((a,b)->0).toList();
//        System.out.println(sorted);
        Optional<Integer> result = list.stream().max((a, b) -> a-b);
        result.ifPresent(System.out::println);
    }
}
