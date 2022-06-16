package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ReadFile {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\HP\\Downloads\\FileHandling\\streamer.text";
		File f = null;
		
		//using FileInputStream
		try {
			f= new File(path);
			FileInputStream fip = new FileInputStream(f);
			int i=0;
			while((i=fip.read())!=-1) {
				System.out.print((char) i);
			}
			fip.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("********");
		//using bufferedreader
		BufferedReader br= null;
		try {
			br= new BufferedReader(new FileReader(path));
			int i=0;
			while((i=br.read())!=-1) {
				System.out.print((char) i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("********");
		
		//using filereader
		FileReader fr=null;
		try {
			fr= new FileReader(path);
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char) i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("********");
		//using scanner
		Scanner sc=null;
		try {
			f= new File(path);
			sc= new Scanner(f);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		//using Nio Package
		Path newpath= Paths.get(path);
		try {
		List<String> li=Files.readAllLines(newpath);
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
