package java10;

public class MainVar
{
    //var c= 13; // var variable not supported in instance variable
    // var also not allowed in method parameter

    static void main()
    {
        int a = 10;
        var b = 20;
//        var name = "kiet-mca";
        var value = 10.34;
        System.out.println(b+" "+a+" "+value);
        int[] arr = {1,2,3};
        String[] arr1 = {"al","ok"};
        String name = new String("This is String");
        var name1 = new String("This is string with var");

        for(var d: arr1) // var allow in foreach
        {
            System.out.println(d);
        }
    }
}
