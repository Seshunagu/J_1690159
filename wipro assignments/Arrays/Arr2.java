class Arr2{
public static void main(String a[]){
int b[]=new int[5];
for(int i=0;i<b.length;i++){
    b[i]=Integer.parseInt(a[i]);
}
int max=b[0];
int min=b[0];
for(int j=0;j<b.length;j++){
if(b[j]>b[0]){
max=b[j];
}
if(b[j]<b[0]){
min=b[j];
}
}
System.out.println("Maximum value :"+max);
System.out.println("minimum value :"+min);
}
}