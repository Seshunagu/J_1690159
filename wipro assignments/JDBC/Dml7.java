import java.sql.*;
class Dml7{
 public static void main(String a[]){
try{
 Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded without any interpections");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name","your_database_username","your_database_password");
System.out.println("Connected to the database successfully");

Statement st=c.createStatement();
st.executeUpdate("delete from mywipro where last_name LIKE '%man%' ");
System.out.println("the data was deleted where last name having man");
}catch(Exception e){
System.out.println(e);
}
}
}
