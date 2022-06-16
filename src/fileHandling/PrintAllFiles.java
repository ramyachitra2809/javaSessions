package fileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintAllFiles {

	public static void main(String[] args) {
		String path ="C:\\Users\\HP\\Downloads";
		File f = new File(path);
		File dir[]=f.listFiles();
		Arrays.sort(dir);
		for(File e : dir) {
			if(e.isFile()) {
				System.out.println("file=  "+e.getName());
			}else if(e.isDirectory()) {
				System.out.println("directory=  "+e.getName());
			}
			else {
				System.out.println("unknown=  "+e.getName());
			}
		}


	}

}
