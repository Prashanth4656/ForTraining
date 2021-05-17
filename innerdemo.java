package training;
class outside
{ 
	int a=10,b=20,c=30;
	
	void out()
	{
		System.out.println("Values of a,b,c in outside class:"+a+","+b+","+c);
	}
public	class inside
	{
		int a=1,b=2,c=3;
		void in()
		{
	     System.out.println("Values of a,b,c in inside class:"+a+","+b+","+c);
	     System.out.println("Values of a,b,c of outside from inside class:"+outside.this.a+","+outside.this.b+","+outside.this.c);
		}
	}
}
class innerdemo
{
	public static void main(String[]args)
	{
		new outside().out();
		new outside().new inside().in();
	}
}