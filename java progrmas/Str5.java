import java.util.*;
class Str5
{
 public static void main(String...args)
 {
   Scanner scan=new Scanner(System.in);
   String s=scan.nextLine();
   String d=scan.nextLine();
   String f="";
   for(int i=0;i<s.length();i++)                        //thu--t-h-u
   {                                                    //asv--t-h-u
     if(s.charAt(i)==d.charAt(i)||s.charAt(i)!=d.charAt(i))
       {
       f=f+s.charAt(i);
       }                                
   /* if(s.charAt(i)=="-"&&d.charAt(i)=="-")
     {
          f=f+s.charAt(i);   
          System.out.println(f); 
     }*/
    }
     if(f.equals(d))
     {
        System.out.println("True");
     }
     else
     {
        System.out.println("True");
     }
  }
}    