package oops.files.demo;

import java.io.File;
import java.io.FileReader;

public class ProjectRelativePathDemo {

	public static void main(String[] args) throws Exception {

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath = projectPath + File.separator + "src" + File.separator + "oops" + File.separator + "files"
				+ File.separator + "demo" + File.separator + "test.txt";

		FileReader fr = null;

		try {
			fr = new FileReader(filePath);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println();
			System.out.println("Value of i: " + i);
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fr.close();
		}

	}

}
