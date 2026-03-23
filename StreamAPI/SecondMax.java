package StreamAPI;
import java.util.*;
public class SecondMax
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(12,45,67,23,89,34,78);
        int max = list.stream().reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
        int secondMax = list.stream().reduce(0,(a,b)->a>b&&a<max?a:b);
        System.out.println(secondMax);

        int min= list.stream().reduce(Integer.MAX_VALUE,(a,b)->Math.min(a,b));
        int secondMin = list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b&&a>min?a:b);
        System.out.println(secondMin);
    }
}
