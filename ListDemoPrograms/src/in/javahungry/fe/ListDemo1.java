package in.javahungry.fe;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Srilanka");
		countries.add("New Zealand");
		countries.add("USA");
		countries.add("Canada");
		countries.add("Italy");
		
		//Before foreach
		/*
		 * for(String name : countries) { System.out.println(name); }
		 */
		
		//Using foreach
		countries.forEach(System.out::println);
	}
}
