package mref;

class Calculator
{
    Calculator()
    {
        System.out.println("This is constructor!");
    }
    Calculator(int n1,int n2)
    {
        System.out.println("Division= "+(n1/n2));
    }
    int sub(int n1,int n2)
    {
        return n1-n2;
    }
    static int mul(int n1,int n2)
    {
        return n1*n2;
    }
}
@FunctionalInterface
interface MyCalc
{
//    int cal(int n1,int n2);// function return type and function parameter must be same to pass the reference (It is Compulsory).
    void cal(int n1,int n2);
}
public class MethodRefMain
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
//        System.out.println("Subtraction= "+cal.sub(14,6));
//        MyCalc c1 = cal::sub; // method referencing
//        System.out.println("sub ="+c1.cal(100,12));
//        MyCalc c2 = Calculator::mul; // method referencing
//        int m1 = c2.cal(100,25);
//        System.out.println("Multiply= "+m1);

        MyCalc c3 = Calculator::new; // referencing the constructor. construction parameter must be same
        c3.cal(100,2);

    }
}
