package StreamMinMax;
import java.util.*;
public class ThreeHigh
{
    static void main() {

        List<Integer> list = Arrays.asList(5,10,15,20,25,30,35,40,45);
        List<Integer> res = list.stream().sorted().limit(3).toList();
        System.out.println(res);

        Optional<Integer> lis = list.stream().distinct().max((a,b)->a-b);
        lis.ifPresent(System.out::println);

        List<Integer> lis1 = list.stream().skip(5).limit(3).toList();
        System.out.println(lis1);

        List<String> list2 = Arrays.asList("Ram","Shyam","Amit","Zoya","Ravi");
        Optional<String> lis2 = list2.stream().min((a,b)->a.compareTo(b));
        lis2.ifPresent(System.out::println);

        Optional<String> lis3 = list2.stream().max((a,b)->a.compareTo(b));
        lis3.ifPresent(System.out::println);




        

    }
}
