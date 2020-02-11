import java.util.*;
class Str7
{
  public static void main(String...args)
  {
    Scanner scan=new Scanner(System.in);
    String d=scan.nextLine();
    int c=0;
    String f="";
    for(int i=0;i<d.length();i++)
    {
        f=d.charAt(i)+f;
     }
     for(int i=0;i<d.length();i++)
     {
        if(f.charAt(i)=='a'||f.charAt(i)=='e'||f.charAt(i)=='i'||f.charAt(i)=='o'||f.charAt(i)=='u')
        {
             c++;
        } 
      }
      if(c>2)
      {
         System.out.println("True");
      }
       else
      {
         System.out.println("false");
       }
  }
}
    