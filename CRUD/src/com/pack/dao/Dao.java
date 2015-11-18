package com.pack.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





import com.pack.model.User;

public class Dao {


	public int loginvalidate(User m) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		int a = 1;
		Data d = new Data();
		String password = m.getPassword();
		String email = m.getEmail();
		conn = d.getConnection();
		//int role = 1;
		Statement stmt = (Statement) conn.createStatement();
		ResultSet rs = stmt
				.executeQuery("Select email,password,role_roleid from details");
		if (a == 1)
		{
		while (rs.next()) {
			String email1 = rs.getString("email");
			String pass = rs.getString("password");
			int roles = rs.getInt("role_roleid");
				if (email.equals(email1) && password.equals(pass)
						& 1 == roles) {
						a=a+2;
					return a;
				} else if (email.equals(email1) && password.equals(pass)
						&& 2 == roles) {
					a = a + 1;
				
				return a;}
			}

		
		}
		else if(a==1){
			return a;
		}
		conn.close();
		return a;
	}

	public void Updated(User m) throws SQLException {
		// TODO Auto-generated method stub
		//int a = 1;
		//if (a == 1) {

			String username = m.getUsername();
			String password = m.getPassword();
			String email = m.getEmail();
			String firstname = m.getFirstname();
			String lastname = m.getLastname();
			String address = m.getAddress();
			String contactnumber = m.getContactnumber();

			String updatedby = m.getEmail();

			Date today = new Date();
			String date = today.toString();
			Connection conn = null;
			Data d = new Data();

			conn = d.getConnection();
			Statement stmt = (Statement) conn.createStatement();

			
					
					String query = "UPDATE details SET username='" + username
							+ "',password='" + password + "',firstname='" + firstname
							+ "',lastname='" + lastname + "',address='" + address
							+ "',contactnumber='" + contactnumber + "',updatedby='"
							+ updatedby + "',updatedate='" + date + "' where email= '"
							+ email + "'";
			stmt.executeUpdate(query);
			//a = a + 1;
			conn.close();
		//}
		//return a;

	}

	public void deleted(User u) throws SQLException {
		// TODO Auto-generated method stub
		//int f=1;
		//if(f==1){
			Connection conn = null;
			String email = u.getEmail();
			Data d = new Data();
			conn = d.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			String query = ("DELETE from details  where email='" + email + "'");

			((java.sql.Statement) stmt).executeUpdate(query);
			conn.close();
		//}
	//	return f;
	}

	public List<Object> listed() throws SQLException {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<Object>();
		Connection conn = null;
		Data d = new Data();
		conn = d.getConnection();
		java.sql.Statement stmt = conn.createStatement();

		ResultSet rs = stmt
				.executeQuery("SELECT * from details ");
		while (rs.next()) {
			User m1 = new User();
			m1.setId(rs.getInt(1));
			m1.setUsername(rs.getString(2));
			m1.setPassword(rs.getString(3));
			m1.setEmail(rs.getString(4));
			m1.setFirstname(rs.getString(5));
			m1.setLastname(rs.getString(6));
			m1.setAddress(rs.getString(7));
			m1.setContactnumber((String) rs.getString(8));
			m1.setCreatedby(rs.getString(9));
			m1.setUpdatedby(rs.getString(10));
			m1.setCreatedate(rs.getString(11));
			m1.setUpdatedate(rs.getString(12));

			m1.setRole_roleid(rs.getString(13));
			list.add(m1);
		}
		return list;
	}

	public void adminUpdate(User m) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Connection conn = null;
		Data d = new Data();
		//int b=1;
		//if(b==1){
			
		
		Date today=new Date();
		
			conn = d.getConnection();
			String email = m.getEmail();
			
			String username=m.getUsername();
			
			String password = m.getPassword();
			
			String firstname = m.getFirstname();
			String lastname = m.getLastname();
			String address = m.getAddress();
			String contactnumber = m.getContactnumber();
			Statement stmt = (Statement) conn.createStatement();
		

			
		String query = "UPDATE details SET username='" + username
				+ "',password='" + password + "',firstname='"
				+ firstname+ "',lastname='" + lastname+ "',address='"
				+ address + "',contactnumber='"+contactnumber+"',updatedby='"+email+"',updatedate='"+today+"' where email= '"+email+"'";
		stmt.executeUpdate(query);
		//b=b+1;
		conn.close();
		//}
	//	return b;
		
	}

	public void adminDelete(User q) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Data d = new Data();
		
		
		
		//int c=1;
		//if(c==1)
	//	{
			conn = d.getConnection();
			String email = q.getEmail();
			System.out.println(email);
			conn = d.getConnection();
			Statement stmt = (Statement) conn.createStatement();
			String query = ("DELETE from details  where email='"
					+email + "'");
		
			 ((java.sql.Statement) stmt).executeUpdate(query);
			 conn.close();
		//	c=c+1;
		//}
		//return c;
		
	}

	public void adduser(User z) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String username = z.getUsername();
		String password = z.getPassword();
		String email = z.getEmail();
		String firstname = z.getFirstname();
		String lastname = z.getLastname();
		String address = z.getAddress();
		String contactnumber = z.getContactnumber();
		String createdby = z.getUsername();
		String updatedby = z.getEmail();
		int role=z.getId();
		Date today = new Date();
		String date = today.toString();
		Connection conn = null;
		Data d = new Data();
		//int role = 2;
		conn = d.getConnection();
		Statement stmt = (Statement) conn.createStatement();
		//int a = 1;
		//if (a == 1) {

			((java.sql.Statement) stmt)
					.executeUpdate("insert into details (username,password,email,firstname,lastname,address,contactnumber,createdby,updatedby,createdate,updatedate,role_roleid) values ('"
							+ username
							+ "','"
							+ password
							+ "','"
							+ email
							+ "','"
							+ firstname
							+ "','"
							+ lastname
							+ "','"
							+ address
							+ "','"
							+ contactnumber
							+ "','"
							+ createdby
							+ "','"
							+ updatedby
							+ "','"
							+ date
							+ "','" + date + "','" + role + "')");
			conn.close();
			
		}
		//return a;
		
		
	//}

	public void insert(User m) throws SQLException {
		// TODO Auto-generated method stub
		String username = m.getUsername();
		String password = m.getPassword();
		String email = m.getEmail();
		String firstname = m.getFirstname();
		String lastname = m.getLastname();
		String address = m.getAddress();
		String contactnumber = m.getContactnumber();
		String createdby = m.getUsername();
		String updatedby = m.getEmail();
		//int role=m.getId();
		Date today = new Date();
		String date = today.toString();
		Connection conn = null;
		Data d = new Data();
		int role = 2;
		conn = d.getConnection();
		Statement stmt = (Statement) conn.createStatement();
		int a = 1;
		if (a == 1) {

			((java.sql.Statement) stmt)
					.executeUpdate("insert into details (username,password,email,firstname,lastname,address,contactnumber,createdby,updatedby,createdate,updatedate,role_roleid) values ('"
							+ username
							+ "','"
							+ password
							+ "','"
							+ email
							+ "','"
							+ firstname
							+ "','"
							+ lastname
							+ "','"
							+ address
							+ "','"
							+ contactnumber
							+ "','"
							+ createdby
							+ "','"
							+ updatedby
							+ "','"
							+ date
							+ "','" + date + "','" + role + "')");
			conn.close();
			
		}
		
	
		
		
		
		
	}

}
