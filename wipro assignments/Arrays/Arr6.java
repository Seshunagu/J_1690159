import java.util.Scanner;
class Arr6{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int b[]=new int[sc.nextInt()];
int g=b.length;
int temp;
for(int i=0;i<g;i++){
b[i]=sc.nextInt();
}
for(int j=0;j<g;j++){
  for(int k=j+1;k<g;k++){
     if(b[j]>b[k]){
      temp=b[k];
      b[k]=b[j];
       b[j]=temp;
}
}
}
for(int l=0;l<g;l++){
System.out.println(b[l]);
}
}
}