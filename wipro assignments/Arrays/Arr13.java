import java.util.*;
class Arr13{
public static void main(String a[]){
 Scanner sc=new Scanner(System.in);
int[][] b=new int[2][2];
int[][] w=new int[2][2];
int q=b.length;
for(int i=0;i<q;i++){
for(int j=0;j<q;j++){
  b[i][j]=sc.nextInt();
}
}
for(int g=0;g<q;g++){
 for(int h=0;h<q;h++){
   w[g][h]=b[q-1-g][q-1-h];
 System.out.print(w[g][h]);
}
}
}
}