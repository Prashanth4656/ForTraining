class employee{
private String name;
private int id;
employee(String name,int id)
{
	this.id=id;
	this.name=name;
}
	public int getid()
	{
		return this.id;
	}
    public void setid(int id)
	{
        this.id=id;
	}

	public String getname()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
}
class construct{
	public static void main(String[] args) {
		employee obj1= new employee("abcd",100); 
		employee obj2= new employee("lmno",200);
        System.out.println(obj1.getname()+","+obj1.getid());
		System.out.println(obj2.getname()+","+obj2.getid());

	}
}