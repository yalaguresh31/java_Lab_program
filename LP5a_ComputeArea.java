import java.util.*;
class LP5a_ComputeArea{

void area(double r){
System.out.println("Area of Circle :"+(3.142*r*r)+"Sq units");
}

void area(float side){
System.out.println("Area of Square="+(side*side)+"Sq units");
}

void area(float len,float wid){
System.out.println("Area of Rectangle "+(len*wid)+"Sq units");
}

public static void main(String[] args){
Scanner s=new Scanner(System.in);
LP5a_ComputeArea C=new LP5a_ComputeArea();

System.out.println("Enter radius of circle");
C.area(s.nextFloat());

System.out.println("Enter side of square");
C.area(s.nextFloat());

System.out.println("Enter Length and width of rectangle:");
C.area(s.nextFloat(), s.nextFloat());

}
}