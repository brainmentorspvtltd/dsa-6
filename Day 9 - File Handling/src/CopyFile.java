import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Downloads/graphprim.mp4";
		String path2 = "/Users/amit/Downloads/graphprimcopy.mp4";
		final int EOF = -1;
		File file = new File(path);
		System.out.println("Copy Start");
		if(file.exists()) {
			FileInputStream fs = new FileInputStream(file);
			BufferedInputStream bs = new BufferedInputStream(fs);
			FileOutputStream fo = new FileOutputStream(path2);
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			long startTime = System.currentTimeMillis();
			int singleByte = bs.read();
			while(singleByte!=EOF) {
				bo.write(singleByte);
				singleByte = bs.read();
				
			}
			long endTime = System.currentTimeMillis();
			System.out.println((endTime- startTime) + "ms");
			//byte b[] = fs.readAllBytes();
			
			//fo.write(b);
			bs.close();
			bo.close();
			fs.close();
			fo.close();
			System.out.println("Copy Done...");
	
		}
		else {
			System.out.println("File Not exist");
		}
	}

}
