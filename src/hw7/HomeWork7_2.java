package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeWork7_2 {
	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("File/Data.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		for (int i = 1; i <= 10; i++) {
			int number = (int) (Math.random() * 1000) + 1;
			pw.print(number + "\t");
		}
		pw.println();
		pw.close();
		bw.close();
		fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
