// Exception Handling in foreach
// Need only 4 digit numbers

package in.javahungry.fe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListDemo3 {

	public static void main(String[] args) {
		
		List<String> srcList = Arrays.asList("2500000", "786", "2408", "2511", "YAJWANI", "0101", "0707", "1408", "23145","KITTU", "345", "8123");
		List<Integer> trgtList = new ArrayList<>();
		
		srcList.forEach(
				val ->{
					try {
						int n = Integer.parseInt(val);
						if(n>=1000 && n<=9999)
							trgtList.add(n);
					}catch(NumberFormatException nfe) {
						System.out.println("only numbers in string format can be parsed");
					}
				});
		
		
		trgtList.stream()
		.filter(Objects::nonNull)
		.forEach(System.out::println);
	}
}
