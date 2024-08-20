import java.util.*;
class Arr14{
public static void main(String a[]){
 Scanner sc=new Scanner(System.in);
int[][] b=new int[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
 b[i][j]=sc.nextInt();
}
}
int max=b[0][0];
for(int k=0;k<3;k++){
for(int l=0;l<3;l++){
if(b[k][l]>max)
 max=b[k][l];
}
}
System.out.println("The element in the given array is :"+max);
}
}