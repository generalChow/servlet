/**
 * 
 */
package com.pulook.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.pulook.model.OnlineUser;

/**
 * @author �ܴ�˧	
 * @email 463734522@qq.com
 * 2013��10��9��
 */
public class MyListener implements HttpSessionListener {

	//private static int count;
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		//count++;//��������˵�Ϳ���ͳ�����������ˣ�����û�з�Ӧ
		OnlineUser.setCount((OnlineUser.getCount()+1));
		System.out.println("��������ʼ");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}

}
