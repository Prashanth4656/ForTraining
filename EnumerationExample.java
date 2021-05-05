package training;
enum Daysinweek
{
	
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
}
class EnumerationExample
{
public static void main(String[]args)
{
		EnumerationExample obj=new EnumerationExample();
		obj.func();
}
void func()
{
		for(Daysinweek d:Daysinweek.values())
		{
			System.out.println(d);
		}
}
}