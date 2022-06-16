package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateNewFile {

	public static void main(String[] args) {

		// using file
		String path = "C:\\Users\\HP\\Downloads\\FileHandling\\sample.text";

		try {
			File f = new File(path);
			boolean flag = f.createNewFile();
			if (flag) {
				System.out.println("File got created");
			} else {
				System.out.println("File already present");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		//using Fileoutputstream and scanner
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file name along with location path");
		String path1= sc.nextLine();
		System.out.println("Enter the content");
		String content= sc.nextLine();
		try {
			FileOutputStream fos = new FileOutputStream(path1);
			byte b[] = content.getBytes();
			fos.write(b);
			fos.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//using java Nio package
		
		try {
		Path path2= Paths.get("C:\\Users\\HP\\Downloads\\FileHandling\\Nio.text");
		Path path3= Files.createFile(path2);
		System.out.println("New file created at"+ path3);
		
	}
		catch(Exception e ) {
			e.printStackTrace();
		}
}
}
