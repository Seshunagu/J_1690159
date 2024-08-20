import java.util.Scanner;
class Arr3{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int b[] =new int[5];
for(int i=0;i<b.length;i++){
 b[i]=sc.nextInt();
}
int f=0;
int searchelement =sc.nextInt();
for(int j=0;j<b.length;j++){
if(b[j]==searchelement){
 System.out.println("your searched element  reference location is :"+j);
 f=1;
}
}
if(f==0){
System.out.println("Your element is not present in the given values of array: -1");
}
}
}
