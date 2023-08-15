package currencyconversion;
import java.util.*;

public class Currency {
    double inr, usd;
    double euro, yen;
 Scanner in = new Scanner(System.in);

 public void dollartorupee(){
   System.out.println("Enter dollars :");
   usd = in.nextInt();
   System.out.println("Dollar = "+ usd +"equal to INR= "+ (usd * 79.58));
 }

 public void rupeetodollar(){
   System.out.println("Enter Rupee :");
   inr = in.nextInt();
   System.out.println("Rupee = "+ inr +"equal to Dollars= "+ (inr / 79.58));
 }

 public void eurotorupee(){
   System.out.println("Enter euro :");
   euro = in.nextInt();
   System.out.println("Euro = "+ euro + "equal to INR= "+ (euro * 81.35));
 }

 public void rupeetoeuro(){
   System.out.println("Enter Rupees :");
   inr = in.nextInt();
   System.out.println("Rupee = "+ inr +"equal to Euro= "+ (inr / 81.35));
 }

 public void yentorupee(){
   System.out.println("Enter yen :");
   yen = in.nextInt();
   System.out.println("YEN= "+ yen + "equal to INR= "+ (yen / 0.59));
 }

 public void rupeetoyen(){
   System.out.println("Enter Rupees :");
   inr = in.nextInt();
   System.out.println("INR= "+ inr +"equal to YEN "+ (inr * 0.59));
 }
}
