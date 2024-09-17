package files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Filles {

	public static void main(String[] args) throws Throwable /* or IOException (or) Exception */ {
		File d = new File("D:\\Eclipse-Workspace\\7/resum.txt");
		System.out.println(d.getCanonicalPath());
		//System.out.println(d.getName());
		//System.out.println(Arrays.toString(d.listFiles()));
		//System.out.println(Arrays.toString(d.list()));
		//System.out.println(d.mkdirs());
		//System.out.println(d.mkdir()); 

		// System.out.println(d.createNewFile());
		// System.out.println(d.delete());
		// System.out.println(d.exists());

		/*if (d.exists())
			;
		d.delete();

		System.out.println(d.exists());*/

		// System.out.println(d.isHidden());
		/*System.out.println(d.canWrite());
		d.setWritable(true);
		System.out.println(d.canWrite());*/
		
	}

}
