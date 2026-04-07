package javaJdbc;
import java.sql.*;
import java.sql.DriverManager;

public class EmpMain
{
    public static void main(String[] args)
    {
        String driver_name= "com.mysql.cj.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/employeedb";
        String username = "root";
        String password = "alok0987";
        String create_table = """
                        Create table if not exists employee(id int primary key auto_increment, name varchar(50) not null, dept varchar(50),salary decimal(10,2))
""";
        try
        {
            Class.forName(driver_name);
            System.out.println("Driver is ready");

            Connection con =  DriverManager.getConnection(host,username,password);
            System.out.println("Host is ready");
            Statement smt = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);


            smt.execute(create_table);
            System.out.println("Table is ready");
            ResultSet rs = smt.executeQuery("Select *from employee");
            System.out.println("ID\tName\tDepartment\tSalary");
//            while(rs.next())
//            {
//                rs.moveToInsertRow();
//                rs.updateString("name","Emp6");
//                rs.updateString("dept","MCA");
//                rs.updateDouble("Salary",800000);
//                rs.insertRow();
//            }
            while(rs.next())
            {
                long salary = rs.getLong("Salary");
//                if(salary<=40000)
//                {
//                    rs.updateDouble("Salary",salary*1.1);
//                    rs.updateRow();
//                }

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("dept");
                salary = rs.getLong("salary");
                    System.out.println(String.format(" %d\t%s\t%s\t\t%d", id, name, dept, salary));

            }
//            int record = smt.executeUpdate("""
//insert into employee (name,dept,salary) values('Emp5','Sales',30000)""");
//           int rowAffected= smt.executeUpdate("""
//insert into employee (name,dept,salary) values('Emp1','Account',40000)""");
//           if(rowAffected>0)
//           {
//               System.out.println("Record inserted");
//           }
//           else
//           System.out.println("Record is not inserted");
            rs.close();
            smt.close();
            con.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
}
