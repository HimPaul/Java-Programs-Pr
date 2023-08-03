package basicjavaprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapValueswap {

	 public static void main(String[] args)
	    {
	        Map<String, String> hashMap = new HashMap<>();
	 
	        hashMap.put("n1", "Himadri");
	        hashMap.put("n2", "sachin");
	        hashMap.put("n3", "aman");
	 
	        System.out.println("original map value "+hashMap);
	        
	        String[] values = hashMap.values().toArray(new String[0]);
	        
	        String str = Arrays.toString(values); // convert values to string
	        
	        System.out.println("map values are: "+str);
	        
	        str = str.replace('a','z');
	        System.out.println("new string values are: "+str);
	        
	        String[] strArray = str.split(" ");  //convert string to Array
	        
	        String[] s1 = { "n1", "n2","n3"};
	        
	        Map<String,String> mapvalue = new HashMap<String,String>();
	        for(int i=0;i<strArray.length && i<s1.length;i++) {
	        	mapvalue.put(s1[i],strArray[i]);
	        }
	        
	        System.out.println("Map value after replacing a with z: "+mapvalue);
	    }
}
