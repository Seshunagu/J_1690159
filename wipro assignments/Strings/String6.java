import java.util.*;
class String6{
public static void main(String a[]){
if(a.length<2){
 System.out.println("please provide two value input");
}
String str=a[0];
String str1=a[1];
int f=str.length();
int s=str1.length();
String comb="";
if(f!=0 && s!=0){
comb=str+str1+str;
System.out.println(comb);
}
else{
System.out.println("This is not a format of short+long+short");}
}
}
