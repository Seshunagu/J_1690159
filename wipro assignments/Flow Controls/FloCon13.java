class FloCon13{
public static void main(String a[]){
int i,j,count;
for(i=10;i<=99;i++){
count=0;
for(j=1;j<=i;j++){
if(i%j==0){
count++;
}
}
if(count==2){
System.out.print(i+" ");
}
}
}
}