package training;
class Cars 
{

private String name,company,mileage;
public Cars(String name,String company,String mileage)
{
super();
this.name=name;
this.company=company;
this.mileage=mileage;
}
public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public String getCompany() 
{
	return company;
}

public void setCompany(String company) 
{
	this.company = company;
}

public String getMileage() 
{
	return mileage;
}

public void setMileage(String mileage) 
{
	this.mileage = mileage;
}
@Override
public boolean equals(Object obj) 
{
	if(this.name==obj)
		return true;
	else 
		return false;
}

}
public class Overridingmethods
{
	public static void main(String[]args)
	{
		Cars c1=new Cars("abc","red","12"); 
		Cars c2=new Cars("def","blue","10");
		c1.equals(c2);
    
	}
}