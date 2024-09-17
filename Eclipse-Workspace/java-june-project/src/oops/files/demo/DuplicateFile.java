package oops.files.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DuplicateFile {
	public static void main(String[] args) throws Exception {
		String sourceFilePath = "D:\\Documents\\java.png";
		String targetFilePath = "D:\\Documents\\java-new.png";
		duplicateFile(sourceFilePath, targetFilePath);
	}

	public static void duplicateFile(String sourceFilePath, String targetFilePath) throws Exception {
		File sourceFile = null;
		File targetFile = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			sourceFile = new File(sourceFilePath);
			targetFile = new File(targetFilePath);
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(targetFile);
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("COPIED_FILE_FROM: " + sourceFilePath);
			System.out.println("DUPLICATED_FILE_TO: " + targetFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			fos.close();
		}
	}

}
