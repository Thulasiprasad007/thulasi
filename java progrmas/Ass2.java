class Ass2
{
  public static void main(String...args)
  {
   StringBuffer s=new StringBuffer("This is StringBuffer");
   System.out.println(s.append("- This is a sample program"));
   System.out.println(s.insert(21, "Object"));
   System.out.println(s.reverse());
   StringBuffer s1=new StringBuffer("This is StringBuffer");
   System.out.println(s1.replace(14,20,"Builder"));
  }
}