package Streamsort;
import java.util.*;
public class SortedEx
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(23,12,1,45,23,76,26,91);
        System.out.println(list);
        List<Integer> sortedList = list.stream().sorted((a,b)->b-a).toList(); // sorted(Comparator.reverseOrder()).
        System.out.println(sortedList);

    }
}
