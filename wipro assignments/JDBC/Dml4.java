import java.sql.*;
class Dml4{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection 
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/seshu","seshunagu","Seshu@1608$");
System.out.println("Driver loaded successfully");
Statement s=c.createStatement();
s.execute("ALTER TABLE mywipro modify first_name varchar(30)");
System.out.println("table will altered successfully");
s.executeUpdate("insert into mywipro values(205,'shelley','Higgins',110,12000)");
s.executeUpdate("insert into mywipro values(100,'steven','king',90,17000)");
s.executeUpdate("insert into mywipro values(101,'neena','kochhar',90,17000)");
s.executeUpdate("insert into mywipro values(102,'lex de','haan',90,17000)");
s.executeUpdate("insert into mywipro values(111,'ismael','sciarra',100,7700)");
s.executeUpdate("insert into mywipro values(112,'jose manuel','urman',100,7800)");
s.executeUpdate("insert into mywipro values(204,'hermann','baer',70,10000)");

System.out.println("seven rows inserted");

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