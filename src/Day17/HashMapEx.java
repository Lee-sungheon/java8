package Day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 80);
		map.put("����", 99);
		map.put("����", 72);
		map.put("����", 84);
		
		System.out.println(map.containsKey("����"));
		System.out.println(map.containsValue(84));
		System.out.println(map.isEmpty());

		Set<String> keySet = map.keySet();
		for(String str : keySet) {
			System.out.println(str + " : " + map.get(str));
		}
		
		System.out.println();
		map.put("����", 80);
		keySet = map.keySet();
		for(String str : keySet) {
			System.out.println(str + " : " + map.get(str));
		}
		
		System.out.println();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String Key = entry.getKey();
			int score = entry.getValue();
			System.out.println(Key + " : " + score);
		}
		
		int num = map.remove("����");
		
		System.out.println();
		System.out.println(num);
		keySet = map.keySet();
		for(String str : keySet) {
			System.out.println(str + " : " + map.get(str));
		}
		
		System.out.println();
		boolean isEntry = map.remove("����", 79);
		System.out.println(isEntry);
		keySet = map.keySet();
		for(String str : keySet) {
			System.out.println(str + " : " + map.get(str));
		}
		
		System.out.println();
		isEntry = map.remove("����", 80);
		System.out.println(isEntry);
		keySet = map.keySet();
		for(String str : keySet) {
			System.out.println(str + " : " + map.get(str));
		}
		System.out.println();
		
		if(!map.isEmpty()) {
			map.clear();
		}
		System.out.println(map.size());
		
	}

}
