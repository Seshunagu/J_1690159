class String10{
public static void main(String a[]){
String b=a[0];
int n=Integer.parseInt(a[1]);
int u=b.length();
String s="";
int v=u-n;
while(n>0){
 s+=b.substring(v,b.length());
n--;
}
System.out.println(s);
}
}
