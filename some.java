package training;
class Some{
	void met(String userName) throws UsernameNotFoundException{
		// if(userName.length() < 3){
		if(userName.equals("admin")){
				System.out.println("We are good to go...");
		}
		else{
			throw new UsernameNotFoundException(userName);
		}
	}
}

class ThrowDemo{
	public static void main(String[] args) throws UsernameNotFoundException{
		System.out.println("Enter string:");
		new Some().met(new java.util.Scanner(System.in).nextLine());
	}
}


class UsernameNotFoundException extends Exception{ //Creating an user define exception class
	UsernameNotFoundException(String userName){
		super(userName);
	}
}