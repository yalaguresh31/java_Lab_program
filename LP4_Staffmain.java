/* Staff Details*/
import java.util.Scanner;

class Staff{
	String id,name;
	long phone,salary;
	
	void read() {
		  Scanner s = new Scanner(System.in);
            System.out.println("Enter the id,name,phone,salary");
            id = s.nextLine();
            name = s.nextLine();
            phone = s.nextLong();
            salary = s.nextLong();  
	}
	
	void display() {
		System.out.println("staff ID:"+id+"\n Name:"+name+"\n Phone Number:"+phone+"\n Salary:"+salary);
	}
}//end of staff class


class Teaching extends Staff{
	String domain;
	int n;
	
	void read() {
		  Scanner s = new Scanner(System.in);
            super.read();
            System.out.println("Enter the domain of Teaching staff");
            domain = s.nextLine();
            System.out.println("Enter the total number of publications");
               n = s.nextInt();
        
	}
	
	void display() {
		super.display();
		System.out.println("Domain:"+domain+"\t Number of pulbication:"+n);
	}
}//end of Teaching class

class Teachical extends Staff{
	String skills;

	void read() {
		Scanner s = new Scanner(System.in);
            super.read();
            System.out.println("Enter the skills of Technical staff");
            skills = s.nextLine();
        
	}
	
	void display() {
		super.display();
		System.out.println("Skills:"+skills);
	}
}//end of Technical

class Contract extends Staff{
	int period;
	
	void read() {
		  Scanner s = new Scanner(System.in);
            super.read();
            System.out.println("Enter the contract period in years");
            period = s.nextInt();
        
	}
	
	void display() {
		super.display();
		System.out.println("Contract Period:"+period);
	}
}//end of Contract class

public class LP4_Staffmain {
    public static void main(String[] args) {
        Teaching t = new Teaching();
		Teachical tech = new Teachical();
		Contract c = new Contract();
		
		System.out.println("Enter the teaching staff Information");
		t.read();
		System.out.println("Enter the teachical staff Information");
		tech.read();
		System.out.println("Enter the Contract basic staff Information");
		c.read();
		
		
		System.out.println("\n\n****Teaching staff Imformation****");
		t.display();
		System.out.println("\n\n****Teachical staff Information****");
		tech.display();
		System.out.println("\n\n****Contract basis staff Infomation****");
		c.display();

    }
}
