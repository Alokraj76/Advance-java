package StreamAPI;
import java.util.*;
public class CountReduce
{
    static void main()
    {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70);
        int count = list.stream().reduce(0,(a,b)->a+1);
        System.out.println(count);

        List<Integer> list1 = Arrays.asList(11,22,33,44,55,66,77,88);
        int even = list1.stream().reduce(0,(a,b)->(b%2==0)?a+b:a);
        System.out.println(even);

    }
}
