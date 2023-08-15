//quadratic equation
import java.util.Scanner;
public class LP1_QuadraticEquation{
 public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number a b c :");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double disc,r,root1=0,root2=0;
            disc = b*b-4*a*c;
            r = Math.sqrt(disc);

            if(disc == 0){
                System.out.println("Roots are real and equal");
                root1 = root2 = -b/(2*a);
                System.out.println("Root1 = "+root1+"\nRoot2 = "+root2);
            }
            
            else if(disc>0){
                System.out.println("Roots are real and distinst");
                root1 = (-b+r)/(2*a);
                root2 = (-b-r)/(2*a);
                System.out.println("Root1 = "+root1+"\nRoot2 = "+root2);  
            }

            else if(disc<0)
            System.out.println("Roots are complex");
             
            else
            System.out.println("Enter the wrong number\n");
       
        
    }
}
// try {
    
// } catch (Exception e) {
//     // TODO: handle exception
// }




