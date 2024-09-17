package oops.files.demo;

import java.io.FileWriter;

public class WriteToFile {
	public static void main(String[] args) throws Exception {
		String filepath = "D:\\Documents\\java.txt";
		FileWriter fw = null;
		String text = "Hello World";
		try {
			fw = new FileWriter(filepath);
			fw.write(text);
			System.out.println("WROTE_TO_FILE AT" + filepath);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			fw.close();
		}

	}

}
