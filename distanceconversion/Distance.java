package distanceconversion;
import java.util.*;
public class Distance {
 double km, m, miles;
 Scanner sc = new Scanner(System.in);

 public void kmtom(){
   System.out.print("Enter in km ");
   km = sc.nextDouble();
   System.out.println(km + "km" + " equal to " + (km * 1000) + "metres");
 }

 public void mtokm(){
   System.out.print("Enter in meter ");
   m = sc.nextDouble();
   System.out.println(m + "m" + " equal to " + (m / 1000) + "kilometres");
 }

 public void milestokm(){
   System.out.print("Enter in miles");
   miles = sc.nextDouble();
   System.out.println(miles + "miles" + " equal to " + (miles * 1.60934) + "kilometres");
 }

 public void kmtomiles() {
   System.out.print("Enter in km");
   km = sc.nextDouble();
   System.out.println(km + "km" + " equal to " + (km /1.60934) + "miles");
 }
}

