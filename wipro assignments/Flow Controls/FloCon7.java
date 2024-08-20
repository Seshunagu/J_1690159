import java.util.Scanner;
class FloCon7{
public static void main(String[] z){
 Scanner sc =new Scanner(System.in);
String a=sc.next();
char b=a.charAt(0);
if(Character.isLowerCase(b)){
char o=Character.toUpperCase(b);
System.out.println(b+"->"+o);
}
else{
char d=a.charAt(0);
char o=Character.toLowerCase(d);
System.out.println(d+"->"+o);
}
}
}