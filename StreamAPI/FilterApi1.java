package StreamAPI;
import java.util.*;

public class FilterApi1
{
   public static void main(String[] args)
   {
       ArrayList<Integer> list = new ArrayList<Integer>();
//       list.add(23);
//       list.add(45);
       List<Integer> data = Arrays.asList(10,12,15,22,22,36,36,75,75);
       list.addAll(data);
//       System.out.println(list);
//       list.stream().filter((n)->n<50).forEach((n)-> System.out.print(n+" "));
//       List<Integer> li = list.stream().filter((n)->n>60 && n<100).toList();
//       System.out.println("count new: "+li.stream().count());
//       System.out.println("count: "+list.stream().count());
       list.stream().filter((n)->n%2==0).forEach((n)-> System.out.println(n)); //1
       ArrayList<String> li = new ArrayList<>();
       List<String> data1 = Arrays.asList("Amit","Ravi","Vikas","Ashok","Rahul");
       List<String> data2 = Arrays.asList("Java","Python","C","React","C#","Next.js","Node.js");
       List<String> data3 = Arrays.asList("Java",null,"Spring",null,"React");
       List<String> data4= Arrays.asList("Java","","Spring","","AI");
       li.addAll(data4);
//       li.stream().filter((n)->n.charAt(0)=='A').forEach((n)-> System.out.println(n+" ")); //2 string type

       list.stream().filter((n)->n>50).forEach(System.out::println); //3

//       li.stream().filter((n)->n.length()>4).forEach(System.out::println); //4 string type

//       List<String> li2 = li.stream().filter((n)->n!=null).toList(); //5 string type
//       System.out.println(li2);

       list.stream().filter((n)->n%2!=0).forEach(System.out::println); //6

       list.stream().filter((n)->n%5==0).forEach(System.out::println); //7

//      List<String> li3 =  li.stream().filter((n)->n!="").toList(); //8 string type
//       System.out.println(li3);

       list.stream().filter((n)->n>20 && n<50).forEach(System.out::println); //9

       li.stream().filter((n)->n.contains("a")).forEach(System.out::println); //10
       list.stream().distinct().filter((n)->n>20).forEach(System.out::println); //11











   }
}
