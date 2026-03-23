package StreamAPI;
import java.util.*;
public class ReduceEx
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,12,45,76,34,56,54,32);
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum= "+sum);
        double avg = sum/list.size();
        System.out.println("Avg= "+avg);
    }
}
