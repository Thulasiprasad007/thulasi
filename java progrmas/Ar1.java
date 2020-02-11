import java.util.*;
class Ar1
 {
  public static void main(String...args)
  {
    int arr[][]=new int[3][];
    arr[0]=new int[3];
    arr[1]=new int[4];
    arr[2]=new int[5];
    Scanner scan=new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
     {
      for(int j=0;j<arr[i].length;j++)
         {
          System.out.println("enter the marks of class"+i);
          arr[i][j]=scan.nextInt();
          }
      }
     for(int i=0;i<arr.length;i++)
       {
      for(int j=0;j<arr[i].length;j++)
         {
          System.out.println("The marks of class"+ i +"is"+ arr[i][j]);
          }
       }
    }
}