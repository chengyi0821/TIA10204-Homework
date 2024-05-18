package hw8;

import java.util.Iterator;
import java.util.TreeSet;

public class HomeWork8_2 {
	public static void main(String[] args) {
		TreeSet<Train> set = new TreeSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		System.out.println("=================foreach=================");
		for (Train train : set) {
			train.getAll();
		}
		System.out.println("=================迭代器=================");
		Iterator<Train> it= set.iterator();
		while(it.hasNext()) {
			Train train = it.next();
			train.getAll();
			} 
		System.out.println("=================for迴圈=================");
		Train[] tArray = set.toArray(new Train[0]); //將TreeSet轉成Array
        for (int i = 0; i < tArray.length; i++) {
            tArray[i].getAll();						
        }
	}
}
