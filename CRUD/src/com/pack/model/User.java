package com.pack.model;

public class User {
	private int id;
private String username;
private String password;
private String email;
private String firstname;
private String lastname;
private String address;
private String contactnumber;
private String createdate;
private String updatedate;
private String createdby;
private String updatedby;
private String role_roleid;

public String getCreatedate() {
	return createdate;
}
public void setCreatedate(String createdate) {
	this.createdate = createdate;
}
public String getUpdatedate() {
	return updatedate;
}
public void setUpdatedate(String updatedate) {
	this.updatedate = updatedate;
}
public String getCreatedby() {
	return createdby;
}
public void setCreatedby(String createdby) {
	this.createdby = createdby;
}
public String getUpdatedby() {
	return updatedby;
}
public void setUpdatedby(String updatedby) {
	this.updatedby = updatedby;
}
public String getRole_roleid() {
	return role_roleid;
}
public void setRole_roleid(String role_roleid) {
	this.role_roleid = role_roleid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContactnumber() {
	return contactnumber;
}
public void setContactnumber(String contactnumber) {
	this.contactnumber = contactnumber;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password="
			+ password + ", email=" + email + ", firstname=" + firstname
			+ ", lastname=" + lastname + ", address=" + address
			+ ", contactnumber=" + contactnumber + ", createdate=" + createdate
			+ ", updatedate=" + updatedate + ", createdby=" + createdby
			+ ", updatedby=" + updatedby + ", role_roleid=" + role_roleid + "]";
}



}
