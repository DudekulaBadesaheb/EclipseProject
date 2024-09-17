package oops.files.demo;

import java.io.FileOutputStream;

public class WriteToFileUsingFileOutputStream {

	public static void main(String[] args) throws Exception {
		String filepath = "D:\\Documents\\WriteUsingFOS.txt";
		String text = "You are the light of his life.\nAnees Fathima";
		writeToFile(filepath, text);

	}

	public static void writeToFile(String filepath, String text) throws Exception {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filepath);
			byte[] textArray = text.getBytes();
			fos.write(textArray);
			System.out.println("WROTE_TO_FILE_AT:" + filepath);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			fos.close();
		}

	}

}
