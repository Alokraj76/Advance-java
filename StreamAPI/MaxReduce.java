package StreamAPI;
import java.util.*;
public class MaxReduce
{
    static void main() {
        List<Integer> list = Arrays.asList(12,45,7,89,23,46);
        int max = list.stream().reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
        System.out.println(max);

        List<Integer> list1 = Arrays.asList(34,12,98,5,76,2);
        int min = list1.stream().reduce(Integer.MAX_VALUE,(a,b)->Math.min(a,b));
        System.out.println(min);
    }
}
