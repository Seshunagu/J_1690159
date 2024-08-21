import java.sql.*;
class Dml2{
 public static void main(String a[]){
try{
 Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded without any interpections");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name","your_database_username","your_database_password");
System.out.println("Connected to the database successfully");

Statement st=c.createStatement();
ResultSet resultSet=st.executeQuery("DESCRIBE mywipro");
System.out.println("Name           Type         Null");
System.out.println("-----------------------------------");
 while (resultSet.next()) {
String field = resultSet.getString("Field");
String type = resultSet.getString("Type");
String nu = resultSet.getString("Null");
         
System.out.println(field + " | " + type +" | "+ nu);
}
}catch(Exception e){
System.out.println(e);
}
}
}
