package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		String path = "/Users/amit/Documents/dit-dsa/filehandling/abcd.txt";
		FileOutputStream fo = new FileOutputStream(path);
		fo.write("Hello How are You".getBytes());
		fo.close();
		System.out.println("Done...");
		

	}

}
