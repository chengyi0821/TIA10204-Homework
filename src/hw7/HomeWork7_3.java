package hw7;

import java.io.*;

public class HomeWork7_3 {
	public static void main(String[] args) {
		File inputFile = new File("File/photo.jpg");
		File outputFile = new File("File/photo1.jpg");
		CopyFile.copyFile(inputFile, outputFile);
	}
}
