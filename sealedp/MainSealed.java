package sealedp;

sealed class Shape permits Circle,Rectangle //sealed class allow multiple inheritance
{

}
final class Circle extends Shape
{

}
non-sealed class Rectangle extends Shape
{

}
public class MainSealed
{

}
