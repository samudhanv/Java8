// Needs to display the countries whose starting letter is I or C

package in.javahungry.fe;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {

		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Srilanka");
		countries.add("Chili");
		countries.add("New Zealand");
		countries.add("USA");
		countries.add("Canada");
		countries.add("Italy");

		// Before foreach
		/*for (String name : countries) {
			if(name.startsWith("I") || name.startsWith("C"))
				System.out.println(name);
		}*/

		
		// Using foreach
		countries.forEach(
				name ->{ if(name.startsWith("I") || name.startsWith("C")) {
					System.out.println(name);
				}
				});
	}
}
