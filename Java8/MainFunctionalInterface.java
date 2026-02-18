package Java8;

@FunctionalInterface
interface Add
{
//    void calculate();
//    int square(int n1);
//    String square(int n1);
    void vote(int age);
}
class VoterList
{
    void voterListName(int age)
    {
        if(age>=18)
            System.out.println("You can vote!");
        else
            System.out.println("You can not vote");
    }
}
public class MainFunctionalInterface
{
    public static void main(String[] args)
    {
        //integer return type
//        Add a1 = n1 -> n1*n1;
//        int result = a1.square(12);
//        System.out.println(result);

        //string return type
//        Add a1 = num -> "Square of number is = "+(num*num);
//        String result = a1.square(12);
//        System.out.println(result);

        //no parameter and no return type Calculation method

//        Add a1 = ()->{
//            int a=12;
//            int b=13;
//            System.out.println("Sum is: "+(a+b));
//        };
//        a1.calculate();
//        System.out.println("Sum= "+a1.calculate());
//        Add a2= (int n1,int n2)->System.out.println("Sum="+(n1+n2));
//            a1.calculate(12,43);

        // vote check method

        Add a1 = age->{
            if(age>18)
                System.out.println("You can vote");
            else
                System.out.println("You can not vote");
        };
        a1.vote(18);
        VoterList v1 = new VoterList();
        Add a2 = v1::voterListName;  //method referencing
        a2.vote(19);
    }
}
