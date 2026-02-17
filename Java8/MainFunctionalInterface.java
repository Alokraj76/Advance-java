package Java8;

@FunctionalInterface
interface Add
{
    void calculate();

}
public class MainFunctionalInterface
{
    public static void main(String[] args)
    {
        Add a1 = ()->{
            int a=12;
            int b=13;
            System.out.println("Sum is: "+(a+b));
        };
        a1.calculate();
//        System.out.println("Sum= "+a1.calculate());
    }
}
