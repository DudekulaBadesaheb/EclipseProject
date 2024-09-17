package oops.files.demo;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {

		String filePath = "D:\\Documents\\java.txt";
		 File file;
		try {
			 file = new File(filePath);
			if (file.createNewFile()) {
				System.out.println("FILE_CREATED_AT:" + filePath);

			} else {
				System.out.println("FILE_ALREADY_EXISTS_AT:" + filePath);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} 
	}

}
