package com.pack.service;

import java.sql.SQLException;
import java.util.List;

import com.pack.dao.Dao;
import com.pack.model.User;

public class UserService {
Dao d=new Dao();
	
	public int login(User m) throws SQLException {
		// TODO Auto-generated method stub
		return d.loginvalidate(m);
	}
	public void Update(User m) throws SQLException {
		d.Updated(m);
	}
	public void delete(User u) throws SQLException {
		d.deleted(u);
	}
	public List<Object> list() throws SQLException {
		return d.listed();
		
	}
	public void adminUpdate(User m) throws SQLException {
		  d.adminUpdate(m);
		
	}
	
	public void adminDelete(User q) throws SQLException {
		d.adminDelete(q);
	}
	public void adduser(User z) throws SQLException {
		  d.adduser(z);
		
	}
	public void inserting(User m) throws SQLException {
		 d.insert(m);
		 
	}

}
