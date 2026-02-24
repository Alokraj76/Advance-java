package switchp;

public class MainYield
{
    public static void main(String[] args)
    {
        int day=3;
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("no day");
        }
        String result = switch(day) {
            case 1,3 ->{
                System.out.println("This is 1,3");
                yield "Monday"; // return statement for switch
            }
            case 2 -> "Tuesday";
            default -> "no-day";
        };
        System.out.println(result);
    }
}
