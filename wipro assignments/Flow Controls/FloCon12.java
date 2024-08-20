class FloCon12{
public static void main(String a[]){
int j=Integer.parseInt(a[0]);
int i,count=0;
for(i=1;i<=j;i++){
   if(j%i==0){
     count++;}
}
if(count==2){
System.out.println("It is a prime number");
}
else
System.out.println("It is not a prime number");
}
}