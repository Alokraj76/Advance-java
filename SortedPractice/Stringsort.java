package SortedPractice;

import java.util.*;
public class Stringsort
{
    static void main() {
        List<String> list = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
        List<String> list1 = list.stream().sorted().toList();
        System.out.println(list1);

        List<String> rev = list.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(rev);

        List<String> list2 = Arrays.asList("Java","SpringBoot","API","Microservices","SQL");
        List<String> sort = list2.stream().sorted((a,b)->b.length()-a.length()).toList();
        System.out.println(sort);
    }
}
