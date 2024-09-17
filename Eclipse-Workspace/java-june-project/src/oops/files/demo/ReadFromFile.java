package oops.files.demo;

import java.io.FileReader;

// FileReader class

public class ReadFromFile {

	public static void main(String[] args) {
		String filePath = "D:\\Documents\\java.txt";

		FileReader fr = null;

		try {
			fr = new FileReader(filePath);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println();
			System.out.println("Value of i: " + i);
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fr.close();
		}

	}

}
