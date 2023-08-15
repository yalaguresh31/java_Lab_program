import java.util.*;
public class QuadraticEquation1{
    public static void main(String args[])
    {
     double m=0,n=0,a,b,c,determinant,r;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the value of coefficient a:");
     a=s.nextDouble();
     System.out.println("enter the value of coefficient b:");
     b=s.nextDouble();
     System.out.println("enter the value of coefficient b:");
     c=s.nextDouble();
     determinant=(b*b)-(4*a*c);
     r=Math.sqrt(determinant);

     if(determinant>0)
      {
        m=(-b+r)/(2*a);
        n=(-b-r)/(2*a);
        System.out.println("the roots are real and distinct\n m="+m+"n="+n);
      }
      else if(determinant==0){

        m=(-b)/(2*a);
        n=m;
        System.out.println("the roots are real and equal\n m="+m+"n="+n);
      }
      else{
        System.out.println("the roots are imaginary");
      }
    }
  }
    
     