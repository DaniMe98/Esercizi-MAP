
import java.sql.SQLException;


import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;



public class cazz {
		
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
			// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/sa";
		String user_id="root";
		String psw="******";
		
		try {
			try {
				
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				
			}catch(ClassNotFoundException e) {
				System.out.println("Driver not found");
			}
			
			Connection conn= DriverManager.getConnection(url,user_id,psw);
			Statement stm= conn.createStatement();
			ResultSet res= stm.executeQuery("SELECT * from country");
			
			while(res.next()) {
				
				System.out.println("Country: "+res.getString("country"));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
