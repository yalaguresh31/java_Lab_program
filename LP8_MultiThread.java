import java.util.*;
class FirstThread extends Thread{
   public void run(){
       int num=0;
       Random r=new Random();
       try{
         for(int i=0;i<5;i++){
             num=r.nextInt(100);
             System.out.println("First thread : Genereated number is "+num);
             Thread t2=new Thread(new SecondThread(num));
             t2.start();
             Thread t3=new Thread(new ThirdThread(num));
             t3.start();
             Thread.sleep(1000);
         }
       }
       catch(InterruptedException e){  //or Exception
         System.out.println(e.getMessage());
       }
   }
}
class SecondThread implements Runnable{
    public int x;
    public SecondThread(int x){
       this.x=x;
    }
    public void run(){
     System.out.println("Second Thread: Square of the number is " +x*x);
    }
}
class ThirdThread implements Runnable{
    public int x;
    public ThirdThread(int x){
      this.x=x;
    }
    public void run(){
      System.out.println("Third Thread : Cube of the number is " +x*x*x);
    }

}
public class LP8_MultiThread{
    public static void main(String args[])
    {
        FirstThread f=new FirstThread();
        f.start();
    }
}