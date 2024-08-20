import java.util.Scanner;
class FloCon4{
public static void main(String[] z){
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();
int c=a.compareTo(b);
if(c<0){
System.out.println(a+" "+b);}
else{
System.out.println(b+" "+a);}
}
}