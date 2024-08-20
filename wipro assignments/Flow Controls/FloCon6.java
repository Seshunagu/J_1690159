class FloCon6{
public static void main(String[] z){
String a=z[0];
int b=Integer.parseInt(z[1]);
if(a.equals("Male") && (b>1 && b<58)) {
System.out.println("The percentage of interest is 8.4%");
}
if(a.equals("Male") && (b>59 && b<100)) {
System.out.println("The percentage of interest is 10.5%");
}

if(a.equals("Female") && (b>1 && b<58)) {
System.out.println("The percentage of interest is 8.2%");
}

if(a.equals("Female") && (b>59 && b<100)) {
System.out.println("The percentage of interest is 9.2%");
}
}
}

