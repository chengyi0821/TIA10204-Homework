package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void copyFile(File inputFile, File outputFile) {
		try {
			FileInputStream fis = new FileInputStream(inputFile);
			BufferedInputStream in = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(outputFile);
			BufferedOutputStream out = new BufferedOutputStream(fos);
			int a;
			while ((a = in.read()) != -1) {
				out.write(a);
				out.flush();
			}
			out.close();
			fos.close();
			in.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
