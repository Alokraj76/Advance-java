package java15;

public class MainTextBlock
{
    static void main()
    {
        String data="package java10;\n" +
                "\n" +
                "public class MainVar\n" +
                "{\n" +
                "    //var c= 13; // var variable not supported in instance variable\n" +
                "    // var also not allowed in method parameter\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        int a = 10;\n" +
                "        var b = 20;\n" +
                "//        var name = \"kiet-mca\";\n" +
                "        var value = 10.34;\n" +
                "        System.out.println(b+\" \"+a+\" \"+value);\n" +
                "        int[] arr = {1,2,3};\n" +
                "        String[] arr1 = {\"al\",\"ok\"};\n" +
                "        String name = new String(\"This is String\");\n" +
                "        var name1 = new String(\"This is string with var\");\n" +
                "\n" +
                "        for(var d: arr1) // var allow in foreach\n" +
                "        {\n" +
                "            System.out.println(d);\n" +
                "        }\n" +
                "    }\n" +
                "}\n";
        String data1 = """
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
                """;
        System.out.print(data);
        System.out.println(data1);

    }
}
