import java.util.Random;
class Arr4{
public static void main(String a[]){
Random tr=new Random();
int ac[]=new int[5];
for(int i=0;i<ac.length;i++){
ac[i]=tr.nextInt(128);
}
 for(int data:ac){
char c=(char)data;
System.out.print(c);
}
}
}
  