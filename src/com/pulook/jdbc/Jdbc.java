/**
 * 
 */
package com.pulook.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 周大帅
 * @email 463734522@qq.com 2013年10月9日
 */
public class Jdbc {
	private Connection connection;

	public Connection getConnection() {
		return connection;
	}

	public Jdbc() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		this.connection = DriverManager
				.getConnection(
						"jdbc:mysql://localhost:3306/springmvc?useUnicode=true&characterEncoding=utf-8",
						"root", "root");
	}
	
	public void saveTest() throws SQLException{
		String sql = "insert into user(name,age) values(?,?)";
		PreparedStatement ps = this.connection.prepareStatement(sql);
		ps.setString(1, "李四");
		ps.setInt(2, 10);
		ps.execute();
		System.out.println("存入一个 李四的用户");
	}
	
	public void deleteTest(String id) throws SQLException{
		String sql = "delete from user where id = ?";
		PreparedStatement ps = this.connection.prepareStatement(sql);
		ps.setString(1, id);
		ps.execute();
		System.out.println("delete a user whose id is "+id);
	}

}
