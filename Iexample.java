package training;
class comp
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
class boyss extends comp
{
void games()
{
	System.out.println("COD is launched");
}
}
class girlss extends comp
{
	void games()
	{
		System.out.println("CC is launched");
	}
}
class Iexample
{
	public static void main(String[]args)
	{
		boyss obj=new boyss();
		obj.subl();
		obj.vstudio();
		obj.games();
		girlss ref=new girlss();
		ref.subl();
		ref.vstudio();
		ref.games();
	}
}