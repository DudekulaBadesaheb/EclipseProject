package oops.files.demo;

import java.io.File;
import java.util.Scanner;

public class ReadFromFileUsingScanner {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\Documents\\java.txt";
		File file = null;
		Scanner sc = null;
		String text = "";
		try {
			file = new File(filePath);
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				text = text + sc.nextLine() + "\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		System.out.println(text);
	}

}
