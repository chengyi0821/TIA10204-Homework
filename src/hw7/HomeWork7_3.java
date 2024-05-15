package hw7;

import java.io.*;

public class HomeWork7_3 {
	public static void main(String[] args) {
		CopyFile copyFile = new CopyFile();
		File inputFile = new File("File/photo.jpg");
		File outputFile = new File("File/photo1.jpg");
		copyFile.copyFile(inputFile, outputFile);
	}
}
