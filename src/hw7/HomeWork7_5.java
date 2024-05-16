package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HomeWork7_5 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("File/data/Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
			}
		} catch (EOFException e) {
			System.out.println("資料傳輸完畢!");
		}
		
		ois.close();
		fis.close();
	}
}
