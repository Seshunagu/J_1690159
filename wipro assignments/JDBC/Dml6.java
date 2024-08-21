import java.sql.*;
class Dml6{
 public static void main(String a[]){
try{
 Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded without any interpections");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name","your_database_username","your_database_password");
System.out.println("Connected to the database successfully");

Statement st=c.createStatement();
st.executeUpdate("update mywipro set last_name='higgins' where employee_id=202");
System.out.println("lastname was updated fay to higgins");
}catch(Exception e){
System.out.println(e);
}
}
}
