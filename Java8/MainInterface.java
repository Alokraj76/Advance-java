package Java8;
interface Calc
{
    void calculate(int n1,int n2);

    default void calculate(int n1,int n2, int n3) //default method int interface it can be overriding and overloading
    {
       int s = n1 +n2 +n3;
//        System.out.println("Sum= "+s);
       getPrivateInfo("Sum = "+s); // pass to private method in interface
    }

    static String getInfo()
    {
        return "This is getInfo method inside Calc Interface";
    }
    private void getPrivateInfo(String msg) // it cannot be override
    {
        System.out.println(msg);
    }
}

class Calculator implements Calc
{
    @Override
    public void calculate(int n1, int n2)
    {
        int s = n1+n2;
        System.out.println("Sum= "+s);
    }

    @Override
    public void calculate(int n1,int n2 ,int n3) // override method from interface
    {
        int s = n1+n2+n3;
        System.out.println("Sum of two numbers "+s);
    }
}

public class MainInterface
{
    public static void main(String[] args) 
    {
        Calculator cal = new Calculator();
        cal.calculate(14,25);
        cal.calculate(15,12,13);
        System.out.println(Calc.getInfo());
    }
}