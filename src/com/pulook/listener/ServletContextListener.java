/**
 * 
 */
package com.pulook.listener;

import javax.servlet.ServletContextEvent;

/**ʵ����ServletContextListener�ļ������ڷ�����������ʱ�򣬻�ʹ��contextInitialized�������
 * �������������رյ�ʱ�򣬻�����contextDestroyed�������
 * @author �ܴ�˧	
 * @email 463734522@qq.com
 * 2013��10��10��
 */
public class ServletContextListener implements javax.servlet.ServletContextListener{

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("����һ��ServletContex����");  
        System.out.println("�����������رգ�����ϵͳ����...");  
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("����һ��ServletContex����");  
        System.out.println("��������������ʼ��ϵͳ����...");  
	}

}
