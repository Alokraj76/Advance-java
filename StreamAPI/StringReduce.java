package StreamAPI;
import java.util.*;
public class StringReduce
{
    static void main() {
        List<String> list = Arrays.asList("java","Stream","API","Reduce");
        String finalist = list.stream().reduce("",(a,b)->a+" "+b);
        System.out.println(finalist);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        list1.stream().map(n->n*n).forEach(n-> System.out.println(n+" "));
    }


}
