package SortedPractice;
import java.util.*;
public class Highest
{
    static void main() {
        List<Integer> list = Arrays.asList(18,42,7,91,33,25,60);
        List<Integer> high = list.stream().sorted().skip(list.size()-3).toList();
        System.out.println(high);

        List<Integer> even = Arrays.asList(14,9,20,7,6,11,32,3);
        List<Integer> list1 = even.stream().sorted().filter(n->n%2==0).toList();
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(10,5,10,7,5,3,8,3);
        List<Integer> dup = list2.stream().distinct().sorted().toList();
        System.out.println(dup);

    }
}
