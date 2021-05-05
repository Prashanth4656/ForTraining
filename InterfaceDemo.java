package training;
interface Human{
	void eat();
	void sleep();
	void breathe();
}

interface Employee extends Human{
	void workForWages();
}

interface Chef{
	void cookWell();
}

class Saumya implements Human{
	@Override
	public void eat(){
		System.out.println("Inside Saumya's eat()...");
	}
	@Override
	public void breathe(){
		System.out.println("Inside Saumya's breathe()....");
	}
	@Override
	public void sleep(){
		System.out.println("Inside Saumya's sleep()...");
	}
}

class Geetha implements Employee{
	@Override
	public void workForWages(){
		System.out.println("Geetha has started to work...");
	}

	@Override
	public void eat(){
		System.out.println("Geetha eats in her own way...");
	}

	@Override
	public void sleep(){
		System.out.println("Inside Geetha's sleep...");
	}

	@Override
	public void breathe(){
		System.out.println("Inside Geetha's breathe...");
	}
}

class Abhishek implements Chef, Human{
	@Override
	public void cookWell(){
		System.out.println("Abhishek cooks really well...");
	}

	@Override
	public void eat(){
		System.out.println("Abhishek eats in her own way...");
	}

	@Override
	public void sleep(){
		System.out.println("Inside Abhishek's sleep...");
	}

	@Override
	public void breathe(){
		System.out.println("Inside Abhishek's breathe...");
	}
}


class InterfaceDemo{
	public static void main(String[] args) {
		Saumya saumya = new Saumya();
		saumya.eat();
		saumya.breathe();
		saumya.sleep();

		new Geetha().breathe();

	}
}