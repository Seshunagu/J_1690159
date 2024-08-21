import java.sql.*;
class Dml1{
 public static void main(String a[]){
try{
 Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded without any interpections");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name","your_database_username","your_database_password");
System.out.println("Connected to the database successfully");

Statement st=c.createStatement();
String sql = "CREATE TABLE mywipro ("+"employee_id INT(10), " +"first_name VARCHAR(10), " +"last_name VARCHAR(10), " +"department_id INT(10), " +"salary INT(10)" +")";
st.executeUpdate(sql);
System.out.println("table created successfully");
}catch(Exception e){
System.out.println(e);
}
}
}
     

