package SortedPractice;
import java.util.*;
public class SecHighest
{
    static void main() {
        List<Integer>list = Arrays.asList(55,12,88,34,99,21);
        Integer sec = list.stream().sorted((a,b)->b-a).toList().get(1);
        System.out.println(sec);

        List<Integer> list1 = Arrays.asList(8,26,13,41,19,32,5);
        List<Integer> greater = list1.stream().filter(n->n>20).sorted().toList();
        System.out.println(greater);


    }
}
