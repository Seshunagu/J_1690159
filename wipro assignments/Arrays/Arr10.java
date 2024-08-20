import java.util.*;
class Arr10{
public static void main(String a[]){
 Scanner sc=new Scanner(System.in);
int[] b=new int[sc.nextInt()];
int q=b.length;
for(int i=0;i<q;i++){
b[i]=sc.nextInt();
}
for(int j=0;j<q;j++){
if(b[j]%2==0){
System.out.println(b[j]);
}
}
for(int g=0;g<q;g++){
if(b[g]%2!=0){
System.out.println(b[g]);
}
}
}
}