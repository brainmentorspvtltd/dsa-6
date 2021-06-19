package arraydemos;

import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
		map.put("ram", 2);
		//map.get("amit").hashCode();
		map.put("amit", 1);
		map.put("shyam", 13);
		map.put("tim", 42);
		map.put("ramesh", 52);
		map.put("kim", 23);
		System.out.println(map);
	}

}
