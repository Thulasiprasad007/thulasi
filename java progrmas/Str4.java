import java.util.*;
class Str4
{
  public static void main(String...args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the string1");
    String s=scan.nextLine();
    System.out.println("enter the String2");
    String d=scan.nextLine();
    String e="";
    //for(int i=0;i<s.length();i++)
     // {
          if(s.length()==d.length())
          {
             e=s+d;
           }
         /* else if(d.length()<s.length())
            {
                   
            }*/
             
       //}
       System.out.println(e);
    }
}
                  