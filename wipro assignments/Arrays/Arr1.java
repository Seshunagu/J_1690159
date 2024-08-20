class Arr1{
public static void main(String a[]){
 int[] marks=new int[5];
  int i,sum=0;
float avg=0;
for(i=0;i<marks.length;i++){
marks[i]=Integer.parseInt(a[i]);
}
for(int j=0;j<marks.length;j++){
sum+=marks[j];}
avg=sum/marks.length;
System.out.println("Sum is: "+sum);
System.out.println("Avgerage is :"+avg);
}
}