import java.sql.*;  //Has all the drivers and interfaces required for the JDBC

public class Main{
    public static void main(String[] args) throws ClassNotFoundException{

        // Defining some global variables
        String url="jdbc:mysql://localhost:3306/jdbc_learning";
        String username="root";
        String password="pritu47";



        // Loading all the drivers, because they help making connection to the database
        try {
            Class.forName("com.mysql.jdbc.Driver"); //com.mysql package me se jdbc ke sare driver load karna hai
            System.out.println("Successfully Loaded All the Drivers");
        }
        catch (ClassNotFoundException e){
            System.out.println("Error loading drivers : "+e.getMessage());
        }


        // Try Connecting to the database

        Connection con; // Just for the sake of keeping cone not local to the try block but global

        try{
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully Connected to the database");

            // Defining some statements and Running some queries and printing the results

            Statement st1 = con.createStatement(); // Statement is an interface, we created the instance of Statement intterface which will help us later to execute some queries
            ResultSet rs = st1.executeQuery("Select * from employees;"); // Query run hone ke bad ka resultset rs me jaega

            while(rs.next()){ // Just like for n in Tuple of python

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job = rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println("\n========================================");
                System.out.println("ID : "+id+"\nName : "+name+"\nJob : "+job+"\nSalary : "+salary);
            }


            // Now see how can we insert Data into the database

            // System.out.println(st1.executeUpdate("INSERT INTO employees(id, name, job_title, salary) VALUES (3, 'Vansh', 'Data Scientist', 75000.0)"));

            /**
             * Remember that while fetching, we use <statement>.executeQuery() which returns a value of type ResultSet
             * But while inserting, we use <statement>.executeUpdate() which returns an int denoting the number of rows affected
             */

            // Now see how can we delete a data from the database






            rs.close();
            st1.close();
            con.close();



        }
        catch(SQLException e){
            System.out.println("Error Connecting to the database : "+e.getMessage());
        }


    }
}