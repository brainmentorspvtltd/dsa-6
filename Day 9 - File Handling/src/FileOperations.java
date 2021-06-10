import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;


//class MyFilter implements FilenameFilter{
//
//	@Override
//	public boolean accept(File dir, String name) {
//		// TODO Auto-generated method stub
//		return name.endsWith(".mp3");
//	}
//	
//}
public class FileOperations {

	public static void main(String[] args) throws IOException {
		// windows path c:\\abcd\\xyz
		//String path = "/Users/amit/Documents/files/abcd.txt";
		//File file = new File(path);
		//String result =file.createNewFile()?"File Created":"Not Created";
		//System.out.println(result);
//		if(file.exists()) {
//			System.out.println("Exist and Delete");
//			//file.delete();
//			//file.renameTo(new File("/Users/amit/Documents/files/xyz.txt"));
//		}
//		else {
//			System.out.println("Not Exist");
//			String result =file.createNewFile()?"File Created":"Not Created";
//			System.out.println(result);
//		}
//		String path = "/Users/amit/Documents/files/aaa/bbb/ccc/ddd";
//		File file = new File(path);
//		file.mkdirs();
		
		File file =new File("/Users/amit/Documents/files");
		//String files [] = file.list();
		//File files [] = file.listFiles(new MyFilter());
		File files[] = file.listFiles((dir,name)->name.endsWith(".mp3"));
		for(File f: files) {
			if(f.isDirectory()) {
			System.out.println("<DIR>" +f.getName());
			}
			else
			if(f.isFile()) {
				if(f.isHidden()) {
					System.out.println("<HIDDEN> "+f.getName());
				}
				else {
					DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
					String formattedDate = df.format(new Date(f.lastModified()));
					System.out.println("<FILE> "+f.getName() + "   TIME "+formattedDate);
				}
			}
			//f.delete();
			//f.renameTo(new File("/Users/amit/Documents/files/"))
		}
//		for(String f: files) {
//			System.out.println(f);
//		}
		
		
		

	}

}
