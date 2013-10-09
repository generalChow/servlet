/**
 * 
 */
package com.pulook.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.pulook.model.OnlineUser;

/**
 * @author 周大帅	
 * @email 463734522@qq.com
 * 2013年10月9日
 */
public class MyListener implements HttpSessionListener {

	//private static int count;
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		//count++;//这样按理说就可以统计在线人数了，可是没有反应
		OnlineUser.setCount((OnlineUser.getCount()+1));
		System.out.println("监听器开始");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("监听器结束");
	}

}
