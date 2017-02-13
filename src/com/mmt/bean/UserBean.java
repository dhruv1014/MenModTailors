package com.mmt.bean;

/**
 * This is the class for User Details for login purpose
 * @author dmehta
 *
 */

public class UserBean {

	private int userId;			// user Id
	private String firstName;	// First Name of the user
	private String lastName;	// Last Name
	private int roleId;			// role id from class RoleServlet
	private String fullAddress;	// correspondence Address
	private boolean isActive;	// is User Active
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	
}
