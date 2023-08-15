
/*Create a java class called OOPS_LP2 with the following. details vam.ables within it.
1)USN  2)Name  3)Branch  4)Phone
Write a java program to create n OOPS_LP2 objects and print the USN, Name, Brunch & phone of these objects with
Suitable headings.
*/
import java.util.Scanner;
public class LP2_Student{
    String USN,name,branch;
    long phone;
    void insertRecord(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the USN,name,branch,phone no");
            USN = sc.nextLine();
            name = sc.nextLine();
            branch = sc.nextLine();
            phone = sc.nextLong();
    }

    void displayRecord(){
        System.out.println(USN +"\t"+ name +"\t"+ branch +"\t"+phone);
    }
    public static void main(String[] args) {
        int i,n;
        LP2_Student s[] = new LP2_Student[100];
           Scanner scr = new Scanner(System.in);
            System.out.println("Enter the namber of students");
            n = scr.nextInt();
        
        for(i=0; i<n; i++){
          System.out.println("Enter the student Details");
            s[i] = new LP2_Student();
            s[i].insertRecord();
        }
        System.out.println("####Student Record####");
        System.out.println("USN\t\t name\t Branch\t Phone Number");
        for(i=0; i<n; i++)
        s[i].displayRecord();

    }
    
}
