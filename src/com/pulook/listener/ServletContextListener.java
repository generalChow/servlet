/**
 * 
 */
package com.pulook.listener;

import javax.servlet.ServletContextEvent;

/**实现了ServletContextListener的监听器在服务器启动的时候，会使用contextInitialized这个方法
 * 监听到服务器关闭的时候，会启动contextDestroyed这个方法
 * @author 周大帅	
 * @email 463734522@qq.com
 * 2013年10月10日
 */
public class ServletContextListener implements javax.servlet.ServletContextListener{

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("这是一个ServletContex监听");  
        System.out.println("服务器即将关闭，保存系统数据...");  
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("这是一个ServletContex监听");  
        System.out.println("服务器启动，初始化系统参数...");  
	}

}
