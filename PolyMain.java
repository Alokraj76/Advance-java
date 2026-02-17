class Animal
{
    static String name;
    static String sound;
    Animal()
    {
        this("cat",""); //caliing constructor
    }
    Animal(String name,String sound)
    {
        this.name = name;
        this.sound = sound;
    }
    static void getInfo()
    {
        System.out.println("Name= "+name);
        System.out.println("Sound= "+sound);
    }
    void getInfo(String name, String sound,int legs)
    {
        System.out.println("Name= "+name);
        System.out.println("Sound= "+sound);
        System.out.println("NO. of legs= "+legs);
    }
}
class Cat extends Animal
{
    Cat(String name, String sound)
    {
        super(name,sound);
    }
    static void getInfo()
    {
        System.out.println("Cat Name="+name);
        System.out.println("Cat Sound="+sound);
    }
     void getInfo(String name, String sound) //overloading in sub class
    {
        System.out.println("Name= "+name);
        System.out.println("Sound= "+sound);
    }
}
public class PolyMain
{
    public static void main(String[] args) 
    {
        // Animal an = new Animal();
        // an.getInfo();  
        // an.getInfo("Cat","Meow",4);  
        Cat c1 = new Cat("Cat2","Meow");
        c1.getInfo();
        Animal a1 = new Cat("Cat2","Meow");
        a1.getInfo();
    }
}