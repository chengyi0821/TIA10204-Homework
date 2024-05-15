package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork7_1 {
	public static void main(String[] args) {
		String str;
		int lineNumber = 0;
		int charNumber = 0;
		try {
			File fi = new File("File/Sample.txt");
			FileReader readerFile = new FileReader("File/Sample.txt");
			BufferedReader in = new BufferedReader(readerFile);
			while ((str = in.readLine()) != null) {
				System.out.println(str);
				lineNumber++;
				charNumber += str.length();
			}
			charNumber += lineNumber;
			System.out.println("========================================================");
			System.out.println(fi.length() + "個位元組" + charNumber + "個字元" + lineNumber + "列資料");
			in.close();
			readerFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
