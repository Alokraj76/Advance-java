package practice;

import java.util.*;

public class Foreach
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,20,30);
        list.forEach(n-> System.out.println(n));
        int[] arr = {10,20,30,40};
        List<Integer> list1 = Arrays.stream(arr).boxed().toList();
        list1.forEach(n-> System.out.println(n));
    }
}
