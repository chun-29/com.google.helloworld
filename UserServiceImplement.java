/**
 * @program: usermanagerment
 * @Description: Calling interface to realize user login
 * @author: chun
 * @date: 2019-10-30
 */
package com.google.user;

/**
 * @author Administrator
 * @date   2019-10-30
 */
//����UserService�ӿ�
public class UserServiceImplement implements UserService {

	/* (non-Javadoc)
	 * @see com.google.user.UserService#login(com.google.user.User)
	 */
	@Override
	//ʵ���û���¼
	public int login(User user) {
		// TODO Auto-generated method stub
		//����3��ʾ�û��쳣
		int result = 3;
		if(DefaultValue.USERNAME.equals(user.getUsername())) {
			if(DefaultValue.USERPASSWORD.equals(user.getUserpassword())){
				//����1��¼�ɹ�
				result = 1;
				System.out.println("welcome" + user.getUsername());
			}else {
				//����2ע���û�
				result = 2;
				System.out.println("password incorrect");
			}
		}else {
			//����0�˳���¼ע�����
			result = 0;
			System.out.println("username incorrect");
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.google.user.UserService#register(com.google.user.User)
	 */
	@Override
	//�û�ע��
	public int register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
