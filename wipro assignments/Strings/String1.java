import java.lang.*;
class String1{
public static void main(String a[]){
String str=a[0];
String str1=str;
String str2="";
for(int i=str.length()-1;i>=0;i--){
str2+=str.charAt(i);
}
System.out.println(str2);
if(str2.equals(str1)){System.out.println("The given String is palindrome");}
else System.out.println("The given string is not palindrome");
}
}
