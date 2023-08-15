import java.util.Scanner;
public class LP10_RaiseException{
    public static void main(String args[]){
        int a,b,result;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        a=s.nextInt();
        b=s.nextInt();
        try{
           result=a/b;
           System.out.println("Result = "+result); 
        }
        catch(Exception e){
          System.out.println(e);
        }
    }
}


