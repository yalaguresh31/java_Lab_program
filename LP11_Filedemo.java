import java.io.*;
import java.util.*;
public class LP11_Filedemo{
public static void main(String args[]){
   Scanner br = new Scanner(System.in);
   System.out.println("Enter the file name");
   String filename = br.nextLine();
   File f = new File(filename);

   if(f.exists()) 
   System.out.println(f.getName()+" file exists");
   else
   System.out.println(f.getName()+" file does not exists");
   

   if(f.exists()){ 

       if(f.canRead())
              System.out.println(filename+" is a readable");
      else
         System.out.println(filename+" file is not readable");
      

      if(f.canWrite())
          System.out.println(filename+" file is writable");
          System.out.println("file size:"+f.length()+" byte");
          System.out.println("Last file modified:"+f.lastModified());
      
      if(f.isDirectory()){
        System.out.println(f.getName()+" is directory");
        System.out.println("List of file");
           String dir[] = f.list();

           for(int i=0; i<dir.length; i++)
            System.out.println(dir[i]);
      }//end of directory if

 
   }//end of if
  }
}

