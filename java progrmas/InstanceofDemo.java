class Parent{
  void hello()
   {
     System.out.println("hello");
     System.out.println("hello1");
   }
}
class Child2 extends Parent{
   void hello2()
   {
     super.hello();
     System.out.println("hello2");
   }

}
class Child3 extends Parent{
   void hello3()
   {
     super.hello2();
     System.out.println("hello2");
   }

}
class InstanceofDemo
{
    public static void main(String...args)
      {
         Child3 p=new Child3();
         p.hello3();
       }
}