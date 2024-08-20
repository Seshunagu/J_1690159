import java.util.*;
class Arr5{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int b[]=new int[sc.nextInt()];
for(int i=0;i<b.length;i++){
 b[i]=sc.nextInt();
}
Arrays.sort(b);
System.out.println(b[1]);
System.out.println(b[b.length-2]);
}
}
