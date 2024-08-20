class String4{
public static void main(String a[]){
String str=a[0];
int n=str.length();
if(n%2==0){
System.out.println(str.substring(0,n/2));
}
else{
System.out.println("NULL");
}
}
}