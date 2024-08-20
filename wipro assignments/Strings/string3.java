class String3{
public static void main(String a[]){
String str=a[0];
int n=str.length();
String str2=str.substring(0,2);
String str3=" ";
while(n>0){
str3+=str2;
n--;
}
System.out.println(str3);
}
}


