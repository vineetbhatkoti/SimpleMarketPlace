package Connection;

import java.sql.*;
import java.text.SimpleDateFormat;


import dto.Member;


public class DatabaseConnection {
	
	Connection con = null;
	static ResultSet rs;
    Statement stmt = null;
	
	public DatabaseConnection(){		
		try {			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","bell123");
				stmt = con.createStatement();
				if(!con.isClosed())
					System.out.println("Successfully Connected!!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public String signUp(String userName, String pwd){
		String result = "";
		Member member=new Member();
		int rowcount;
		try {
			String query = "Insert into Customer (username, password) values ('" + userName + "', '" + pwd + "')";
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				System.out.println("Insert Successful");
			}
			else{
				result="false: The data could not be inserted in the database.";
			}
			String query1 = "select * from member where userName = '" + userName.trim().toLowerCase() + "'";
			ResultSet r = stmt.executeQuery(query);
			while(r.next()) {
				member.setMemberId(r.getInt("memberId"));
				member.setEmail(r.getString("email"));
				member.setFirstName(r.getString("firstname"));
				member.setLastName(r.getString("lastname"));
				member.setPassword(r.getString("password"));
				member.setAddress(r.getString("address"));
				member.setPhone(r.getString("phone"));
			}
			java.util.Date dt = new java.util.Date();
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String currentTime = sdf.format(dt);
			String query2="insert into login values(null,"+member.getMemberId() +",'"+currentTime+"')";
			int rowcount4=stmt.executeUpdate(query2);
			System.out.println(" The rowcount after the login date in login "+rowcount4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public String getMemberDetails(String userName,String password)
	{
		int count=0;
		Timestamp lastLoginDate = null;
		String date=null;
		Member member=new Member();
		String query = "select * from member where userName = '" + userName.trim().toLowerCase() + "'";
		ResultSet r;
		try {
			r = stmt.executeQuery(query);
		
		while(r.next()) {
			count++;
			member.setMemberId(r.getInt("memberId"));
			member.setEmail(r.getString("email"));
			member.setFirstName(r.getString("firstname"));
			member.setLastName(r.getString("lastname"));
			member.setPassword(r.getString("password"));
			member.setAddress(r.getString("address"));
			member.setPhone(r.getString("phone"));
		}
		
		if(count==0)
		{
			return "false"; 
		}
		else{
		System.out.println(" The memeber id is from the get Member ====> "+member.getMemberId());
		
			String query1 = "select max(lastLoginDate) as lastLoginDate from login where memberId = '" + member.getMemberId() + "'";
			ResultSet r1  = stmt.executeQuery(query1);
			ResultSetMetaData meta = r1.getMetaData();
			 for (int index = 1; index <= meta.getColumnCount(); index++)
			 {
			    System.out.println("Column " + index + " is named " + meta.getColumnName(index));
			 }
			 
			while(r1.next())
			{
				lastLoginDate=r1.getTimestamp("lastLoginDate");
				System.out.println("The Last Login date is "+lastLoginDate);
			}
			date = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(lastLoginDate);
		
			java.util.Date dt = new java.util.Date();
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			String currentTime = sdf.format(dt);
			String query2="insert into login values(null,"+member.getMemberId() +",'"+currentTime+"')";
			int rowcount=stmt.executeUpdate(query2);
			System.out.println(" The rowcount after the login date in login "+rowcount);
			r.close();
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date ;
	}
	
	
	

}
