package com.ganga.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyList {
	public static void main(String[] args) {
		List arrayList = new ArrayList();

		
		List vector = new Vector();
		arrayList.add("Ganga");
		arrayList.add("Hally");
		arrayList.add(2);
		arrayList.add(true);
		
		for(Object obj:arrayList) {
			System.out.println(obj);
			
			if(obj instanceof Integer) {
				Integer result = (Integer)obj;
				result = result +9;
				System.out.println("Result ="+result);
			}
		}
		
		
		
	}

}
