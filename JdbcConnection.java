package com.exercise.exercise.exercise1;
import java.sql.*;
import java.util.Scanner;


public class JdbcConnection {
	static final Scanner obj=new Scanner(System.in);
	public static void update(Connection connection,int software_id) throws SQLException {
		PreparedStatement pstmt = connection.prepareStatement("update  softwaredetails set  stocks=? where software_id="+software_id);
		pstmt.setInt(1,150);
		
		pstmt.executeUpdate();
		
	}
	
	public static void addSoftwareDetails(Connection connection,SoftwareDetails  obj) throws SQLException {
		PreparedStatement pstmt = connection.prepareStatement("insert into softwaredetails values(?,?,?,?,?,?,?) ");
		pstmt.setString(1,obj.getsoftwarename());
		pstmt.setInt(2,obj.getsoftware_id());
		pstmt.setString(3,obj.getsoftwaredescription());
		pstmt.setInt(4,obj.getprice());
		pstmt.setInt(5, obj.getrating());
		pstmt.setString(6,obj.getcompanyname());
		pstmt.setInt(7, obj.getstock());
				
		int record=pstmt.executeUpdate();
		System.out.println(record);
	
	}
	
	public static void main(String[] args)throws SQLException, Exception{
		Connection connection=null;
		final  SoftwareDetails addobj =new SoftwareDetails();
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"6301269746");
		System.out.println("enter 1 for addsoftwaredetails");
		System.out.println("enter 2 for updatesoftware");
		System.out.println("enter 3 for viewsoftware");
		System.out.println("enter 4 for deletesoftware");
		//static final Scanner obj=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = obj.nextByte();
		switch(choice) {
		case 1:
			SoftwareDetails obj =  getSoftwareDetails ();
			if(connection!=null) {
			addSoftwareDetails(connection,obj);//method call
			}
			else {
				System.out.println("check your connection");
			}
			
			
			break;
		case 2:
	
			//SoftwareDetails obj1=getupdate();
			update(connection,125);
			
			break;
		case 3:
			break;
		case 4:
			break;
		
		default:
			System.out.println("enter proper choice");
			connection.close();
		
		
		}

	}
	private static SoftwareDetails getSoftwareDetails() {	
		SoftwareDetails user = new SoftwareDetails ();
		System.out.println("enter softwarename");
		user.setsoftwarename(obj.next());
		System.out.println("enter software_id");
		user.setsoftware_id(obj.nextInt());
		System.out.println("enter softwaredescription ");
		user.setsoftwaredescription(obj.next());
		System.out.println("enter price");
		user.setprice(obj.nextInt());
		System.out.println("enter companyname");
		user.setcompanyname(obj.next());
		System.out.println("enter rating");
		user.setrating(obj.nextInt());
		System.out.println("enter stock");
		user.setstock(obj.nextInt());
		return user;

	}

		 
		
	}
	
	
		





