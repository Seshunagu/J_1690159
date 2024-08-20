class FloCon17{
public static void main(String a[]){
 int b=Integer.parseInt(a[0]);
 int ori=b;
  int re=0;
  while(b!=0){
   int rem=b%10;
   re=re*10+rem;
   b=b/10;
}
if(ori==re){
System.out.println("It is palindrome: "+re);
}
else
System.out.println("It is not a palindrome: "+re);
}
}