class vararg{
	public static void  main(String[] args)
	{
       vararg ref=new vararg();
       System.out.println(ref.add(10,20,30));
	}
	int add(int...  a)
	{    int sum=0;
		for(int i:a)
		{
            sum=sum+i;	
		}
		return sum;
	}
}