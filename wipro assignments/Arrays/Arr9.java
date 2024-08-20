import java.util.*;
class Arr9{
public static void main(String a[]){
 Scanner sc=new Scanner(System.in);
int[] b=new int[sc.nextInt()];
for(int i=0;i<b.length;i++){
b[i]=sc.nextInt();
}
for(int j=0;j<b.length;j++){
if(b[j]==10){
b[j]=10%10;
}}
int temp;
for(int j=0;j<b.length;j++){
  for(int k=j+1;k<b.length;k++){
     if(b[j]<b[k]){
      temp=b[k];
      b[k]=b[j];
       b[j]=temp;
}
}
System.out.println(b[j]);
}
}
}																													