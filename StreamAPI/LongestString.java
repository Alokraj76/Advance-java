package StreamAPI;
import java.util.*;
public class LongestString
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Java","Programming","Stream","API","Functional");
        String longer = list.stream().reduce("",(a,b)->a.length() > b.length() ? a : b);
        System.out.println(longer);

        List<Integer> list1 = Arrays.asList(12,34,56,78);
        int total = list1.stream().map(n->{
            int sum =0;
            while(n>0)
            {
                sum += n%10;
                n /=10;
            }
            return sum;
        }).reduce(0,(a,b)->a+b);
        System.out.println(total);
        int total1 = list1.stream().reduce(0,(a,b)->a+(b%10)+(b-(b%10))/10);
        System.out.println(total1);
    }
}
