package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class FilterAPI
{
    public static void main(String[] args)
    {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(23);
        li.add(42);
        li.addAll(List.of(23,56,78,23,45,67));
        System.out.println(li);
        Stream listStream = li.stream(); // single use object/ this way need to create multiple object per operation.
//        listStream.forEach(System.out::println); // this way need to create object everytime.
        listStream.forEach((item)->System.out.println(item)); //li.stream().forEach(); // make new object.

        ArrayList<String> li1 = new ArrayList<>();
        li1.add("alok");
        li1.addAll(List.of("raj","AR","harsh"));
        li1.stream().forEach((item)->System.out.print(item+" "));
        System.out.println();
        li1.stream().forEach(System.out::println); // always create new object
    }

}
