package basicjavaprograms;
import java.util.*;

public class MapJavaValueSwap {

	public static void main(String[] args) {
		
		Map<Integer,String>  map = new HashMap<Integer,String>();
		map.put(1, "himadri");
		map.put(2, "sachin");
		map.put(3,"divyandu");
		System.out.println(map);
		
		Collection<String> values = map.values();
		for(String string : values) {
			System.out.println(string);
		}
		
	}
}
