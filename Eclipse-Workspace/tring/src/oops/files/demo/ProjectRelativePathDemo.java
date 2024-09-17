package oops.files.demo;

import java.io.File;
import java.io.FileReader;

public class ProjectRelativePathDemo {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filepath = projectPath + File.separator + "src" + File.separator + "oops" + File.separator + "files"
				+ File.separator + "demo" + File.separator + "text.txt";
		FileReader fr = null;
		// we can give exception as try, catch or
		// public static void main(String[] args) throws Exception {
		try {
			fr = new FileReader(filepath);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);

			}
			fr.read();
			System.out.println();
			System.out.println("Value of i:" + i);
			// System.out.println((char)fr.read()); --prints only one char
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
