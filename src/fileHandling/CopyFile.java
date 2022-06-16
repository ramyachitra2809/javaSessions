package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		String inPath="C:\\Users\\HP\\Downloads\\FileHandling\\streamer.text";
		String outPath="C:\\Users\\HP\\Downloads\\FileHandling\\Copy.text";
		File in = new File(inPath);
		File out= new File(outPath);
		try {
		FileInputStream fis = new FileInputStream(in);
		FileOutputStream fos = new FileOutputStream(out);
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
			fos.write(i);
		}
		if(fis!=null) {
			fis.close();
		}
		if(fos!=null) {
			fos.close();
		}

	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
