package Practice;

import java.util.*;

class FirstThread extends Thread{
   public void run(){
    int num =0;
    Random r = new Random();
    try{
    for(int i=0; i<5; i++){
        num = r.nextInt(100);
        System.out.println("FirstThread : random number generated is "+num);
        Thread t2 = new Thread(new SecondThread(num));
        t2.start();
        Thread t3 = new Thread(new ThirdThread(num));
        t3.start();

        Thread.sleep(1000);
    }
}catch(Exception e){
    System.out.println(e);
}
   }
}

class SecondThread implements Runnable{
    int x;
    SecondThread(int x){
        this.x = x;
    }
    public void run(){
        System.out.println("the suqre = "+(x*x));
    }
}
class ThirdThread implements Runnable{
    int x;
    ThirdThread(int x){
        this.x = x;
    }
    public void run(){
        System.out.println("the cube = "+(x*x*x));
    }
}
public class MultiThread {
    public static void main(String[] args) {
        FirstThread f=new FirstThread();
        f.start();
    }
}
