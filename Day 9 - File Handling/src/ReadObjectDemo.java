import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("/Users/amit/Documents/dit-dsa/filehandling/src/user.dat");
		ObjectInputStream os = new ObjectInputStream(fs);
		User user = (User)os.readObject();
		System.out.println(user);
		os.close();
		fs.close();
	}

}
