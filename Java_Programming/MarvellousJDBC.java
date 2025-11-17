import java.sql.*;

public class MarvellousJDBC
{
    public static void main(String[] args)
    {
        try
        {
            // Step 1 : Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 : Connect the driver with database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA53","root","");

            // Step 3 : Create Statement class object
            Statement stmt = con.createStatement();

            // Step 4 : Execute the query
            ResultSet rs = stmt.executeQuery("SELECT * from student");

            // Step 5 : Display the result
            while(rs.next())
            {
                System.out.println("Roll no : " + rs.getInt("Rno"));
                System.out.println("Name : " + rs.getString("Name"));
                System.out.println("City : " + rs.getString("City"));
                System.out.println("Marks : " + rs.getInt("Marks"));
                System.out.println("---------------------------------------");
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }

    }
}
