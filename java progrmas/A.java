import java.util.*;
class A
{
public static void main(String...args)
{
  int date;
  int billno;
  System.out.println("enter the date bt 1 to 31");
  Scanner scan=new Scanner(System.in);
  date=scan.nextInt();
  if(date>=1&&date<=31)
  {
     System.out.println(" please enter the billno");
     Scanner sca=new Scanner(System.in);
     billno=sca.nextInt();
     int result=billno%100;
    if(result==date||date%billno==0)
       {
          System.out.println("your a lucky customer");
       }
       else
       {
          System.out.println("Sorry your not a lucky Custmoer");
       
       }
}
   else
    {
         System.out.println("you entered wrong date");
}
}
}
