package exceptionhandlingdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyDemo {
	
	int dbAdd(int x) throws SQLException {
		Connection con = null;
		try {
			System.out.println("Connection Create");
			
			if(x>2) {
			System.out.println("Logic");
			System.exit(0);
			//return 0;
			}
			else {
			
			
			System.out.println("Some other logic"); 
			}
		
			
			con = DriverManager.getConnection("");
			// DB Query (SQL)
			
		}
		finally {
			// Resource Clean Up
			System.out.println("Finally Call");
			if(con!=null) {
				con.close();
			}
		}
		return 0;
	}
	
	void bl() throws SQLException {
		dbAdd(10);
	}
	
	void view() {
		try {
		bl();
		}
		catch(SQLException e) {
			System.out.println("Something went Wrong..... Contact to System Admin" );
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FinallyDemo fi = new FinallyDemo();
		fi.view();

	}

}
