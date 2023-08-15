/*write a program to generate the resume.create java class Teacher(data : personal information,qualification,experience,achienements)
 * and student(data : personal information,result,discipline)which implements java interface resume whith the method boidata()
 */
package Practice;

import java.util.Scanner;

interface Resume{
    void boidata();
}
class Teacher implements Resume{
    public void boidata(){
        String name,age,dob,bg;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name,age,date of bath(DD/MM/YYYY),blood group");
        name =s.nextLine();
        age = s.nextLine();
        dob = s.nextLine();
        bg = s.nextLine();
        System.out.println("Enter the qualification,experience,achienements");
        String q = s.nextLine();
        String e = s.nextLine();
        String a = s.nextLine();
        System.out.println("name "+name+"age "+age+"date of bath "+dob+"blood group "+bg+"qualification "+q+"experience "+e+"achienements "+a);
    }
}

class Student implements Resume{
    public void boidata(){
        String name,age,dob,bg;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name,age,date of bath(DD/MM/YYYY),blood group");
        name =s.nextLine();
        age = s.nextLine();
        dob = s.nextLine();
        bg = s.nextLine();
        System.out.println("Enter the Discipline i.brach ii.sementer iii.section");
        String b = s.nextLine();
        String sem = s.nextLine();
        String sec = s.nextLine();
        System.out.println("enter the result i.cgpa ii.percentage");
        float cgpa = s.nextFloat();
        float per = s.nextFloat();
        System.out.println("name "+name+"age "+age+"date of bath "+dob+"blood group "+bg+"brach "+b+"sementer "+sem+"section "+sec+"cgpa "+cgpa+"percentage "+per);

    }
}
public class MainClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student st = new Student();
        t.boidata();
        st.boidata();
    }
}
