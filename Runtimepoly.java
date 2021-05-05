package training;
public class Runtimepoly 
{
public static void main(String[] args)
{
   Coach obj=new Batcoach();
   Coach obj2=new Bowlcoach();
   obj.tips();
   obj2.tips();
   new Bowlcoach().bowl();
   new Batcoach().bat();
}
}
interface Coach
{
	void tips();
}
class Batcoach implements Coach
{
	public void tips()
	{
		System.out.println("Batting tips");
	}
	public void bat()
	{
		System.out.println("Bats well");
	}
}
class Bowlcoach implements Coach
{
	public void tips()
	{
		System.out.println("Bowling tips");
	}
	public void bowl()
	{
		System.out.println("Bowls well");
	}
}