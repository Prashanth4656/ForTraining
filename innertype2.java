package training;
class innertype2
{
public static void main(String[] args) 
  {
    new Outer().doSomething();
  }
}
class Outer
{
   void doSomething()
   {
    int var = 90;
      class Inner
      {
           void in()
            {
              System.out.println("Strange but valid..., var : " + var);
            }
      } 
    new Inner().in();
   }
}