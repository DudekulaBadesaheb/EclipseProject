package oops.files.demo;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		String filePath = "D:\\Documents\\java.txt";
		File file = null;
		try {
			file = new File(filePath);

			if (file.exists()) { // checking whether file is there or not ?
				// delete file code here
				if (file.delete()) {
					System.out.println("FILE_DELETED_AT: " + filePath);
				} else {
					System.out.println("FILE_NOT_DELETED_AT: " + filePath);
				}
			} else {
				System.out.println("FILE_NOT_FOUND_AT: " + filePath);
			}

		} // end try
		catch (Exception e) {
			e.printStackTrace();
		} // end catch

	}

}
