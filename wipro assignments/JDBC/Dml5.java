import java.sql.*;
class Dml5{
 public static void main(String a[]){
try{
 Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded without any interpections");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/seshu","seshunagu","Seshu@1608$");
System.out.println("Connected to the database successfully");

Statement st=c.createStatement();
st.executeUpdate("update mywipro set salary=salary*1.10");
System.out.println("salary increased 10% successfully");
}catch(Exception e){
System.out.println(e);
}
}
}