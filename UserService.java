/**
 * @program: usermanagerment
 * @Description: Establish user login and registration page
 * @author: chun
 * @date: 2019-10-30 
 */
package com.google.user;

/**
 * @author Administrator
 * @date   2019-10-30
 */
//�û��ӿ�
public interface UserService {
	
	//0-�û������ڣ�1-��¼�ɹ���2-�������3-��¼�쳣
	public int login(User user);
	
	//ע��
	public int register(User user);
}
