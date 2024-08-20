import java.util.*;
class String2{
public static void main(String a[]){
String str1=a[0];
String str2=str1.replace(',',' ');
StringBuffer s=new StringBuffer();
for(int i=0;i<str2.length();i++){
if(i<str2.length()-1 && str2.charAt(i) == str2.charAt(i+1)){
continue;
}
s.append(str2.charAt(i));
}
System.out.println(s.toString().toLowerCase());
}
}