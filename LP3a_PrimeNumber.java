//Check the Prime Number
import java.util.Scanner;
public class LP3a_PrimeNumber {
    public static void main(String[] args){
        int num,i,count=0;
		Scanner s = new Scanner(System.in);
			System.out.println("Ente the number");
			  num = s.nextInt();
		
        for(i=1; i<=num; i++){
			if(num%i == 0)
				count++;
		}

	 if(count == 2)
		 System.out.println("The number is prime number");
	 else
		 System.out.println("The number is not prime number");
	
    }   
}

