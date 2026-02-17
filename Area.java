interface Area1
{
    double PT = 3.14;
    double getArea();
    //default, static, private function
}
class Circle implements Area1
{
    double r;
    Circle(double r)
    {
        this.r = r;
    }
    public double getArea()
    {
        return PT*r*r;
    }
    public void display()
    {
        System.out.println(this.getArea());
    }
}
public class Area
{
    static void main()
    {
        Circle c = new Circle(14.5);
        c.display();
        System.out.println("Area of circle is:"+c.getArea());
        Area1 a=new Area1()
        {
           public double getArea()
            {
                int l=10,b=40;
                System.out.print("rectangel is: ");
                return l*b;
            }
        };System.out.println(a.getArea());
    }
}
