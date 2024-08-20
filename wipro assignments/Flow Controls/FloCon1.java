class FloCon1{
public static void main(String z[]){
int a=Integer.parseInt(z[0]);
if(a<0){
 System.out.println("The given number is Negative :"+a);
}
if(a>0){
System.out.println("The given number is positive :"+a);
}
if(a==0){
System.out.println("The given number is zero :"+a);
}

// B solution

int b=Integer.parseInt(z[1]);
int c=Integer.parseInt(z[2]);
int d=c%10;
if(b==d){
System.out.println("True");
}
else
System.out.println("False");
}
}
