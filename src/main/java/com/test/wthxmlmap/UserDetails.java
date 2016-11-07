package com.test.wthxmlmap;

import java.io.Serializable;

public class UserDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer userId;
	private String userCode;
	private String userName;

	public UserDetails()
	{	
	}
	/*Generate Constructors*/
	public UserDetails(String userCode, String userName) {
		super();
		this.userCode = userCode;
		this.userName = userName;
	}

	/*Generate getters and Setters*/
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
