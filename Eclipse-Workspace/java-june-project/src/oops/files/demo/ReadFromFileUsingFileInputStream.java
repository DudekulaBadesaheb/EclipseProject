package oops.files.demo;

import java.io.File;
import java.io.FileInputStream;

// FileInputStream class

public class ReadFromFileUsingFileInputStream {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\Documents\\WriteUsingFOS.txt";
		String text = readFile(filePath);
		System.out.println(text);
	}

	public static String readFile(String filePath) throws Exception {
		File file = null;
		FileInputStream fis = null;
		String text = "";
		try {
			file = new File(filePath);
			fis = new FileInputStream(file);
			int data;
			while ((data = fis.read()) != -1) {
				text = text + (char) data;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		return text;
	}
}
