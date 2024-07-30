package bank;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;


public class co {
	Connection connection;
	Statement statement;
	public co() {
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3360/bankSystem","root","root123");
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}	
		}

}
