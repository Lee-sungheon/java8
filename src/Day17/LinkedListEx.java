package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		System.out.println("arraylist¿Í linkedlist ºñ±³");
		long start = System.currentTimeMillis();
		for(int i=0 ; i < 100_000 ; i++) {
			arrayList.add(String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i=0 ; i < 100_000 ; i++) {
			linkedList.add(String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");

		
		start = System.currentTimeMillis();
		for(int i=0 ; i < 100_000 ; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i=0 ; i < 100_000 ; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

}
