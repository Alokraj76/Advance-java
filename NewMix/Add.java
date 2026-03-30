package NewMix;

import java.util.*;
import java.util.stream.Stream;

public class Add
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(15,22,8,40,12,35,50,5);
        int sum = list.stream().sorted((a,b)->b-a).limit(3).reduce(0,(a,b)->a+b);
//        System.out.println(sum);

        List<Integer>lis2 = Arrays.asList(25,10,5,30,15,20);
//        lis2.stream().sorted().skip(1).limit(1).forEach(System.out::println);

        List<Integer>lis3 = Arrays.asList(2,4,6,11,14,18,21,9);
        int ans = lis3.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
        System.out.println(ans);
    }
}
