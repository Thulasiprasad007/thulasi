import java.io.*;
class File
{
  public static void main(String...args)throws Exception
   {
    FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\case studys\\input.txt");
    FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\case studys\\output.txt");
    int temp;
    while((temp=fis.read())!=-1)
    {
         fos.write(temp);
    }
 }
}