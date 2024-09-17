package oops.files.demo;

import java.io.FileWriter;

// We can use FileWriter class to create a object of FileWriter class 
// and use write() method

public class WriteToFile {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\Documents\\java.txt";
		FileWriter fw = null;
		String text = "Hello World\nSun Shine";
		try {
			fw = new FileWriter(filePath);
			fw.write(text);
			System.out.println("WROTE_TO_FILE_AT: " + filePath);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fw.close();
		}

	}
}
