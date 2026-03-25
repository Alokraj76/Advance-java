package StreamMinMax;
import java.util.*;
public class Distinct
{
    static void main() {
        List<Integer> list = Arrays.asList(10,20,15,30,20,40);
        List<Integer> res = list.stream().distinct().toList();
        System.out.println(res);

        List<Integer> res1 = list.stream().limit(4).toList();
        System.out.println(res1);

        List<Integer> res2= list.stream().skip(3).toList();
        System.out.println(res2);

        Integer res3 = list.stream().sorted((a,b)->b-a).toList().get(1);
        System.out.println(res3);

        Integer res4 = list.stream().sorted((a,b)->a-b).toList().get(1);
        System.out.println(res4);

    }
}
