package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import Connection.DatabaseConnection;



@WebService
public class Service {	
	DatabaseConnection db=new DatabaseConnection();
	
	public String signUp(String username, String pwd)
	{
		System.out.println("Inside Signup");
		String result;
		result = db.signUp(username,pwd);
		return result;
	}	
	

	@WebMethod
	public String signIn(String username, String pwd)
	{
		System.out.println("Inside Sign in ---->");
		String result;
		result = db.getMemberDetails(username,pwd);
		System.out.println(" Sending the Last Login date from the servie ------>"+result);
		return result;
	}
	
}
