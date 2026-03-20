package StreamAPI;
import java.util.*;
public class Map2
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> res = list.stream().map(n->n*n).toList();
        System.out.println(res);

        List<String> list1 = Arrays.asList("Java","Python","C");
        List<Character> res1= list1.stream().map(n->n.charAt(0)).toList();
        System.out.println(res1);

        List<String> list2 = Arrays.asList("A","B","C");
        List<String> res2= list2.stream().map(n->("item-"+n)).toList();
        System.out.println(res2);


    }
}
