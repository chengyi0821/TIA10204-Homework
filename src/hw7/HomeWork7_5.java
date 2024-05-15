package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HomeWork7_5 extends HomeWork7_4{
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("File/data/Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while(true) {
				((Animal) ois.readObject()).speak();
			}
		}catch(EOFException e) {
			System.out.println("資料傳輸完畢!");
		}
		ois.close();
		fis.close();
	}
}
