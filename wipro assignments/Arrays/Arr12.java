import java.util.*;
class Arr12{
public static void main(String a[]){
 Scanner sc=new Scanner(System.in);
int d=sc.nextInt();
int[] b=new int[d];
int[] c=new int[d];
int[] e=new int[2];
for(int i=0;i<d;i++){
b[i]=sc.nextInt();
c[i]=sc.nextInt();
}
int y=d/2;
e[0]=b[y];
e[1]=c[y];
for(int z=0;z<2;z++){
System.out.println(e[z]);
}
}
}
