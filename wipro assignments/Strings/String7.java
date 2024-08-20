class String7{
public static void main(String a[]){
String str=a[0];
int n=str.length();
if((str.charAt(0) == 'x') && (str.charAt(n-1)=='x')){
System.out.println(str.substring(1,n-1));
}
else{
System.out.println(str);}
}
}