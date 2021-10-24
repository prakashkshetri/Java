package collection;
import java.util.*;
public class LinkedHashedMap {

	public static void main(String[] args) {
	
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
				
			linkedHashMap.put(1, new String("Apple"));
			linkedHashMap.put(2, new String("Mango"));
			linkedHashMap.put(3, new String("Banana"));
			linkedHashMap.put(4, new String("Orange"));
			linkedHashMap.put(5, new String("Kiwi"));
			linkedHashMap.put(6, new String("Pineapple"));
				
		System.out.println(linkedHashMap);
		System.out.println("Check whether Banana is available or not :"+ linkedHashMap.containsValue("Banana"));
				
		for(Integer key : linkedHashMap.keySet()) {
			System.out.println(key + ":" + linkedHashMap.get(key));
					
				}
				
			}

		}


