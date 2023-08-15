
import currencyconversion.Currency;
import distanceconversion.Distance;
import timeconversion.Timer;

import java.util.*;

public class LP6_Converter {
 public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
   int choice;
   Currency c = new Currency();
   Distance d = new Distance();
   Timer t = new Timer();
while(true){
      System.out.println("1.Dollar to rupee ");
      System.out.println("2.Rupee to dollar ");
      System.out.println("3.Euro to rupee ");
      System.out.println("4.Rupee to Euro ");
      System.out.println("5.Yen to rupee ");
      System.out.println("6.Rupee to Yen ");

      System.out.println("7.Meter to kilometer ");
      System.out.println("8.kilometer to meter ");
      System.out.println("9.Miles to kilometer ");
      System.out.println("10.kilometer to miles");

      System.out.println("11.Hours to Minutes");
      System.out.println("12.Hours to Seconds");
      System.out.println("13.Seconds to Hours");
      System.out.println("14.Minutes to Hours");
      
      System.out.println("15.Exit");
      System.out.println("Enter your choice");
      choice = s.nextInt();
      switch (choice) {
           case 1-> c.dollartorupee();
        case 2-> c.rupeetodollar();
        case 3-> c.eurotorupee();
        case 4-> c.rupeetoeuro();
        case 5-> c.yentorupee();
        case 6-> c.rupeetoyen();

        case 7-> d.mtokm();
        case 8-> d.kmtom();
        case 9-> d.milestokm();
        case 10-> d.kmtomiles();

        case 11-> t.hourstominutes();
        case 12-> t.hourstoseconds();
        case 13-> t.secondstohours();
        case 14-> t.minutestohours();
        
         case 15-> System.exit(1);
      }
     
    }
  }
}