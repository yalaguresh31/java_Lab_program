package Practice;

import java.io.*;
import java.util.*;
public class Filedemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the file name");
        String filename = s.nextLine();
        File f = new File(filename);

        if(f.exists())
            System.out.println(f.getName()+"file is exists");
        else
          System.out.println(f.getName()+"file is not exists");

        if(f.exists()){
            if(f.canRead())
                System.out.println(filename+"file is readable");
                else
                System.out.println(filename+"file is  not readable");

            
            if(f.canWrite())
                System.out.println(filename+"file is writable");
                System.out.println("file size:"+f.length()+"byte");
                System.out.println("file last modified:"+f.lastModified());

            if(f.isDirectory()){
                System.out.println(f.getName()+" is directory");
                System.out.println("file last");
                String dir[] = f.list();

                for(int i=0; i<dir.length; i++)
                  System.out.println(dir[i]);
            }

        }//end of if
    }
}
