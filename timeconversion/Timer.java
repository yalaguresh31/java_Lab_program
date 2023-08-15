package timeconversion;
import java.util.*;
public class Timer {
 int hours, seconds, minutes;
 int input;
 Scanner sc = new Scanner(System.in);

 public void secondstohours(){
   System.out.print("Enter the number of seconds:");
   input = sc.nextInt();
   System.out.println("Hours: " + (input / 3600));
   System.out.println("Minutes: " + ((input % 3600) / 60));
   System.out.println("Seconds: " + ((input % 3600) % 60));
 }

 public void minutestohours(){
   System.out.print("Enter the number of minutes: ");
   minutes = sc.nextInt();
   System.out.println("Hours: " + (minutes / 60));
   System.out.println("Minutes: " + (minutes % 60));
 }
 public void hourstominutes() {
   System.out.println("enter the no of hours");
   hours = sc.nextInt();
   System.out.println("Minutes: " + (hours * 60));
 }

 public void hourstoseconds() {
   System.out.println("enter the no of hours");
   hours = sc.nextInt();
   System.out.println("Minutes: " +(hours * 3600));
 }
}
