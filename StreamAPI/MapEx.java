package StreamAPI;
import java.util.*;
public class MapEx
{
    public static void main(String[] args)
    {
//        List<Integer> number = Arrays.asList(23,32,45,35,67,89,95);
//        System.out.println(number);
//        List<Integer>  result = number.stream().filter(n->n<40).map(n->n+8).toList();
//        System.out.println(result);

        List<String> list = Arrays.asList("Sachin","rahul","amit");
        List<String> res = list.stream().map(n->n.toUpperCase()).toList();
        System.out.println(res); //1
    }
}
