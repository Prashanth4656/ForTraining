package training;
import java.util.*;
public class Mapsdemo 
{
	public static void main(String[] args) 
	{
TreeMap map = new TreeMap();
		

		map.put("Yash", 4450.00);
		map.put("Geetha", 567.90);
		map.put("Rahul", "5600.00");
		map.put("Stephy", 7000.789);
		map.put("Rishabh", 3450.90);
		map.put("Saumya", 2500.60);

		Set set = map.entrySet();
		for(Object ref : set) {
			Map.Entry me = (Map.Entry)ref;
			System.out.print("Key : " + me.getKey());
			System.out.println(", Value : " + me.getValue());
		}

		Double currentBalance = (Double) map.get("Stephy");
		

		map.put("Stephy", currentBalance + 10000);
		

		System.out.println("Updated balance for user Stephy : " + map.get("Stephy"));

	}

}
