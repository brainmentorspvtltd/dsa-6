
public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name = "Amit";
//		name += "Srivastava"; // create new string  (immutable)
//		String sql = "select * from product";
//		sql += "where price>20000";
//		sql+="and del='cashon'";
//		sql+=" and brand = 'samsung'";
		
		//StringBuffer sql = new StringBuffer("select * from product");
		//sql.append(" where price>20000").append(" and del='cashon' ").append(" and brand = 'samsung'");
		StringBuilder sb = new StringBuilder(); // jdk 1.5
		//StringBuffer sb = new StringBuffer(100); 
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.ensureCapacity(200);
		//sb.append("Amit Srivastava Java");
		sb.append("ghdfkjghfdkjghjkfdhgkjhjfkdghjkhfdjkghkjfdhgkhfkjgkjfdhgkfhdgk");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("ddd");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
	}

}
