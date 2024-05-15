package hw7;

import java.io.*;

public class HomeWork7_4 {
	public static void main(String[] args) throws Exception {
		
		File data = new File("File/data");
		
		if (!data.isDirectory()) {
			data.mkdir();
		}
		
		File file = new File("File/data/Object.ser");
		
		Animal dog1 = new Dog("dog1");
		Animal dog2 = new Dog("dog2");
		Animal cat1 = new Cat("cat1");
		Animal cat2 = new Cat("cat2");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		
		oos.close();
		fos.close();
	}
}

