package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork8_1 {
	public static void main(String[] args) {
		List<Object> data = new ArrayList<>();
		
		data.add(new Integer(100));
		data.add(new Double(3.14));
		data.add(new Long(21L));
		data.add(new Short("100"));
		data.add(new Double(5.1));
		data.add("Kitty");
		data.add(new Integer(100));
		data.add(new Object());
		data.add("Snoppy");
		data.add(new BigInteger("1000"));
		
		System.out.println("======================集合物件的所有元素====================");
		for(Object obj : data)
			System.out.print(obj + " ");
		
		System.out.println("\n======================foreach====================");
		for(Object obj : data) 
			if(!(obj instanceof Number))
			System.out.print(obj + " ");
		
		System.out.println("\n======================for迴圈====================");
		for(int i = 0;i < data.size() ; i++) 
			if(!(data.get(i) instanceof Number))
			System.out.print(data.get(i) + " ");
		
		System.out.println("\n======================Iterator====================");
		Iterator iterator = data.iterator();
		while(iterator.hasNext()) {
				Object obj = iterator.next();
				if(!(obj instanceof Number))
					System.out.print(obj+" ");
		}
	}
}
