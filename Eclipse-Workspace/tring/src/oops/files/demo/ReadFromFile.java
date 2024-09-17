package oops.files.demo;

import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {
		String filepath = "D:\\Documents\\java.txt";
		FileReader fr = null;
		// we can give exception as try, catch or
		// public static void main(String[] args) throws Exception {
		try {
			fr = new FileReader(filepath);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);

			}
			fr.read();
			System.out.println();
			System.out.println("Value of i:" + i);
			// System.out.println((char)fr.read()); --prints only one char
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
	}
}
