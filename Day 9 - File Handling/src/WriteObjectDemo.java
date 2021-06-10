import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable{
	String name;
	String phone;
	String email;
	transient String password;
	public User(String name, String phone, String email, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
public class WriteObjectDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "";
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/dit-dsa/filehandling/src/user.dat");
		User user =new User("amit","2222","amit@yahoo.com", "a1111");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(user);
		os.close();
		fo.close();
		System.out.println("Done...");
		
	}

}
