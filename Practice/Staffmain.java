package Practice;

import java.util.Scanner;

class Staff{
    String id,name;
    long phone,salary;
    void read(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id,name,phone,salary");
        id = s.nextLine();
        name = s.nextLine();
        phone = s.nextLong();
        salary = s.nextLong();
    }
  
    void display(){
        System.out.println("staff ID:"+id+"staff name:"+name+"staff phone:"+phone+"staff salary:"+salary);
    }
}

class Teaching extends Staff{
    String donmin;
    int n;
    void read(){
        Scanner s = new Scanner(System.in);
        super.read();
        System.out.println("Enter the donmin and publiction");
        donmin = s.nextLine();
        n = s.nextInt();
    }

    void Display(){
        System.out.println("donmin "+donmin+"\npubliction "+n);
    }
}


public class Staffmain {
    public static void main(String[] args) {
        
    }
}
