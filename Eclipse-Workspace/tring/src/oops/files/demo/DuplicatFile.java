package oops.files.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DuplicatFile {

	public static void main(String[] args) throws Exception {
		String sourceFilepath = "D:\\Documents\\ox.jpg";
		String targetFilepath = "D:\\Documents\\ox-new.jpg";
		duplicateFile(sourceFilepath, targetFilepath);

	}

	public static void duplicateFile(String sourceFilepath, String targetFilepath) throws Exception {
		File sourceFile = null;
		File targetFile = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			sourceFile = new File(sourceFilepath);
			targetFile = new File(targetFilepath);
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(targetFile);

			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("Copied_From_File" + sourceFilepath);
			System.out.println("Duplicate_File_from" + targetFilepath);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			fos.close();
		}
	}

}
