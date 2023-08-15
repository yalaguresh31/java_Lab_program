//Arithmetic Calculator using switch case
import java.util.Scanner;
public class LP3b_ArithmeticCalculator{
    public static void main(String[] args) {
        char op;
        double n1,n2;
        Scanner s = new Scanner(System.in);
          System.out.println("Enter the two numbers");
              n1 = s.nextDouble();
              n2 = s.nextDouble();
               System.out.println("Enten the op");
               op = s.next().charAt(0);
        
        //inhens switch
            switch (op) {
            case '+'->  System.out.println("sum ="+(n1 + n2));
            case '-'->  System.out.println("dif ="+(n1 - n2));
            case '*'->  System.out.println("pro ="+(n1 * n2));
            case '/'->  System.out.println("div ="+(n1/n2)); 
            default ->  System.out.println("your enter invalid input");     
         }

    //    double result = switch (op) {
    //       case '+'->  (n1 + n2);
    //       case '-'->  (n1 - n2);
    //       case '*'->  (n1 * n2);
    //       case '/'->  (n1/n2); 
    //       //default ->  System.out.println("your enter invalid input");
    //     default -> throw new IllegalArgumentException("your enter invalid input " + op);
    // };
    // System.out.println(result);



//     double result = switch (op) {
//       case '+': yield  (n1 + n2);
//       case '-': yield  (n1 - n2);
//       case '*': yield  (n1 * n2);
//       case '/': yield  (n1/n2); 
//       //default : yield  System.out.println("your enter invalid input");
//     default : throw new IllegalArgumentException("your enter invalid input " + op);
// };
// System.out.println(result);


}
}

