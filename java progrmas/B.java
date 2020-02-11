class A
{
   public void m1(int a)
   {
     System.out.println(a);
   }
}
class B extends A
 {
    public static void main(String...args)
    {
      B d=new B();
       d.m1(10);
    }
}