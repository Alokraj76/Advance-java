package StreamAPI;

import java.util.*;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class FilterAPI
{
    public static void main(String[] args)
    {
        //Integer type
        ArrayList<Integer> li = new ArrayList<>();
        li.add(23);
        li.add(42);
        li.addAll(List.of(23,56,78,23,45,67));
        System.out.println(li);
        Stream listStream = li.stream(); // single use object/ this way need to create multiple object per operation.
//        listStream.forEach(System.out::println); // this way need to create object everytime.
        listStream.forEach((item)->System.out.print(item+" ")); //li.stream().forEach(); // make new object.

        System.out.println("count= "+li.stream().filter((item)->item>60).count()); // filter and count used

        li.stream().filter(n->n>60).forEach((item)-> System.out.println(item+" ")); //filter in the list to print only basis of filter

        //String type
        ArrayList<String> li1 = new ArrayList<>();
        li1.add("alok");
        li1.addAll(List.of("raj","AR","harsh"));
        li1.stream().forEach((item)->System.out.print(item+" "));
        System.out.println();
        li1.stream().forEach(System.out::println); // always create new object // terminal operation.
        System.out.println("count= "+li1.stream().count()); // count used only
    }

}
