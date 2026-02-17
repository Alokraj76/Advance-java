// class Display
// {
//     void displayInfo()
//     {
//         System.out.println("Hello, World!");
//     }
// }

import java.util.ArrayList;

public class Hello
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(-1);
        int sum = 0;
        for(Integer n:list)
        {
            if(n>0)
            {
                sum +=n;
            }
        }
        System.out.println("Sum is: "+sum);
            
    }
}
