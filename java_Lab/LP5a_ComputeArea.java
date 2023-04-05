import java.util.*;
class LP5a_ComputeArea{
void area(double r){
double area;
area=3.142*r*r;
System.out.println("Area of Circle :"+area+"Sq units");
}
void area(float side){
double res;
res=Math.pow(side,2);
System.out.println("Area of Square="+res+"Sq units");
}
void area(float len,float wid){
double res=len*wid;
System.out.println("Area of Rectangle "+res+"Sq units");
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
LP5a_ComputeArea C=new LP5a_ComputeArea();
System.out.println("Enter radius of circle");
double r=s.nextDouble();
C.area(r);
System.out.println("Enter side of square");
float x=s.nextFloat();
C.area(x);
System.out.println("Enter Length and width of rectangle:");
float l=s.nextFloat();
float w=s.nextFloat();
C.area(l, w);
}
}