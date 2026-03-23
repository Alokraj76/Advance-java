package StreamAPI;

import java.util.*;

public class SumReduce
{
    static void main() {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum is= "+sum);

        List<Integer> list1 = Arrays.asList(2,3,4,5);
        int mul = list1.stream().reduce(1,(a,b)->a*b);
        System.out.println("Multiply is= "+mul);



    }
}
