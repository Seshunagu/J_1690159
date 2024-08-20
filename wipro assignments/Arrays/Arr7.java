import java.util.Scanner;
class Arr7{
public static void main(String a[]){
Scanner sc= new Scanner(System.in);
int[] b=new int[sc.nextInt()];
int h=b.length;
for(int i=0;i<h;i++){
b[i]=sc.nextInt();
}
for(int j=0;j<h;j++){
boolean v= false;
  for(int r=j+1;r<h;r++){
          if(b[j]==b[r]){
           v=true;
           break;
          }
}
if(!v){
System.out.println(b[j]);
}
} 

}
}
