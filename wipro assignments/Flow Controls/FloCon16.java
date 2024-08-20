class FloCon16{
public static void main(String[] a){
String b=a[0];
int i;
int h=b.length();
String k="";
for(i=h-1;i>=0;i--){
  k+=b.charAt(i);
}
System.out.println(k);
}
}