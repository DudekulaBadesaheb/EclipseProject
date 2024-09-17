package oops.files.demo;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		String filePath = "D:\\Documents\\java.txt";
		File file = null;
		try {
			file = new File(filePath);
			if (file.exists()) {// checking whether file is there or not
				if (file.delete()) 
				{
					System.out.println("file_deleted_at:" + filePath);
				} 
				else 
				{
					System.out.println("file_not_deleted_at:" + filePath);
				}
		    
			}
			else 
			{
				System.out.println("file_not_found_at"+filePath);
			}
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
