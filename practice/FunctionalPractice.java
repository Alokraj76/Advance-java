package practice;

@FunctionalInterface
interface Calc
{
    void calculate(int n1,int n2);
}
class Addition
{
    Addition()
    {
        System.out.println("Addition");
    }
    Addition(int num,int num1)
    {
        System.out.println("Addition is "+(num+num1));
    }
    public void add(int num1,int num2)
    {
        System.out.println("Add is"+(num1+num2));
    }
    static void displayAdd(int num1,int num2)
    {
        System.out.println("display addition static");
    }
    int addReturn(int num1,int num2)
    {
        return num1+num2;
    }
}
public class FunctionalPractice
{
    public static void main(String[] args)
    {
//        Calc c1 = ()->{
//            int a =11;
//            int b = 10;
//            System.out.println(a+b);
//        };
//        Calc c2 = ()->System.out.println(45-10);
//        c1.calculate();
//        c2.calculate();
        Addition ad = new Addition();
        Calc c1 = ad::add;
        c1.calculate(10,20);
        Calc c2 = Addition::displayAdd;
        c2.calculate(10,20);
        Calc c3 = Addition::new;
        c3.calculate(10,50);
//        Calc c3 = ad::addReturn; // return type
//        System.out.println(c3.calculate(10,20)); //return type printing
        // constructor referencing work only with void type and constructor type functional interface.
    }
}
