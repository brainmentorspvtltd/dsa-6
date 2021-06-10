import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) throws IOException {
		String path = "/Users/amit/Documents/dit-dsa/filehandling/src/ReadAFile.java";
		File file = new File(path);
		if(file.exists()) {
			FileInputStream fs = new FileInputStream(file);
			//fs.mark(100);
			//fs.skip(20);
			byte b[] = fs.readAllBytes();
			String s = new String(b);
			System.out.println(s);
			fs.close();
	
		}
		else {
			System.out.println("File Not exist");
		}

	}

}
