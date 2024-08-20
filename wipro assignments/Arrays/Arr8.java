import java.util.*;
class Arr8{
public static void main(String a[]){
 Scanner sc=new Scanner(System.in);
int b[]=new int[sc.nextInt()];
int l=b.length;
for(int i=0;i<l;i++){
b[i]=sc.nextInt();
}
int sum=0;
int _6=0;
int _7=0;
for(int j=0;j<l;j++){
if(b[j]==6 ){
 _6=j;
}
if(b[j]==7){
_7=j;
}
}
for(int k=0;k<l;k++){
if(k<_6 || k>_7){
sum+=b[k];
}
}
System.out.println(sum);
}
}