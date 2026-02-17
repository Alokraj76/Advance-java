import java.util.Scanner;

class Sum
{
   public Sum(int a,int b)
   {
     System.out.println("sum is: "+(a+b));
   }
}
class Multiply
{
    // public Multiply(int a, int b)
    // {
    //     System.out.println("multiply is: "+(a*b));
    // }
    void multi(int a,int b)
    {
        System.out.println("multiply is: "+a*b);
    }
}
public class Calculator 
{
    String name = "As";
    public static void main(String[] args)
    {
        // System.out.println(name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b= sc.nextInt();
        // Sum b; //object declaration
        Sum s = new Sum(a,b); // object instantiation
        Multiply m = new Multiply();
        m.multi(a,b);

    }    
}
