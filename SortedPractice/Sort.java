package SortedPractice;
import java.util.*;
public class Sort
{
    static void main() {
        List<Integer> list = Arrays.asList(12,5,33,9,21,1);
        List<Integer> sort = list.stream().sorted((a,b)->a-b).toList();
        System.out.println(sort);

        List<Integer> list1 = Arrays.asList(45,11,78,2,90,34);
        List<Integer> sort1 = list1.stream().sorted((a,b)->b-a).toList();
        System.out.println(sort1);
    }
}
