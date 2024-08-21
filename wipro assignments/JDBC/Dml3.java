import java.sql.*;
class Dml3{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection 
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name","your_database_username","your_database_password");
System.out.println("Driver loaded successfully");
Statement s=c.createStatement();
s.executeUpdate("insert into mywipro values(201,'Michael','Harstein',20,13000)");
s.executeUpdate("insert into mywipro values(202,'pat','Fay',20,null)");
System.out.println("two rows inserted");

ResultSet rs=s.executeQuery("Select * from mywipro");
System.out.println("Employee_id	first_name last_name department_id salary");
System.out.println("--------------------------------------------------");
while(rs.next()){
int id = rs.getInt("employee_id");
String firstName = rs.getString("first_name");
String lastName = rs.getString("last_name");
int dep_id = rs.getInt("department_id");
 int salary = rs.getInt("salary"); 
System.out.println(id + "	  "+firstName+"	   "+lastName+"	   "+dep_id+"	 "+salary);
}}
catch(Exception e){
System.out.println(e);
}
}
}



