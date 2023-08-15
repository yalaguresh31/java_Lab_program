import java.util.Scanner;
interface Resume{
    void biodata();
}


class Teacher implements Resume{
    public void biodata(){
        String name,dob,age,bg;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name,Date of Birth(DD/MM/YYYY),Age,blood group of Teacher");
    name = s.nextLine();
    dob = s.nextLine();
    age = s.nextLine();
    bg = s.nextLine();

    System.out.println("Enter the qualifications,experience in years,achievements");
    String qua = s.nextLine();
    String exp = s.nextLine();
    String ach = s.nextLine();
    
    System.out.println("\n\nResume of the Teacher");
    System.out.println("Name:"+name+"\nDate of Birth:"+dob+"\nAge:"+age+"\nBlood group:"+bg);
    System.out.println("Qualifications:"+qua+"\nExperience in years:"+exp+"\nAchievements:"+ach);
    }//end of mathod
}//end of class teacher

class Student implements Resume{
    public void biodata(){
        String name,dob,age,bg;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name,Date of Birth(DD/MM/YYYY),Age,blood group of student");
    name = s.nextLine();
    dob = s.nextLine();
    age = s.nextLine();
    bg = s.nextLine();

    System.out.println("Enter the Discipline, i.Branch  ii.semester  iii.section");
    String branch = s.nextLine();
    String sem = s.nextLine();
    String sec = s.nextLine();

    System.out.println("Enter the Results i.percentage  ii.CGPA");
    float p = s.nextFloat();
    float c = s.nextFloat();

    System.out.println("\n\nResume of the Student");
    System.out.println("Name:"+name+"\nData of Birth:"+dob+"\nAge:"+age+"\nBlood group:"+bg);
    System.out.println("Results\nperdcentage:"+p+"\nCGPA:"+c);
    System.out.println("Discipline Details:\nBranch:"+branch+"\nsemester:"+sem+"\nsection:"+sec);
    }//end of mathod
}//end of class student


public class LP7_MainClass {
public static void main(String[] args) {
    Teacher t = new Teacher();
    Student s  = new Student();
    t.biodata();
    s.biodata();
}  
}