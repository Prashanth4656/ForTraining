package training;

public class P
{

void subl()
{
	System.out.println("Subl is launched.");
}
void games()
{
	System.out.println("Games is launched");
}
void vstudio()
{
	System.out.println("Vstudio is launched");
}
}
class boy extends P
{
void games()
{
	System.out.println("COD is launched");
}
}
class girls extends P
{
	void games()
	{
		System.out.println("CC is launched");
	}
}
class InheritExample
{
	public static void main(String[]args)
	{
		boy obj=new boy();
		obj.subl();
		obj.vstudio();
		obj.games();
		girls ref=new girls();
		ref.subl();
		ref.vstudio();
		ref.games();
	}
}