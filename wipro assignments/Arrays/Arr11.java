import java.util.*;
class Arr11{
public static void main(String a[]){
 Scanner sc=new Scanner(System.in);
int[] b=new int[sc.nextInt()];
int q=b.length;
for(int i=0;i<q;i++){
b[i]=sc.nextInt();
}
int t=1;
for(int j=0;j<q;j++){
  if(b[j]!=1 && b[j]!=4){
       t=0;
       break;}
}
if(t==0){System.out.println("false");}
else{System.out.println("true");}
}
}
