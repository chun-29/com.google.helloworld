/**
 * @program: usermanagerment
 * @Description: Encapsulate user name and password
 * @author: chun
 * @date: 2019-10-30
 */
package com.google.user;

/**
 * @author Administrator
 * @date   2019-10-30
 */
public class User {
	
	//��װ�û���
	private String username;
	//��װ�û�����
	private String userpassword;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUserpassword() {
		return userpassword;
	}
	
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
}
