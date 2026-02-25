package sealedp;

sealed class Shape permits Circle,Rectangle //sealed class allow multiple inheritance
{
    public void print()
    {
        System.out.println("Shape permits");
    }
}
final class Circle extends Shape
{
    public void print()
    {
        System.out.println("Circle");
    }
}
non-sealed class Rectangle extends Shape
{
    public void disply()
    {
        System.out.println("Rectangle");
    }
}
public class MainSealed
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.print();
        r.print();
    }
}
