package Practice;
import java.util.*;
public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        int ch,c,i,j;
        String str,str1;
        do{
        System.out.println(" 1. Append at end \t 2.Insert at particular index \t 3.Search \t4.List string that starting with letter \t 5.Display");
        System.out.println("Enter the choice ");
        ch = s.nextInt();
        switch(ch){
            case 1:{
                System.out.println("Enter the string");
                str = s.next();
                obj.add(str);
                break;
            }

            case 2:{
                System.out.println("Enter the string");
                str = s.next();
                System.out.println("Ente the postion");
                i = s.nextInt();
                obj.add(i-1,str);
                System.out.println("the array list "+obj);
                break;
            }

            case 3:{
                System.out.println("Enter the search string");
                str = s.next();
                j = obj.indexOf(str);
                if(j==-1)
                   System.out.println("the string is not found");
                else
                  System.out.println("the string "+str+"at index "+j);
                break;
            }

            case 4:{
                System.out.println("Enter the string that starting with letter");
                str = s.next();
                for( i=0; i<obj.size(); i++){
                    str1 = obj.get(i);
                    if(str1.startsWith(str))
                          System.out.println(str1);
                }
                break;
            }
            case 5:{
                System.out.println("The array list are:"+obj);
                break;
            }
        }//end of switch
        System.out.println("Enter 0 to break or 1 to countnue");
        c = s.nextInt();
    }while(c==1);

    }
}
